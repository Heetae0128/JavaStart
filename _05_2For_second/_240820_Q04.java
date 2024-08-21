package _05_2For_second;

import java.math.BigDecimal;

public class _240820_Q04 {

	public static void main(String[] args) {
//		4. 
		int[] b = {93,45,83,58,75,56};
//		다음조건에 따라 오름차순으로 정렬하시오.
//		1. 가장큰 값을 찾아서 맨뒤 값과 교환한다.. 결과  {56,45,83,58,75,93}
//		2. 두번째로 큰 값을 찾아서 맨뒤에서 두번째 자리의 값과 교환한다.  결과  {56,45,75,58,83,93}
//		3. 세번째로 큰 값을 찾아서 맨뒤에서 세번째 자리의 값과 교환한다.  결과  {56,45,58,75,83,93}
//		오름차순으로 정렬이 될때 까지 반복한다.
		
		
		
			
		for(int j = 0; j < b.length-1; j++) {
			if(b[j]>b[j+1]) {
				int big = b[j];
				b[j] = b[b.length-1];
				b[b.length-1] = big;
			}else {
				break;
			}
			if(b[j]>b[j+1]) {
			int big2 = b[j];
			b[j] = b[b.length-2];
			b[b.length-2] = big2;
			}else {
				break;
			}
		}
		
		
	}
}
