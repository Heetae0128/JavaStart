package _08Array2_2;

public class _240911_Q1 {

	public static void main(String[] args) {
		int[][]a = new int[4][5];
		int num = 1;
		//배열 값 입력부
//		17  13  9   5  1
//		18  14  10  6  2
//		19  15  11  7  3
//		20  16  12  8  4
		//문제 푸는 곳
		for(int i=a[0].length-1; i>=0; i--) {
			for(int j=0 ; j<a.length; j++) {
				 a[j][i] = num;
				 num++;
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
