package _17_School;

import java.util.Scanner;

public class MainMenu {
	private StuMge stuManager = null;
	private PartMge partManager = null;
	private Login loginManager = null;
	
	MainMenu() {
		init();
		Scanner in = new Scanner(System.in);
		while (true) {
			menu();
			int selNum = in.nextInt();
			in.nextLine();
			if(selNum==1) {
				goStuMge();
			}else if(selNum==2) {
				goPartMge();
			}else if(selNum==3) {
				goLogin();
			}else {
				break;
			}
		}
	}
	
	private void goStuMge() {
		stuManager.menu();
	}
	
	private void goPartMge() {
		partManager.menu();
	}
	
	private void goLogin() {
		stuManager.menu();
	}
	
	private void init() {
		if(stuManager==null) {
			stuManager = new StuMge();
		}
		if(partManager==null) {
			partManager = new PartMge();
		}
	}
	private void menu(){
		System.out.println("1. 학생관리");
		System.out.println("2. 교과목관리");
		System.out.println("3. 로그인");
	}
}
