package _04Random;

import java.util.Scanner;

public class _240814_Q1 {

	public static void main(String[] args) {
//		1. 키보드로 두 개의 숫자를 입력받아서 합하는 프로그램을 작성하세요.
		
		Scanner in =  new Scanner(System.in);
			
		System.out.println("숫자 두개를 입력하세요.");
			int k1 = in.nextInt();	// nextInt는 키보드로 숫자만 가져온다.
			int k2 = in.nextInt();
			System.out.println(k1+k2);
			in.nextLine();	// 버퍼 지우기 
			
				

	}
}
