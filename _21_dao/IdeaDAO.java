package _21_dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import _21_dto.IdeaDTO;

public class IdeaDAO {
	
	private String username = "system";
	private String password = "11111111";
	private String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	private String driverName = "oracle.jdbc.driver.OracleDriver";
	public static IdeaDAO ideadao = null;
	private Connection con = null;
	private IdeaDAO() {
		init();
	}
	
	public static IdeaDAO getInstance() {
		if(ideadao == null) {
			ideadao = new IdeaDAO();
		}
		return ideadao;
	}
	
	private void init() {
		try {
			Class.forName(driverName);
			System.out.println("드라이버가 로드되었습니다.");
		} catch (ClassNotFoundException e) {
			// TODO 자동 생성된 catch 블록
			e.printStackTrace();
		}
	}
	
	private boolean con() {
		try {
			con = DriverManager.getConnection(url,username,password);
			System.out.println("자원을 가져왔습니다.");
			return true;
		} catch (SQLException e) {
			// TODO 자동 생성된 catch 블록
			e.printStackTrace();
		}
		return false;
	}
	
	public IdeaDTO selecOne(String findId) {
		try {
			String sql = "select * from goodidea where username = ?";
			PreparedStatement psmt = con.prepareStatement(sql);
			psmt.setString(1, findId);
			ResultSet rs = psmt.executeQuery();
			if(rs.next()) {
				IdeaDTO ideaTemp = new IdeaDTO();
				ideaTemp.setTitle(rs.getString("title"));
				ideaTemp.setTxt(rs.getString("txt"));
				ideaTemp.setUserName(rs.getString("username"));
				return ideaTemp;
			}
		} catch (Exception e) {
		} finally {
			if(con != null) {
				try {
					con.close();
				}catch (Exception e2) {
				}
			}
		}
		return null;
	}
	
	public ArrayList<IdeaDTO> AllList(){
		ArrayList<IdeaDTO> dlist = new ArrayList<IdeaDTO>();
		if(con()){
			try {
				String sql = "select * from goodidea";
				PreparedStatement psmt = con.prepareStatement(sql);
				ResultSet rs = psmt.executeQuery();
				while (rs.next()) {
					IdeaDTO ideaTemp = new IdeaDTO();
					ideaTemp.setTitle(rs.getString("title"));
					ideaTemp.setTxt(rs.getString("txt"));
					ideaTemp.setUserName(rs.getString("username"));
					dlist.add(ideaTemp);
				}
			} catch (Exception e) {
				// TODO: handle exception
			}finally {
				if(con != null) {
					try {
						con.close();
					}catch (Exception e) {
					}
				}
			}
		}
		return dlist;
	}
	
	public void delete (String delId) {
		if(con()) {
			try {
				String sql = "delet from goodidea where id = ?";
				PreparedStatement psmt = con.prepareStatement(sql);
				psmt.setString(1, delId);
				psmt.executeUpdate();
			} catch (Exception e) {
				// TODO: handle exception
			}finally {
				if(con != null) {
					try {con.close();
					}catch (Exception e) {
					}
				}
			}
		}
	}
	
	public void update (IdeaDTO idto) {
		if(con()) {
			try {
				String sql = "update goodidea set title = ? set txt = ? where username = ? ";
				PreparedStatement psmt = con.prepareStatement(sql);
				psmt.setString(1, idto.getTitle());
				psmt.setString(2, idto.getTxt());
				psmt.setString(3, idto.getUserName());
				psmt.executeUpdate();
			} catch (SQLException e) {
				// TODO 자동 생성된 catch 블록
				e.printStackTrace();
			}finally {
				if(con != null) {
					try {con.close();
					}catch (Exception e) {
					}finally {
						if(con != null) {
							try {con.close();
							}catch (Exception e) {
							}
						}
					}
				}
			}
		}
	}
	
	public void add (IdeaDTO idto) {
		if(con()) {
			try {
				String sql = "insert into goodidea values (?,?,?)";
				PreparedStatement psmt = con.prepareStatement(sql);
				psmt.setString(1, idto.getTitle());
				psmt.setString(2, idto.getTxt());
				psmt.setString(3, idto.getUserName());
				int resultInt = psmt.executeUpdate();
				if(resultInt > 0) {
					con.commit();
				}else {
					con.rollback();
				}
			} catch (SQLException e) {
				// TODO 자동 생성된 catch 블록
				e.printStackTrace();
			}finally {
				if(con != null) {
					try {con.close();
					}catch (Exception e) {
					}
				}
			}
		}else {
			System.out.println("데이터베이스 커넥션 실패");
		}
	}
}
