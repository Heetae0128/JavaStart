package _07Array2;

public class _240911_Q5 {

	public static void main(String[] args) {
		int[][]a = new int[4][5];
		int num = 1;
		int garo = a[0].length;
		int sero = a.length;
		
		//배열 값 입력부
//		1   2   3   4   5
//		14  15  16  17  6
//		13  20  19  18  7
//		12  11  10  9   8 
		
		//문제 푸는 곳
		
		
		//배열 값 출력부
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[0].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
		
