package _08Array2;

public class _02_Q {

	public static void main(String[] args) {
		
		int[][] a = {{1,2,3,4,5},
				     {6,7,8,9,10},
				     {11,12,13,14,15},
				     {16,17,18,19,20},
				     {21,22,23,24,25}};
		// 3. 2차원 배열의 2열의 모든 값을 행의 순서대로 출력하시오
		
		// 문제 해설
		// 2차원 배열의 2열 즉, 행의 배열중 2번째 자리를 말한다.
		// 나열해보자 2,7,12,17,22
		// 머릿속에 잘 들어오지 않는다.
		// 변수 a의 배열의 값을 써서 확인해보자
		// [0][1],[1][1],[2][1],[3][1],[4][1]
		// 1번문제와 다르게 이 문제는 배열의 두번째가 고정이고 첫번째는 조회한다.
		// 
		for(int i=0; i<5; i++) {
			System.out.print(a[i][1]+"/");
		}
		
		
		
		
	}

}
