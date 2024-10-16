package dto_semi;

public class materialDTO {
	
	String m_ID = null;
	String m_Name = null;
	String m_Type = null;
	public String getM_ID() {
		return m_ID;
	}
	public void setM_ID(String m_ID) {
		this.m_ID = m_ID;
	}
	public String getM_Name() {
		return m_Name;
	}
	public void setM_Name(String m_Name) {
		this.m_Name = m_Name;
	}
	public String getM_Type() {
		return m_Type;
	}
	public void setM_Type(String m_Type) {
		this.m_Type = m_Type;
	}
	@Override
	public String toString() {
		return "materialDTO [m_ID=" + m_ID + ", m_Name=" + m_Name + ", m_Type=" + m_Type + "]";
	}
	
	
}
