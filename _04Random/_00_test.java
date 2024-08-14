package _04Random;

import java.util.Random;

public class _00_test {

	public static void main(String[] args) {
		// 시나리오.. 랜덤한 숫자를 뽑아서 로또 번호로 저장한다.
		// 로또 번호 저장할 배열
		int[] lotto = new int[6];	// 변수명 길이 index
		// 랜덤한 번호를 호출하기 위한 객체 만들기
		Random r = new Random();	// ctrl+shift+o
		// 랜덤할 번호를 뽑기 위한 반복문
		for(int i=0; i<lotto.length; i++) {
//			System.out.println(lotto[i+1]+ "번째 뽑아");
			//r.nextInt(45)+1; - r변수를 참조하여 nextInt라는 기능을 호출,리턴받은수에 +1을 한다.
			//매개변수는 45 > 조건식은 (i<45)
			int k = r.nextInt(45)+1;
			lotto[i] = k;
		}
		// 코드 번호를 출력하는 반복문
		for(int i=0; i<lotto.length; i++) {
			if(i==lotto.length-1) {
				System.out.println("보너스 : "+lotto[i]);
		}else {
			System.out.println(lotto[i]);}
		}
	}
}

			
			


	


