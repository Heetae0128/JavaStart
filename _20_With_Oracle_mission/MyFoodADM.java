package _20_With_Oracle_mission;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MyFoodADM {
	private Connection conn;
	private java.sql.Statement stmt;
	private ResultSet rs;
	
	MyFoodADM(){
		init();
		insert();
		select();
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
//	private void delete() {
//		
//	}
}
