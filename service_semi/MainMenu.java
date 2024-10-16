package service_semi;

import java.util.Scanner;

import dao_semi.clientDAO;
import dto_semi.clientDTO;

public class MainMenu {
	
	private clientDAO clientdao = clientDAO.getInstance();
	
	public void FoodService(){
	
	}
	
	
	public void menu() {
		System.out.println("오늘 뭐 먹을까?");
		Scanner in = new Scanner(System.in);
		boolean flag = true;
		while (true) {
			System.out.println("1. 로그인 2. 회원가입 3. 끝내기");
			int selNum = in.nextInt();
			in.nextLine();
			switch(selNum) {
//			case 1: login(); break;
//			case 2: join(); break;
			case 3: flag=false; break;
			}
		}
	}
	
//	private void join() {
//		Scanner in = new Scanner(System.in);
//		System.out.println("회원가입 창입니다.");
//		System.out.println("ID를 입력해주세요.");
//		String cID = in.nextLine();
//		boolean id = clientdao.checkId(cID);
//				if(id == false) {
//					System.out.println("중복된 아이디입니다. 다시입력해주세요.");
//					return;
//				}
//		System.out.println("닉네임을 입력해주세요.");
//		String cNIC = in.nextLine();
//		System.out.println("이메일을 입력해주세요.");
//		String cEmail = in.nextLine();
//		System.out.println("이름을 입력해주세요.");
//		String cName = in.nextLine();
//		System.out.println("비밀번호를 입력해주세요.");
//		String cPASS = in.nextLine();
//		System.out.println("성별을 입력해주세요.");
//		System.out.println("입력창에는 남, 여 입력부탁드립니다.");
//		String cGender = in.nextLine();
//		clientDTO cdto = new clientDTO();
//		cdto.setC_ID(cID);
//		cdto.setC_Pass(cPASS);
//		cdto.setC_Name(cName);
//		cdto.setE_Mail(cEmail);
//		cdto.setGender(cGender);
//		cdto.setNic(cNIC);
//		clientdao.insert(cdto);	
//	}
//	
//	private void login(String ) {
//		Scanner in = new Scanner(System.in);
//		System.out.println("회원가입 창입니다.");
//		System.out.println("ID를 입력해주세요.");
//		String cID = in.nextLine();
//		boolean idck = clientdao.checkId(cID);
//		if(idck == true) {
//			System.out.println("비밀번호를 입력해주세요.");
//			String cPASS = in.nextLine();
//			for(int i=0; clientdao.checkId(cID))
//		}else {
//			
//		}
//		clientDTO cdto = new clientDTO();
//		clientPage cp = new clientPage();
//		if(cID.equals(cdto.getC_ID())&&cPASS.equals(cdto.getC_Pass())) {
//			System.out.println("로그인 성공");
//			cp.menu();
//		}else {
//			System.out.println("입력하신 정보가 없습니다.");
//			System.out.println("다시 입력 해주세요.");
//		}
//	}
}
