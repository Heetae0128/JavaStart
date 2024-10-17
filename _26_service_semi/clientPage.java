package _26_service_semi;

import java.util.Scanner;

public class clientPage {

	// 싱글톤 패턴 초기화값
	public static clientPage cpage;
	// 싱글톤 패턴 
	public static clientPage getInstance() {
		if(cpage == null) {
			cpage = new clientPage();
		}
		return cpage;
	}
	
	clientPage() {
		
	}
	private myPage mp = myPage.getInstance();

	
	public void menu() {
		Scanner in = new Scanner(System.in);
		boolean flag = true;
		while (true) {
			System.out.println("1. 마이페이지 2. 레시피 검색");
			int selNum = in.nextInt();
			in.nextLine();
			switch(selNum) {
			case 1: mypage(); break;
			case 2: reSearch(); break;
			case 3: flag=false; break;
			}
		}
	}
	
	private void mypage() {
		mp.menu();
	}
	
	private void reSearch() {
		
	}
}
