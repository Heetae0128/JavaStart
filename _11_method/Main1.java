package _11_method;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestMethod t = new TestMethod();
		System.out.println(t.name);
		t.setName("hong");
		System.out.println(t.name);
		System.out.println(t.getName());
		
		String resultName = t.getName2("1122");
		if(resultName!=null) {
			System.out.println(resultName);
		}else {
			System.out.println("비번틀림");
		}
		
		String resultName2 = t.maskName("김나나");
		if(resultName2!=null) {
			System.out.println(resultName2);
		}else {
			System.out.println("이름을 제대로 입력해주세요.");
		}
	}

}
