package _07Array2;

public class _240911_Q2 {

	public static void main(String[] args) {
		int[][]a = new int[4][5];
		int num = 1;
		//배열 값 입력부
//		20  19  18  17 16
//		15  14  13  12  11
//		10  9   8   7   6
//		5   4   3   2   1  
		//문제 푸는 곳
		for(int i=0; i<a.length; i++) {
			for(int j=a[0].length -1 ; j>=0; j--) {
				 a[i][j] = num;
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
