package _23_Extends_zoounit;

public abstract class Zooinfo {//추상클래스 , 추상메서드가 있다면 
	                           // 객체를 만들 수 없다
	public String zooName="휴먼동물원";
	public String name = null;
	public int age=1;
	public int kg=10;
	public abstract void prt();   // 추상메서드. 구현되지 않은 상태
	                                // 상속받으면 반드시 오버라이드
	public void eat() {		
	}
	@Override
	public String toString() {
		return "Zooinfo [zooName=" + zooName + ", name=" + name + ", age=" + age + ", kg=" + kg + "]";
	}
	
}