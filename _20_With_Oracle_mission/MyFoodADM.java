package _20_With_Oracle_mission;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class MyFoodADM {
	private Connection conn;
	private java.sql.Statement stmt;
	private ResultSet rs;
	
	MyFoodADM(){
		init();
		menu();
	}
	private void menu() {
		while (true) {
			Scanner in = new Scanner(System.in);
			System.out.println("1. 등록");
			System.out.println("2. 전체보기");
			System.out.println("3. 삭제");
			System.out.println("4. 수정");
			int selNum = in.nextInt();
			in.nextLine();
			if(selNum == 1) {
				insert();
			}else if(selNum ==2) {
				select();
			}else if(selNum ==3) {
				delete();
			}else if(selNum ==4) {
				alter();
			}
		}
	}
	
	private void init(){
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버가 로드되었습니다.");
		} catch (ClassNotFoundException e) {
			// TODO 자동 생성된 catch 블록
			e.printStackTrace();
		}
	}
	private void insert(){	
		conn = null;
		MyFoodDTO mfd = new MyFoodDTO();
		mfd.setName("알리오올리오");
		mfd.setType("양식");
		try {
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:orcl",	//주소?
					"system",		//id
					"11111111");	//비번
			System.out.println("자원을 가져왔습니다.");
			String sql = "insert into foodOne values(?,?)";
			// 쿼리문을 커넥션을 통해서 연결
			PreparedStatement pstmt = conn.prepareStatement(sql);
			// 매핑
			pstmt.setString(1, mfd.getName());
			pstmt.setString(2, mfd.getType());
			// 실행후 리턴값 가져오기
			int result = pstmt.executeUpdate();
			if(result == 0) {
				conn.rollback();
			}else {
				conn.commit();
			}
		} catch (SQLException e) {
			// TODO 자동 생성된 catch 블록
			e.printStackTrace();
		}finally {
			if(conn != null) {
				try {conn.close();
				
				}catch (Exception e2) {
	
				}
			}
		}
	}
	private void select() {
		conn = null;
		try {
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:orcl",	//주소?
					"system",		//id
					"11111111");	//비번
			System.out.println("데이터베이스 접속에 성공했습니다.");
			stmt = conn.createStatement();
			System.out.println("객체만들기에 성공했습니다.");
			rs = stmt.executeQuery("select * from foodone");
			while (rs.next()) {
				System.out.println(rs.getString(1)+"\t"+rs.getString(2));
			}
			rs.close();
			stmt.close();
			conn.close();
		} catch (SQLException e) {
				System.out.println("실패.");
				System.out.print("사유 : " + e.getMessage());
		}
	}
	private void delete() {
		conn = null;
		Scanner in = new Scanner(System.in);
		try {
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:orcl",	//주소?
					"system",		//id
					"11111111");
			System.out.println("데이터베이스 접속에 성공했습니다.");
		} catch (SQLException e) {
			// TODO 자동 생성된 catch 블록
			e.printStackTrace();
		}
		int deptno = in.nextInt();
		String sql = "delete from dept"+"where deptno"+deptno;
		stmt = null;
		try {
			stmt = conn.createStatement();
			int result = stmt.executeUpdate(sql);
		}
			catch (SQLException e) {
			// TODO 자동 생성된 catch 블록
			e.printStackTrace();
			}
	}
	private void alter() {
		
	}
}
