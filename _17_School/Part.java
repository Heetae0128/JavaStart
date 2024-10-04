package _17_School;

public class Part {
	private String pName = null;
	private String pRoom = null;
	private String pTeacher = null;
	
	
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getpRoom() {
		return pRoom;
	}
	public void setpRoom(String pRoom) {
		this.pRoom = pRoom;
	}
	public String getpTeacher() {
		return pTeacher;
	}
	public void setpTeacher(String pTeacher) {
		this.pTeacher = pTeacher;
	}
	public void prt() {
		System.out.println("강의명: "+pName);
	}
}
