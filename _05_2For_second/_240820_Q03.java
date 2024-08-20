package _05_2For_second;

public class _240820_Q03 {

	public static void main(String[] args) {
//		3. 팩토리얼의 합 구하기 (2중 for로 해결)
//		1부터 10까지 숫자의 각패토리얼의 합을 구하시오
//		예를들어 4의 팩토리얼은  1*2*3*4
//		             5의 팩토리얼은 1*2*3*4*5
		int sum = 0;
		int x = 1;
		for(int i = 1; i <= 10; i++) {
			x = 1;
			for(int j = 1; j <= i; j++) {
				x *= j;		
			}
			sum +=x;
		}
		System.out.println(sum);
	}
}
