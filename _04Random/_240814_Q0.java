package _04Random;

import java.util.Scanner;

public class _240814_Q0 {

	public static void main(String[] args) {
//		0. 키보드로 숫자 한 개를 입력 받아서 홀짝을 출력하는 프로그램을 작성하세요.
		
		
		 
		// 키보드로 부터 입력받기 위한 객체 만들기.
		Scanner in =  new Scanner(System.in);
		
		System.out.println("한자릿수 숫자를 입력하세요");
			int k = in.nextInt();	// nextInt는 키보드로 숫자만 가져온다.
			in.nextLine();	// 버퍼 지우기 
			if(k%2==0) {
				System.out.println("짝");
			}else {System.out.println("홀");
			}

	}
}
