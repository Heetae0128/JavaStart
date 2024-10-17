package _26_dto_semi;

public class adminDTO {
	
	String a_ID = null;
	String a_name = null;
	String a_pass = null;
	public String getA_ID() {
		return a_ID;
	}
	public void setA_ID(String a_ID) {
		this.a_ID = a_ID;
	}
	public String getA_name() {
		return a_name;
	}
	public void setA_name(String a_name) {
		this.a_name = a_name;
	}
	public String getA_pass() {
		return a_pass;
	}
	public void setA_pass(String a_pass) {
		this.a_pass = a_pass;
	}
	@Override
	public String toString() {
		return "adminDTO [a_ID=" + a_ID + ", a_name=" + a_name + ", a_pass=" + a_pass + "]";
	}
	
	
}
