package _07Array2;

import java.awt.image.AreaAveragingScaleFilter;

public class _08_Q {

	public static void main(String[] args) {
		
	//8. 위와 같은 게임 배열에서 같은 번호가 가로나 세로로 각각 3개 이상이면 제거가 가능하다.
	//	제거가 가능한 블록의 좌표를 출력하시오.
		
	int	a[][] = {{1,1,0,2},
			     {3,2,1,2},
			     {0,0,3,2},
			     {4,4,4,4},
			     {2,4,3,1},
			     {2,4,1,3}};
	int cnt = 0;
	int temp = a[0][0];
	for(int i = 0; i < a.length; i++) {
		cnt = 0;
		for(int j = 0; j < a[0].length; j++) {
			if(a[i][j]==temp) {
				temp = a[i][j];
				cnt++;
			}
			else {
			temp = a[i][j];
			cnt = 1;
			}
			if(cnt==3) {
					System.out.println(i+"/"+(j-2));
					System.out.println(i+"/"+(j-1));
					System.out.println(i+"/"+j);}
			if(cnt>3) {
				for(int k = 0; k < cnt; k++) {
				System.out.println(i+"/"+(j-k));
				}
			}
			}
		}
	}
	
}
