package _09Array2_2;

public class _240911_테트리스Q2 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		//테트리스 문제이다
		int tempArr[][] = {{1,1,0},
						   {0,1,0},
						   {0,1,1}};
//		int nowblock[][] = {{0,0,1},
//							{1,1,1},
//							{1,0,0}};
		//2차원 배열인tempArr 이 nowblock으로 바뀌는 코드를 짜세요.
		
		// 문제 2 현재에서 왼쪽 회전하기
	
		for(int i = tempArr.length-1; i >= 0 ; i--) {
			for(int j = 0; j < tempArr[0].length; j++) {
				System.out.print(tempArr[j][i]);
			}System.out.println();
		}
	}
}
