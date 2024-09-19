package _09Array2_2;

public class _240911_Q4 {

	public static void main(String[] args) {
		int[][]a = new int[4][5];
		int num = 1;
		
		//배열 값 입력부
//		1   2   4   7   11
//		3   5   8   12  15
//		6   9   13  16  18
//		10  14  17  19  20  
		
		//문제 푸는 곳
		// 다 뜯어 보고 시작한다.
		// [0,0] [0,1] [0,2] [0,3] [0,4] 
		// [1,0] [1,1] [1,2] [1,3] [1,4]
		// [2,0] [2,1] [2,2] [2,3] [2,4] 
		// [3,0] [3,1] [3,2] [3,3] [3,4] 
		// 순서를 보면 [0,0] [0,1] [1,0] [0,2] [1,1] [2,0]
		//			  1     2	  3     4     5     6
		// 법칙을 찾는다.
		// 1일때 x , - , + 를 사용해서..
		// 행과 열의 값이 더해지면
		// 수열이 나온다 1 = 0 
		//			 2,3 = 1
		//			4,5,6 = 2
		// 즉, 행과열이 더해졌을 때 0부터시작하여 7까지(조건? 하지만 7을 어떻게 표현할까..)
		// 총 피라미드모양의 8개의 배열이 만들어진다?(이건 아닌것같다..)
		// 행과 열을 좀 더 집중있게 생각해보자..
		// 
		for(int k = 0; k<8; k++) {
			for(int i = 0; i<a.length; i++) {
				for(int j = 0; j<a[0].length; j++) {
	//				for(int k = 0; k <= 7; k++ ) {
					if(i+j==k) {
						a[i][j]=num;
						num++;
					}
				
//				if(i+j==0) {
//					a[i][j]=num;//1
//					num++;
//				}
//				if(i+j==1) {
//					a[i][j]=num;//2
//					num++;
//				}
//				if(i+j==2) {
//					a[i][j]=num;//3
//					num++;
//				}
//				if(i+j==3) {
//					a[i][j]=num;//4
//					num++;
//				}
//				if(i+j==4) {
//					a[i][j]=num;//5
//					num++;
//				}
//				if(i+j==5) {
//					a[i][j]=num;//5
//					num++;
//				}
//				if(i+j==6) {
//					a[i][j]=num;//5
//					num++;
//				}
//				if(i+j==7) {
//					a[i][j]=num;//5
//					num++;
//				}
				 
//				}
			
				}
			}
		}
//		선생님 풀이
//		for(int i=0; i<8; i++) {
////			System.out.println(i+"번쨰 채우기를 합니다.");
//			int newCol = i;
//			for(int j=0; j<=i; j++) {
//				if(j > 3) break;
//				if(newCol < 5 ) {
////				System.out.println("j<행>"+j+"/열"+newCol);
//					a[j][newCol]=num++;
//				}
//				newCol--;
//				
//			}
//		}
		//배열 값 출력부
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[0].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
			
	}
}
