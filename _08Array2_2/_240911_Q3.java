package _08Array2_2;

public class _240911_Q3 {

	public static void main(String[] args) {
		int[][]a = new int[4][5];
		int num = 1;
		//배열 값 입력부
//		1   2   3   4   5
//		10  9   8   7   6
//		11  12  13  14  15
//		20  19  18  17  16  
		//문제 푸는 곳
		//열이 순행하다 다음행을 순행할때 순서가 반대가 된다
		//말 그대로가 아닐까 싶다.
		//첫줄은 똑바로 두번째줄은 반대로 다시 세번째줄은 똑바로 네번째줄은 반대로
		//수열?이 숨어져있다 0 > ++로 1 > --로 2 > ++ 3 > --
		// 나누기연산자? 퍼센트연산자?
		// 퍼센트로 해서 만들어보자
		for(int i=0; i<a.length; i++) {
			if(i%2==0) {
				for(int j=0; j<a[0].length; j++) {
					a[i][j]=num;
					num++;
				}
			}
			else {
				for(int j=a[0].length-1; j>=0; j--) {
					a[i][j]=num;
					num++;
				}
			}
		}
		
		
		
		
		//배열 값 출력부
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[0].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
