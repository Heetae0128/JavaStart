package _09Array2_2;

public class _240911_Q5 {

	public static void main(String[] args) {
		int[][]a = new int[4][5];
		int num = 1;
		int rowMin = 0;
		int rowMax = 3;
		int colMin = 0;
		int colMax = 4;
		
		for(int j=0; j < 2; j++) {
			for(int i=colMin+1; i <= colMax; i++) {
				a[rowMin][i]=num++;
			}
			//위 반복문이 완료되었다면 0번행은 채울 필요없다. < 저장되었으니
			//행의 최소값을 증가시킨다.
			
			rowMin++;
			for(int i=rowMin; i <=rowMax; i++) {
				a[i][colMax]=num++;
			}
			colMax--;
			for(int i=colMax; i >= colMin; i--) {
				a[rowMax][i]=num++;
			}
			rowMax--;
			for(int i=rowMax; i >= rowMin; i--) {
				a[i][colMin]=num++;
			}
			colMin++;
		}
		//배열 값 입력부
//		1   2   3   4   5
//		14  15  16  17  6
//		13  20  19  18  7
//		12  11  10  9   8 
		
		//문제 푸는 곳
		// 맨 위에 부분 숫자 채우기
		// 맨 위는 행최소값 0 열 최소값 0 열최대값 4
		// 맨 위(두번째는 행최소값 1 열 최소값 1 열최대값 3)
//		for(int i=colMin; i <= colMax; i++) {
//			a[rowMin][i]=num++;
//		}
		//위 반복문이 완료되었다면 0번행은 채울 필요없다. < 저장되었으니
		//행의 최소값을 증가시킨다.
		
//		rowMin++;
//		for(int i=rowMin; i <=rowMax; i++) {
//			a[i][colMax]=num++;
//		}
//		colMax--;
//		for(int i=colMax; i >= colMin; i--) {
//			a[rowMax][i]=num++;
//		}
//		rowMax--;
//		for(int i=rowMax; i >= rowMin; i--) {
//			a[i][colMin]=num++;
//		}
//		colMin++;
//		
		
	
		//배열 값 출력부
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[0].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
		
