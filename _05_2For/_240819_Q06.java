package _05_2For;

public class _240819_Q06 {

	public static void main(String[] args) {
//		6.
		int[] a ={34,55,23,56,34,45,34};
		int[] b ={36,49};
//		b배열의 값보다 큰 값이 a 배열의 값에 모두 몇개가 있는가?
//		각각 카운팅 하시오 
//		출력은
//		 a 배열의 값에는  36번호 보다 큰 숫자가 ?? 개 있습니다.
//		 a 배열의 값에는  49번호 보다 큰 숫자가 ?? 개 있습니다.
		int cnt1 = 0;
		int cnt2 = 0;
		for(int i=0; i<b.length; i++) {
			for(int j=0; j<a.length; j++) {
				if(a[j]>b[0]) {
					cnt1++;
				}
				if(a[j]>b[1]) {
					cnt2++;
				}
			}
		}
		System.out.println("a 배열의 값에는  36번호 보다 큰 숫자가 "+ cnt1 +"개 있습니다.");
		System.out.println("a 배열의 값에는  49번호 보다 큰 숫자가 "+ cnt2 +"개 있습니다.");
	}

}
