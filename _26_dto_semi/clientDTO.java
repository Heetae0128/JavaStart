package _26_dto_semi;

public class clientDTO {
	
	String c_ID = null;
	String c_Pass = null;
	String e_Mail = null;
	String c_Name = null;
	String Gender = null;
	String Nic = null;
	public String getC_ID() {
		return c_ID;
	}
	public void setC_ID(String c_ID) {
		this.c_ID = c_ID;
	}
	public String getC_Pass() {
		return c_Pass;
	}
	public void setC_Pass(String c_Pass) {
		this.c_Pass = c_Pass;
	}
	public String getE_Mail() {
		return e_Mail;
	}
	public void setE_Mail(String e_Mail) {
		this.e_Mail = e_Mail;
	}
	public String getC_Name() {
		return c_Name;
	}
	public void setC_Name(String c_Name) {
		this.c_Name = c_Name;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getNic() {
		return Nic;
	}
	public void setNic(String nic) {
		Nic = nic;
	}
	@Override
	public String toString() {
		return "clientDTO [c_ID=" + c_ID + ", c_Pass=" + c_Pass + ", e_Mail=" + e_Mail + ", c_Name=" + c_Name
				+ ", Gender=" + Gender + ", Nic=" + Nic + "]";
	}
	
	
}
