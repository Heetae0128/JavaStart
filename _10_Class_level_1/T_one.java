package _10_Class_level_1;

public class T_one {
	//private String tNum=null;
	String tNum=null;
	String tTime=null;
	
	public void prt() {
		System.out.println(tNum);
		System.out.println(tTime);
	}
	public String getTnum() {   // 
		return tNum;
	}
	public void setTnum(String a) {
		tNum = a;
	}
	
}