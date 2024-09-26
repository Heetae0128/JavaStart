package miniProject;

public class MemOne {
	String mname=null;
	String mage=null;
	String mid=null;
	public void prt() {
		System.out.println("id : "+mid);
		System.out.println("이름 : "+mname);
		System.out.println("나이 : "+mage);
		System.out.println("-----------");
	}										
											// 메서드의 매개변수값을 저장하는 저장소!
	public void setmname(String mname) {	// 멤버변수 mname에 만들어진 
		this.mname=mname;					// setmname 메서드의 매개변수 값을 저장
	}
	public void setmage(String mage) {		// 멤버변수 mage에 만들어진 
		this.mage=mage;						// setmage 메서드의 매개변수 값을 저장
	}
	public void setmid(String mid) {		// 멤버변수 mid에 만들어진 
		this.mid=mid;						// setmid 메서드의 매개변수 값을 저장
	}
	
	
											// getm 메서드 시리즈는 
	public String getmname() {				// m 시리즈의 값들을 되돌려준다.
		return mname;
	}
	public String getmage() {
		return mage;
	}
	public String getmid() {
		return mid;
	}
}
