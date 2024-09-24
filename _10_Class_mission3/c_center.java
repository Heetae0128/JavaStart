package _10_Class_mission3;

import java.util.Scanner;

public class c_center {
	
	selA selectA = null;
	selB selectB = null;
	
	c_center() {
		if(selectA==null) {
			selectA = new selA();
		}
		if(selectB==null) {
			selectB = new selB();
		}
		menu();
	}
	
	public void menu() {	//메뉴
		Scanner in = new Scanner(System.in);		
		while (true) {
			System.out.println("1. 고객관리");
			System.out.println("2. 이벤트관리");
			System.out.println("-- 번호 입력 --");
			int selNum = in.nextInt();
			in.nextLine();
			if(selNum == 1) {
				selectA.menu();
			}else if(selNum == 2) {
				selectB.menu();
			} 
		}
	}
//	public void selA() {	//고객관리 프로그램 선택
//		new selA();
//
//	}
//	public void selB() {	//이벤트관리 프로그램 선택
//		new selB();		
//		
//	}
}

	
	
	
	
	

