package _21_dto;

public class IdeaDTO {
	String title = null;
	String txt = null;
	String userName = null;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTxt() {
		return txt;
	}
	public void setTxt(String txt) {
		this.txt = txt;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	@Override
	public String toString() {
		return "IdeaDTO [title=" + title + ", txt=" + txt + ", userName=" + userName + "]";
	}
	
	
}
