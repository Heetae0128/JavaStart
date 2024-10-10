package _21_dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import _21_dto.FishDTO;

// fishdata table CRUD
public class FishDAO {
	
	private String username = "system";
	private String password = "11111111";
	private String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	private String driverName = "oracle.jdbc.driver.OracleDriver";
	private Connection conn = null;	// 커넥션 자원 변수
	public static FishDAO fishdao = null;	// 자기 자신의 객체 주소 변수
	private FishDAO(){
		init();
	}
	
	public static FishDAO getInstance() {
		if(fishdao == null) {
			fishdao = new FishDAO();
		}
		return fishdao;
	}// 싱글톤 코딩
	
	private void init() {	// 드라이버 로드
		try {
			Class.forName(driverName);
			System.out.println("드라이버가 로드되었습니다.");
		} catch (ClassNotFoundException e) {
			// TODO 자동 생성된 catch 블록
			e.printStackTrace();
		}
	}
	private boolean conn() {	// 커넥션 가져오는 공통 코드를 메서드로 정리
		try {
			conn = DriverManager.getConnection(
				url,	//주소?
				username,		//id
				password);	//비번
		System.out.println("자원을 가져왔습니다.");
		return true;
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return false;	// 커넥션 자원을 획득하지 못한 경우
	}
	
	public FishDTO selecOne(String findId){
		if(conn()) {
			try {
				String sql = "select * from fishdata where id = ?";
				PreparedStatement psmt = conn.prepareStatement(sql);
				psmt.setString(1, findId);
				ResultSet rs = psmt.executeQuery();
				if(rs.next()) {	// 쿼리 결과가 튜플 하나일 경우는 이렇게 해도 됨
								// while 도 가능함
					FishDTO fishTemp = new FishDTO();
					//rs.getString("id") rs가 접근한 튜플에서 id컬럼의 값을 가져옴
					fishTemp.setId(rs.getString("id"));
					fishTemp.setPwd(rs.getString("pwd"));
					fishTemp.setIndate(rs.getString("indate"));
					return fishTemp;
				}
			} catch (Exception e) {				
			} finally {
				if(conn != null) {
					try {
						conn.close();
					}catch (Exception e2) {
					}
				}
			}	//  finally에 conn 자원 반납코드 추가
		}
		return null;
	}
	public void delete(String delId) {
		if(conn()) {
			try {
				String sql = "delete from fishdata where id=?";
				PreparedStatement psmt = conn.prepareStatement(sql);
				psmt.setString(1, delId);
				psmt.executeUpdate();
			} catch (Exception e) {
				// TODO: handle exception
			}finally {
				try {
					if(conn !=null)conn.close();
				}catch(Exception e2) {
				}
			}
		}
	}
	public void update(FishDTO fdto) {
		if(conn()) {
			try {
				String sql  = "update fishdata set pwd=? where id=?";
				PreparedStatement psmt = conn.prepareStatement(sql);
				psmt.setString(1, fdto.getPwd());
				psmt.setString(2, fdto.getId());
				psmt.executeUpdate();
			} catch (Exception e) {
				// TODO: handle exception
			}finally {
				if(conn != null) {
					try {
						conn.close();
						}catch (Exception e2){
					}
				}
			}
		}
	}
	public void add(FishDTO fdto) {
		if(conn()) {
			try {
				String sql = "insert into fishdata values (?,?,default)";
				PreparedStatement psmt = conn.prepareStatement(sql);
				psmt.setString(1, fdto.getId());
				psmt.setString(2, fdto.getPwd());
				//쿼리 실행
//				psmt.executeUpdate();
				//쿼리 실행 후 리턴을 받아서  다음 처리 작업 정의
				int resultInt = psmt.executeUpdate();
				if(resultInt > 0) {
					conn.commit();
				}else {
					conn.rollback();
				}
				} catch (SQLException e) {
				// TODO 자동 생성된 catch 블록
				e.printStackTrace();
				} finally {
					if(conn != null) {
						try {
							conn.close();
						}catch (Exception e2){
					}
				}
			}
		}else {
			System.out.println("데이터베이스 커넥션 실패");
		}
	}
	public ArrayList<FishDTO> selectAll(){
		ArrayList<FishDTO> flist  = new ArrayList<FishDTO>();
		if(conn()) {
			try {
				String sql = "select * from fishdata";
				PreparedStatement psmt = conn.prepareStatement(sql);
				ResultSet rs = psmt.executeQuery();
				//ResultSet은 테이블 형식으로 가져온다고 이해합니다.
				while (rs.next()) {	//next()메서드는 rs에서 참조하는 테이블에서
					// 튜플을 순차적으로 하나씩 접근하는 메서드
					FishDTO fishTemp = new FishDTO();
					//rs.getString("id") rs가 접근한 튜플에서 id컬럼의 값을 가져옴
					fishTemp.setId(rs.getString("id"));
					fishTemp.setPwd(rs.getString("pwd"));
					fishTemp.setIndate(rs.getString("indate"));
					flist.add(fishTemp);
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				if(conn != null) {
					try {
						conn.close();
					}catch (Exception e2) {
					}
				}
			}
		}return flist;
	}
}

