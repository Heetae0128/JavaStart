package _26_dao_semi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import _26_dto_semi.clientDTO;

public class clientDAO {
	private static String username = "system";
	private static String password = "11111111";
	private static String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	private String driverName = "oracle.jdbc.driver.OracleDriver";
	private static Connection conn = null;
	
	
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
	
	public static boolean conn() {
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
	
	public static void insert(clientDTO clientdto) {
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
	
	public boolean login(String c_ID, String c_Pass) {
		if(conn()) {
			try {
	            String sql =  "select * from clienttable where c_id = ? and c_pass = ?";
				PreparedStatement psmt = conn.prepareStatement(sql);
	            psmt.setString(1, c_ID);
	            psmt.setString(2, c_Pass); // 비밀번호는 해시화된 값으로 저장하는 것이 좋음
	            
	            try (ResultSet rs = psmt.executeQuery()) {
	                return rs.next(); // 결과가 존재하면 로그인 성공
	            }
	        } catch (SQLException e) {
	            e.printStackTrace(); // 예외 처리
	        }
	        return false; // 로그인 실패
	    }
		return false;
	}
	
	
	public ArrayList<clientDTO> allInfo(){
		ArrayList<clientDTO> clist = new ArrayList<clientDTO>();
		if(conn()) {
			try {
				String sql = "select * from clienttable";
				PreparedStatement psmt = conn.prepareStatement(sql);
				ResultSet rs = psmt.executeQuery();
				while (rs.next()) {
					clientDTO cTemp = new clientDTO();
					cTemp.setC_ID(rs.getString("c_id"));
					cTemp.setNic(rs.getString("nic"));
					cTemp.setE_Mail(rs.getString("e_mail"));
					cTemp.setC_Name(rs.getString("c_name"));
					cTemp.setC_Pass(rs.getString("c_pass"));
					cTemp.setGender(rs.getString("gender"));
					clist.add(cTemp);
				}
			} catch (SQLException e) {
				// TODO 자동 생성된 catch 블록
				e.printStackTrace();
			}
		}
		return clist;
		
	}
	
	
}


