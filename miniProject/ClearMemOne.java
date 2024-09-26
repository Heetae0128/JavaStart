package miniProject;

public class ClearMemOne {
	String cmname=null;
	String cmage=null;
	String cmid=null;
	
	public void prt() {
		System.out.println("id : "+cmid);
		System.out.println("이름 : "+cmname);
		System.out.println("나이 : "+cmage);
		System.out.println("-----------");
	}
	public void setCmname(String cmname) {
		this.cmname=cmname;
	}
	public void setCmage(String cmage) {
		this.cmage=cmage;
	}
	public void setCmid(String cmid) {
		this.cmid=cmid;
	}
	
	public String getCmname() {
		return cmname;
	}
	public String getCmage() {
		return cmage;
	}
	public String getCmid() {
		return cmid;
	}
}
