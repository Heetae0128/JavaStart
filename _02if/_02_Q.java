package _02if;

public class _02_Q {

	public static void main(String[] args) {
		// 문제 1
		double score = 89.2;
		if (score >= 80) {
			System.out.println("합격");
		}else System.out.println("불합격");
		
		// 문제 2
		int level=2;
		int point=30;
		
		if(level == 1) {
			point+=30;
		}else if(level != 1) {
			point+=10;
		}
		
		System.out.println(point);
		
		// 문제 3
		int[] lotto = {6,12,33,4,5,26}; //배열의 값은 바뀔 수 있다.
		lotto[2] = lotto[2] + 80;
		
		// 문제 4
				if (lotto[3]%2 > 0) {
			System.out.println("홀수");
		}else System.out.println("짝수");
		
		// 문제 5
		
		int s = 0;
		if (lotto[0]%2 == 1) {
			s += lotto[0];
		}
		if (lotto[1]%2 == 1) {
			s += lotto[1];
		}
		if (lotto[2]%2 == 1) {
			s += lotto[2];
		}
		if (lotto[3]%2 == 1) {
			s += lotto[3];
		}
		if (lotto[4]%2 == 1) {
			s += lotto[4];
		}
		if (lotto[5]%2 == 1) {
			s += lotto[5];
		}
		System.out.println(s);
		
		// 문제 6
		int[] a = {45,34,64,45,24};
		System.out.println(a[0]+a[1]+a[2]+a[3]+a[4]);
		
		// 문제 7
		int z = 0;
		int w = 0;
		
		if (z < (a[0]/10)+(a[0]%10)) {
			z = (a[0]/10)+(a[0]%10);
			w = 0;
		}
		if (z < (a[2]/10)+(a[2]%10)) {
			z = (a[2]/10)+(a[2]%10);
			w = 1;
		}
		if (z < (a[1]/10)+(a[1]%10)) {
			z = (a[1]/10)+(a[1]%10);
			w = 2;
		}
		
		System.out.println(z);
		
		// up 2
		
		int[] x = {6,5,9};
		int[] y = {4,10,6};
		
		int[] bull = {3,2};
		
		if (x[0]%bull[0] == 0 && y[0]%bull[1] == 0) {
			System.out.println("0번째 새");
		}
		if (x[1]%bull[0] == 0 && y[1]%bull[1] == 0) {
			System.out.println("1번째 새");
		}
		if (x[2]%bull[0] == 0 && y[2]%bull[1] == 0) {
			System.out.println("2번째 새");
		}
		
		
	}

}
