package _22_dto;

public class TempDTO {
	int num = 0;
	String ko = null;
	String eng = null;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getKo() {
		return ko;
	}
	public void setKo(String ko) {
		this.ko = ko;
	}
	public String getEng() {
		return eng;
	}
	public void setEng(String eng) {
		this.eng = eng;
	}
	@Override
	public String toString() {
		return "TempDTO [num=" + num + ", ko=" + ko + ", eng=" + eng + "]";
	}
	
	
}
