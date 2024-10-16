package dto_semi;

public class reviewDTO {
	String r_ID = null;
	String r_Con = null;
	String Thumbs = null;
	String r_Date = null;
	public String getR_ID() {
		return r_ID;
	}
	public void setR_ID(String r_ID) {
		this.r_ID = r_ID;
	}
	public String getR_Con() {
		return r_Con;
	}
	public void setR_Con(String r_Con) {
		this.r_Con = r_Con;
	}
	public String getThumbs() {
		return Thumbs;
	}
	public void setThumbs(String thumbs) {
		Thumbs = thumbs;
	}
	public String getR_Date() {
		return r_Date;
	}
	public void setR_Date(String r_Date) {
		this.r_Date = r_Date;
	}
	@Override
	public String toString() {
		return "reviewDTO [r_ID=" + r_ID + ", r_Con=" + r_Con + ", Thumbs=" + Thumbs + ", r_Date=" + r_Date + "]";
	}
	
	
}
