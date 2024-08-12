package _03for;

public class q_240808_Q09 {

	public static void main(String[] args) {
// 		up 9
		
//		피보나치 수열 2
//		i를 피보나치 수로 정의한다.
//		i의 변화는 1 1 2 3 5 8 13 이 된다.
//		for(int i=1;i < 20; ){  
		
		int bint = 0;
		int sum = 0;
		
		for(int i=1; i<20;) {
			System.out.println(i);
			int temp = i;
			i = bint + i;
			bint = temp;
		}


	}

}
