package _04Random;

import java.util.Random;

public class _240814_Q3 {

	public static void main(String[] args) {
//		3. 2번 업그레이드, 랜덤 수를 하나 뽑아서 출력한다
//		  7의 배수이면 행운의 숫자, 7의 배수가 아니면 행운의 숫자가 나올 때 까지 계속 뽑는다.
		
		Random r1 = new Random();
		
		for(;;) {
		int k1 = r1.nextInt(99)+1;
		int k2 = 0;
			System.out.println(k1);
			if(k1%7==0) {
				System.out.println("행운의 숫자");
				break;	
			}else{}
			}
	}
}
