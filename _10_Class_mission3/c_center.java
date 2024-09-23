package _10_Class_mission3;

import java.util.Scanner;

public class c_center {
	c_center() {
		int selNum = 0;
		while (true) {
			Scanner in = new Scanner(System.in);
			menu();
			selNum = in.nextInt();
			in.nextLine();
			if(selNum == 1) {
				selA();
			}else if(selNum == 2) {
				selB();
			}
		}
	}
	public void menu() {	//메뉴
		System.out.println("1. 고객관리");
		System.out.println("2. 이벤트관리");
		System.out.println("-- 번호 입력 --");
	}
	public void selA() {	//고객관리 프로그램 선택
		new selA();

	}
	public void selB() {	//이벤트관리 프로그램 선택
		new selB();		
		
	}
}

	
	
	
	
	

