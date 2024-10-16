package dao_semi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dto_semi.clientDTO;

public class clientDAO {
	private String username = "system";
	private String password = "11111111";
	private String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	private String driverName = "oracle.jdbc.driver.OracleDriver";
	private Connection conn = null;
	ArrayList<clientDTO> cList = new ArrayList<clientDTO>() ;
	
	// 싱글톤 패턴 초기화값
	public static clientDAO fooddao;
	// 싱글톤 패턴 
	public static clientDAO getInstance() {
		if(fooddao == null) {
			fooddao = new clientDAO();
		}
		return fooddao;
	}
	private clientDAO() {
		init();
	}
	
	public void init() {
		try {
			Class.forName(driverName);
			System.out.println("오라클 드라이버 로드 성공");
		} catch (ClassNotFoundException e) {
			// TODO 자동 생성된 catch 블록
			e.printStackTrace();
		}
	}
	
	public boolean conn() {
		try {
			conn = DriverManager.getConnection(url,username,password);
			System.out.println("커넥션 자원 획득 성공");
			return true;	// 커넥션 자원을 정상적으로 획득하게되면 true
		} catch (SQLException e) {
			// TODO 자동 생성된 catch 블록
			e.printStackTrace();
		}
		return false;	// 커넥션 자원을 획득하지 못하면 false
	}
	
	public void insert(clientDTO clientdto) {
		if(conn()) {
			try {
				String sql = "insert into clienttable values (?,?,?,?,?,?)";
				PreparedStatement psmt = conn.prepareStatement(sql);
				psmt.setString(1, clientdto.getC_ID());
				psmt.setString(2, clientdto.getNic());
				psmt.setString(3, clientdto.getE_Mail());
				psmt.setString(4, clientdto.getC_Name());
				psmt.setString(5, clientdto.getC_Pass());
				psmt.setString(6, clientdto.getGender());
				int resultInt = psmt.executeUpdate();
				if(resultInt > 0) {
					conn.commit();
				}else {
					conn.rollback();
				}
						
			} catch (SQLException e) {
				// TODO 자동 생성된 catch 블록
				e.printStackTrace();
			}
		}
	}
	
// 아이디 찾기
	public boolean checkId(String clientId) {
		for (int i = 0; i < cList.size(); i++) {
			if (cList.get(i).getC_ID().equals(clientId)) {
				return true;
			} else if (cList.get(i).getC_ID() == null) {
				return false;
			}
		}
		return false;

	}
	
	//로그인
//	public int login(String cId, String cPass) {
//		String sql = "select c_pass from clienttable where c_id = ?";
//		try {
//			PreparedStatement psmt = conn.prepareStatement(sql);
//			psmt.setString(1, cId);
//			ResultSet rs = psmt.executeQuery();
//			if(rs.next()) {
//				if(rs.getString(1).equals(cPass)) {
//					return 1;
//				}else {
//					return 0;
//				}
//			}
//		} catch (SQLException e) {
//			// TODO 자동 생성된 catch 블록
//			e.printStackTrace();
//		}
//		
//	}
	
//	public void searchID(clientDTO clientdto) {
//		try {
//			String sql = "select c_id from clienttable where c_id = ?";
//			PreparedStatement psmt;
//			psmt = conn.prepareStatement(sql);
//			psmt.setString(1, );
//			ResultSet rs =psmt.executeQuery();
//			if()
//		} catch (SQLException e) {
//			// TODO 자동 생성된 catch 블록
//			e.printStackTrace();
//		}
//	}
	
	public void searchPW(clientDTO clientdto) {
		try {
			String sql = "select c_pass from clienttable where c_pass = ?";
			PreparedStatement psmt;
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, clientdto.getC_Pass());
			int resultInt = psmt.executeUpdate();
			if(resultInt > 0) {
				conn.commit();
			}else {
				conn.rollback();
			}
		} catch (SQLException e) {
			// TODO 자동 생성된 catch 블록
			e.printStackTrace();
		}
	}
	
	
}


