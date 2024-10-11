package _23_Extends_zoounit;

public class Ti extends Zooinfo{

	@Override  // 선택적으로 재정의
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("닭 한마리 꿀꺽");
	}

	@Override  // 필수적으로 재정의 한 것.
	public void prt() {
		// TODO Auto-generated method stub
		
	}

	
}