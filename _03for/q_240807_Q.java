package _03for;

import javax.lang.model.type.IntersectionType;
import javax.swing.AbstractCellEditor;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class q_240807_Q {

	public static void main(String[] args) {
		// 문제 1
		for(int i=0; i<5; i++) {
			System.out.println(i);
			// 0,1,2,3,4 도출
		}
		
		// 문제 2
		for(int i=5; i>=0; i--) {
			System.out.println(i);
			// 5,4,3,2,1,0 도출
		}

		// 문제 3
		for(int i=0; i<100; i++) {
			if(i%2==0) {
				System.out.println(i);
				// 0,2,4,6,8 ... 98 도출
			}
		}
		
		// 문제 4
		int sum=0;
		for(int i=0; i<5; i++) {
			sum=sum+1;
		}
		System.out.println(sum);
		// 5 도출
		
		// up 1
		
		//1부터 100까지 숫자 중 홀수는 더하고 짝수는 뺀 결과값 1개를 출력하시오.
		int sumA = 0;
		int sumB = 0;
		int cnt = 0;
		
		for(int i=0; i <= 100; i++) {
			if(i%2 == 0) {
				sumA += i;
			}
			else if(i%2 == 1) {
				sumB += i;
			}
		}
		System.out.println(sumA-sumB);
		
		// up 2
		
		//1부터 100까지 숫자 중 홀수는 홀수끼리 더한 값을 짝수는 짝수끼리 더한 값을 각각출력하시오.
		
		System.out.println("짝수 : " + sumA);
		System.out.println("홀수 : " + sumB);
		
		// up 3
		
		//1부터 100까지 숫자 중 홀수는 모두 몇개인가?
		
		for(int i=0; i <= 100; i++) {
			if(i%2 == 1) {
				cnt++;
			}
		}
		System.out.println(cnt);
		
		// up 4
		
		//100부터 999까지의 숫자의 모든 숫자의 합을 구하시오.
	    //453인 경우 4+5+3로 합한 값의 모든 총합을 구하시오.
		
		int sum1 = 0;
		for(int i=100; i <=999; i++) {
			sum1=sum1+i;
		}
		System.out.println(sum1);
		
		System.out.println((sum1/100000)+(sum1/10000)%10+(sum1/1000)%10+(sum1/100)%10+(sum1/10)%10);
		
		
		
		// up 5
		
		//범인은 100부터 999까지 숫자에 숨어 있다.
		//범인은 십의 자리에 있고. 3의 배수이다. 범인 숫자를 모두 출력하시오.
		
		for(int i=100; i <=999; i++) {
			if(i%3==0)
			System.out.println(i);
		}
		
		System.out.println("---------------");
		
		
		sum = 0;
		int index = -1;
		for (int i=0; i<=100; i++) {
			sum += i;
			if (sum > 44 && index == -1) index = i;
		}
		System.out.println("44를 넘긴수: "+index);
		
		// up 6
		
		//범인을 찾아라. 0부터 100까지 숫자중 하나이다. 0부터 1 2 3 순서대로 합한 값을
		//누적한다. 합한 값이 44를 넘어가게 하는 숫자 한개가 범인이다.
		//범인 숫자 한 개를 출력하시오.. (단, break사용하지 않는다)
		 		
		
		int sum2 = 0;
		int stop = 0;
		
		for(int i=0; i<=100; i++) {
			sum2 = sum2 + i;
			if(sum2>44) {
				
				System.out.println("범인 숫자는 : " + "6번째인" + sum2  );
			}
		}
		
		
		
		// up 7
		
//		System.out.println("abc");  
//		   System.out.println("def"); 
//		   // 위코드를 실행하면
//		   abc
//		   def
//
//		   System.out.print("abc");    // ln이 빠지면 i변수 값을 출력 후 줄바꿈을 하지 않는 코드이다. 
//		   System.out.print("def"); 
//		   // 위코드를 실행하면
//		    abcdef
//
//		   문제>> 다음과 같이 출력하게 하시오.
//		   1+2+3+4+5+6+7+8+9+10=결과값 
		
		
		int sum3 = 0;
		
		for(int i=0; i<10; i++) {
			sum3 = 1 + sum3;
			System.out.print(sum3);
		}
		
		
		
		// up 8
		
//		 피보나치 수열 1
//		 i는 피보나치 수의 갯수이다.   총 8개의 피보나치 수를 구하고 합한 값을
//		 출력하시오. 
//		 
//		i는 1 2 3 4 5 6 7 까지 증가, i가 4일 때 피보나치 수는 3이 된다.
//		int fib=1;  // 파보나치 수   1 1 2 3 5 8 13
//		for(int i=1;i < 8; i++){  // 피보나치 수의 개수 i  
//		   
//		 }
//		 결과 : 1 + 1 + 2 +3 + 5 + 8 + 13 = 합한 값
		

			
//		}
		
		// up 9
		
//		피보나치 수열 2
//		i를 피보나치 수로 정의한다.
//		i의 변화는 1 1 2 3 5 8 13 이 된다.
//		for(int i=1;i < 20; ){  
		
		int bint = 0;
		
		for(int i=1; i<20;) {
			System.out.println(i);
			int temp = i;
			i = bint + i;
			bint = temp;
		}
		// up 10
		
//		987654321이라는 숫자가 있다.. 변수2개와 for문 한개로
//		모든 자릿수를 더한 합을 구하시오.. 9+8+7+6+5+4+3+2+1 = 합
//		합만 출력하면 됩니다.
//		main메서드 안의 라인수를 최소화 하여서 작성하세요. 최소 라인수로 작성하라는 의미입니다.
		
		
		int a = 987654321;
		sum = 0;
		for(;a>0;) {
			sum = sum + a%10;
			a = a/10;
		}
		System.out.println(sum);

		

	}
}
		

