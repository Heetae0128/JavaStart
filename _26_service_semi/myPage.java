package _26_service_semi;

import java.util.Scanner;

import _26_dao_semi.clientDAO;

public class myPage {
	private clientDAO clientdao = clientDAO.getInstance();
	// 싱글톤 패턴 초기화값
	public static myPage mypage;
	// 싱글톤 패턴 
	public static myPage getInstance() {
		if(mypage == null) {
			mypage = new myPage();
		}
		return mypage;
	}
	private myPage() {
	}
	public void menu() {
		System.out.println("마이페이지입니다.");
		Scanner in = new Scanner(System.in);
		boolean flag = true;
		while (true) {
			System.out.println("1. 비밀번호 변경하기 2. 닉네임 변경하기 3. 끝내기");
			int selNum = in.nextInt();
			in.nextLine();
			switch(selNum) {
			case 1: passRe(); break;
			case 2: nicRe(); break;
			case 3: flag=false; break;
			}
		}
	}
	
	private void passRe() {
		
	}
	
	private void nicRe() {
		
	}
}
