package _07Array2;

import java.awt.image.AreaAveragingScaleFilter;

public class _06_Q {

	public static void main(String[] args) {
		
		int[][] a = {{1,2,3,4,5},
				     {6,7,8,9,10},
				     {11,12,13,14,15},
				     {16,17,18,19,20},
				     {21,22,23,24,25}};
		
		//6. 2차원 배열의 모든 값을 출력하시오.
//		출력할 때는 행의 번호는 내림차순, 열의번호도 내림차순으로 출력하시오.
		
		//2차원 배열의 모든 값을 출력하시오
		//전체를 조회하여라..
		//for(int i = 0; i < a.length; i++) 
		//for(int j = 0; j < a[0].length; j++)
		//하지만 문제는 행을 내림차순 열을 내림차순으로 출력하라고 한다.
		// 오름차순은 순서대로 크기가 커지는 것
		// 내림차순은 순서대로 크기가 작아지는 것
		// 증감식을 가감식으로 바꾼다
		// 조건식과 초기값이 달라지게 된다 > 초기값은 제일 큰값, 조건식은 큰값부터 작은값까지
		// for(int i = a.length-1; i >= 0; i--) 
		// for(int j = a[0].length-1; j >= 0; j--)
		
		for(int i = a.length-1; i >= 0; i--) {
			for(int j = a[0].length-1; j >= 0; j--) {
				System.out.print(a[i][j]);
			}System.out.println();	
		}
	}
}
