package _07Array2;

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
