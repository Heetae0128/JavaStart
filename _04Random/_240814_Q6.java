package _04Random;

import java.util.Random;

public class _240814_Q6 {

	public static void main(String[] args) {
//		6. 
//		컴퓨터는 랜덤으로 로또 번호를 10000번 뽑는다.
//		가장 많이 뽑힌 로또 번호가 오늘의 추천 로또 번호이다.
//		오늘의 추천 로또 번호 하나를 출력하시오.  만약 로또 번호가 같은 횟수로 나왔을 경우에는 큰 숫자가 우선한다.
		
		Random r1 = new Random();
		int [] lotto = new int [10000];
		
		for(int i = 0; i<lotto.length; i++) {
			int k1 = r1.nextInt(45)+1;
			System.out.println(k1);	
		}
	}
}