package _11_method;

public class TestMethod {
	//생성자는 눈에 안 보이지만 생략되어 있음
	
	// 이름뒤에 마스킹을 해 주는 메서드 만들기
	// 호출될 때 문자열로 마스킹 문자를 지정하면,
	// 이름뒤에 마스킹 문자를 연결하여 리턴한다.
	// 메서드명은 maskName
	
	// 이름이 김나나 라고 했을때
	// 김나나**로 호출되게 한다.
	
	
	String name = null;
	public String getName2(String pwd) {
		if(pwd.equals("1111")) {
			return name;
		}else {
			return null;
		}
	}
	public void setName(String n) {
		name=n;
	}
	public String getName() {
		return name;
	}
	String nickName = null;
	String masking = "**";
	public String maskName(String nicName) {
		if(nicName.equals("김나나")) {
			return nickName+masking;
		}else {
			return null;
		}
	}
}
