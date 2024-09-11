package _07Array2;

import java.awt.image.AreaAveragingScaleFilter;

public class _05_Q {

	public static void main(String[] args) {
		
		int[][] a = {{1,2,3,4,5},
				     {6,7,8,9,10},
				     {11,12,13,14,15},
				     {16,17,18,19,20},
				     {21,22,23,24,25}};
		
		// 5. 전체 배열의 값 중 홀수를 0으로 마스킹 하고, 마스킹 된 결과 2차원 배열을 출력하시오
//		출력은
//		0 2 0 4 0
//		6 0 8 0 10
//		이와 같은 패턴으로 모두 출력되어야 한다.
		
		//전체를 조회하고, 
		//for(int i = 0; i < a.length; i++) 
		//for(int j = 0; j < a[0].length; j++)
		//홀수를 찾아서 홀수에 마스킹하여라 
		//if(a[i][j]%2==1) > a[i][j]=0
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[0].length; j++) {
				if(a[i][j]%2==1) {
					a[i][j]=0;
				}System.out.print(a[i][j]+" ");
			}	System.out.println();
		}
	
	}
	
}
