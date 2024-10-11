package _22_dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import _22_dto.IdeaDTO;
import _22_dto.TempDTO;

public class TempDAO {
	private String username = "system";
	private String password = "11111111";
	private String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	private String driverName = "oracle.jdbc.driver.OracleDriver";
	private Connection conn = null; // 커넥션 자원 변수
	public static TempDAO tempdao=null;
	private TempDAO() {
		init();
	}
	
	private boolean conn() { // 커넥션 가져오는 공통 코드를 메서드로 정의
		try {
			conn = DriverManager.getConnection(url,username,password);
			System.out.println("커넥션 자원 획득 성공");
			return true; // 커넥션 자원을 정상적으로 획득 할시
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false; // 커넥션 자원을 획득하지 못한 경우.
	}
	
	
	public ArrayList<TempDTO> selectAll(){
		ArrayList<TempDTO> tlist = new ArrayList<TempDTO>();
		if(conn()) {
			try {
				String sql="select * from wordlove";
				PreparedStatement psmt = conn.prepareStatement(sql);
				ResultSet rs =psmt.executeQuery();
				//Resultset은 테이블 형식으로 가져온다고 이해합니다.
				while(rs.next()) {  //next()메서드는 rs에서 참조하는 테이블에서
					                // 튜플을 순차적으로 하나씩 접근하는 메서드
					TempDTO tTemp = new TempDTO();
					tTemp.setKo(rs.getString("ko"));
					tTemp.setEng(rs.getString("eng"));
					tlist.add(tTemp);
				}
			} catch (SQLException e) {e.printStackTrace();}
		}		
		return tlist;
	}
	public static TempDAO getInstance(){
		if(tempdao == null) {
			tempdao = new TempDAO();
		}
		return tempdao;
	}
	
	public void init() {
		
	}
}
