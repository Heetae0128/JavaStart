package _26_dto_semi;

public class recipeDTO {

	String Re_ID = null;
	String Re_Type = null;
	String Cook_time = null;
	String Report_Date = null;
	String Update_Date = null;
	String Cook_Content = null;
	public String getRe_ID() {
		return Re_ID;
	}
	public void setRe_ID(String re_ID) {
		Re_ID = re_ID;
	}
	public String getRe_Type() {
		return Re_Type;
	}
	public void setRe_Type(String re_Type) {
		Re_Type = re_Type;
	}
	public String getCook_time() {
		return Cook_time;
	}
	public void setCook_time(String cook_time) {
		Cook_time = cook_time;
	}
	public String getReport_Date() {
		return Report_Date;
	}
	public void setReport_Date(String report_Date) {
		Report_Date = report_Date;
	}
	public String getUpdate_Date() {
		return Update_Date;
	}
	public void setUpdate_Date(String update_Date) {
		Update_Date = update_Date;
	}
	public String getCook_Content() {
		return Cook_Content;
	}
	public void setCook_Content(String cook_Content) {
		Cook_Content = cook_Content;
	}
	@Override
	public String toString() {
		return "recipeDTO [Re_ID=" + Re_ID + ", Re_Type=" + Re_Type + ", Cook_time=" + Cook_time + ", Report_Date="
				+ Report_Date + ", Update_Date=" + Update_Date + ", Cook_Content=" + Cook_Content + "]";
	}
	
	
}
