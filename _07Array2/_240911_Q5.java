package _07Array2;

public class _240911_Q5 {

	public static void main(String[] args) {
		int[][]a = new int[4][5];
		int num = 1;
		
		//배열 값 입력부
//		1   2   3   4   5
//		14  15  16  17  6
//		13  20  19  18  7
//		12  11  10  9   8 
		
		
		
		//문제 푸는 곳
		// 소용돌이 모양으로 증가하는 배열이다.
		// 방향으로 행과 열로 표현하면 열++ 행++ 열-- 행--
		//우측으로
		for(int i=0; i<=0; i++) {
			for(int j=0; j<a[0].length; j++) {
				a[i][j]=num;
				num++;
			}
		}
		
//		//아래로
		for(int i=1; i<a.length; i++) {
			for(int j=4; j<=4; j++) {
				a[i][j]=num;
				num++;
			}
		}
		
//		//좌측으로
		for(int i=3; i<=3; i++) {
			for(int j=a[0].length -2 ; j>=0; j--) {
				 a[i][j] = num;
				 num++;
			}
		}
		
		//위로
		for(int i=a.length-2; i>=1; i--) {
			for(int j=0; j<=0; j++) {
				a[i][j] = num;
				num++;
			}
		}
		
		//우측
		for(int i=1; i<=1; i++) {
			for(int j=1; j<4; j++) {
				a[i][j] = num;
				num++;
			}
		}
		//좌측으로
		for(int i=2; i<=2; i++) {
			for(int j=3 ; j>=1; j--) {
				 a[i][j] = num;
				 num++;
			}
		}
		//위의 FOR문을 한개로 만들어보자!
		//......
		//배열 값 출력부
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[0].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
		
