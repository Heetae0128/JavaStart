package _05For2;

public class _00_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i < 5; i++) {
			System.out.println("1="+i+"="+(1*i));
//			시나리오1 : 1단을 모두 출력
//			for문 한개와 sysout으로 출력가능
//			구구단 1단을 4까지 출력하시오
		}
		
		for(int dan=0; dan<5; dan++) {
//			System.out.println(dan);
			for(int i=1; i < 5; i++) {
				System.out.println(dan+"*"+i+"="+(dan*1));
//				시나리오2 : 1~4단 출력
//				for문 안에 for문을 사용하므로서 출력가능
//				구구단 1~4단을 4까지 출력하시오
			}
		}
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 3; j++) {
			System.out.print("*");
			}
			System.out.println();
			
//			문제를 분석후 i를 무엇으로볼것인가 j를 무엇으로 볼것인가 
//			i의 변화에 따라 j가 반복된다
		}
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
		System.out.println();	
		}
		
		int cnt = 0;
		String id="abc*";
		String sgn="*^$"; // 특수문자를 정리
//		문제 ) id에 특수문자가 있는가?
//		1 sgn의 0번 문자부터 찾는다
//		2 id의 0번 문자가 특수문자인가?
		for(int i=0; i<sgn.length(); i++) {
			for(int j=0; j<id.length(); j++) {
				if(sgn.charAt(i)==id.charAt(j))
					cnt++;
			}
		}
		if(cnt>0) {
			System.out.println("특수문자포함");
		}
	}

}
