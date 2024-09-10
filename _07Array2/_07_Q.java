package _07Array2;

import java.awt.image.AreaAveragingScaleFilter;

public class _07_Q {

	public static void main(String[] args) {
		

		//7. 위와 같은 게임 배열에서 같은 번호가 세로로 연ㅅ호 3개 이상이면 제거가 가능하다.
		//	 제거가 가능한 블록의 좌표를 출력하시오.
		
		int	a[][] = {{1,1,0,2},
				     {3,2,1,2},
				     {0,0,3,2},
				     {4,4,4,4},
				     {2,4,3,1},
				     {2,4,1,3}};
		int cnt = 0;
		int temp = a[0][0];
		for(int i = 0; i < a[0].length; i++) {
			cnt = 0;
			for(int j = 0; j < a.length; j++) {
				if(a[j][i]==temp) {
					temp = a[j][i];
					cnt++;
				}
				else {
				temp = a[j][i];
				cnt = 1;
				}
				if(cnt>=3) {
						System.out.println(j+"/"+i);
						System.out.println(j-1+"/"+i);
						System.out.println(j-2+"/"+i);
				}
			}
		}
	}
}
