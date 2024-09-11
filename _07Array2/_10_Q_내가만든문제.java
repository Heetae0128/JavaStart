package _07Array2;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.Random;
import java.util.Scanner;

public class _10_Q_내가만든문제 {

	public static void main(String[] args) {
	//9. 키보드로 좌표를 입력하면, 좌표기준으로 왼쪽 또는 오른쪽으로 3개 이상의 연속된 숫자가
	//		있으면 제거가능 제거 가능이면 제거를 하고, 위에 있는 숫자가 아래로 내려온다.
	//		맨위에 배열은 랜덤수로 채워진다.
		Scanner in = new Scanner(System.in);
		Random r = new Random();
		int k = r.nextInt(3)+1;
		int anypang[][] = {{5,4,2,2,4,4,4,0},
				           {1,2,2,2,2,0,1,3},
				           {3,3,3,0,4,2,5,3},
				           {5,5,5,5,5,0,1,1},
				           {5,0,1,1,1,3,2,3}};
		for(int i = 0; i < anypang.length; i++) {
			for(int j = 0; j < anypang[0].length; j++) {
				System.out.print(anypang[i][j]);
			}System.out.println();
		}
//		System.out.println("좌표를 입력하세요");
//		System.out.println("[x,y]");
//		int a = in.nextInt();
//		int b = in.nextInt();
//		System.out.println(a+","+b);
//		System.out.println(anypang[a][b]);
//		for(int i = 0; i < anypang.length; i++) {
//			for(int j = 0; j < anypang[0].length; j++) {
//				if(anypang[i][j]==anypang[a][b]) {
//					
//				}
//			}
//		}
	}	
}
