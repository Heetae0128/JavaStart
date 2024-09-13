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
		
		// 2차원 배열을 값을 저장하는 코드
		for(int i=a[0].length-1; i>=0; i--) {
			for(int j=0 ; j<a.length; j++) {
				 a[j][i] = num;
				 num++;
				 
				 //요일에서 일이 먼저 반복되고 일은 다시 시간으로 반복된다.
				 // 일을 ... 열로보고, 시간을 행으로 본다.
				 // 열이 i가 되고 행이 j가 된다.
			}
		}
		
		
		//배열 값 출력부
		
		//2차원 배열 a의 값을 0번행부터 모두 출력하시오.
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[0].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
