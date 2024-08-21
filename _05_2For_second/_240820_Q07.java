package _05_2For_second;

import java.util.Scanner;

public class _240820_Q07 {

	public static void main(String[] args) {
//		7.
//		키보드로 아이디를 입력 받는다.
//		입력 받은 아이디에 특수문자가 포함되었는지 확인한다. (유효성)
//		특수문자는 String sign="!@#$%^&*"로 정의한다.
//		특수문자가 몇 개 포함되었는지 출력합니다. 
		String sign="!@#$%^&*";
		char word = sign.charAt(0);
		System.out.println(sign);
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("아이디를 입력하세요.");
		String id = in.next();
		int cnt = 0;
		for(int i = 0; i < id.length(); i++) {
			System.out.println(sign.charAt(i));
			if(id.charAt(i) ==word) {
				
			}
		}
		System.out.println("특수문자가 " + cnt + "개 포함되었습니다.");
	}
}