package _21_service;

import java.util.ArrayList;
import java.util.Scanner;

import _21_dao.IdeaDAO;
import _21_dto.IdeaDTO;

public class IdeaMod {
	IdeaDAO ideadao = IdeaDAO.getInstance();
	public void menu(){
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.println("1. 제안");
			System.out.println("2. 수정");
			System.out.println("3. 삭제");
			System.out.println("4. 전체보기");
			System.out.println("5. 검색");
			System.out.println("6. 끝내기");
			int selNum = in.nextInt();
			in.nextLine();
			if(selNum == 1) {
				add();
			}else if(selNum == 2) {
				update();
			}else if(selNum == 3) {
				del();
			}else if(selNum == 4) {
				allList();
			}else if(selNum == 5) {
				search();
			}else{
				break;
			}
		}
	}
	private void add(){
		Scanner in = new Scanner(System.in);
		System.out.println("아이디어 등록");
		System.out.println("작성자의 이름을 입력해주세요.");
		String userName = in.nextLine();
		System.out.println("아이디어의 제목을 입력해주세요.");
		String title = in.nextLine();
		System.out.println("아이디어의 내용을 입력해주세요.");
		String txt = in.nextLine();
		IdeaDTO ideadto = new IdeaDTO();
		ideadto.setUserName(userName);
		ideadto.setTitle(title);
		ideadto.setTxt(txt);
		ideadao.add(ideadto);
	}
	private void update(){
		// 시나리오 작성자는 수정할 수 없음.  
        //작성자를 검색하여 제목과 설명 수정 이때 작성자는 수정 불가
		Scanner in = new Scanner(System.in);
		System.out.println("수정할 아이디어의 작성자를 입력해주세요.");
		String findId = in.nextLine();
		ideadao.selecOne(findId);
		IdeaDTO d = ideadao.selecOne(findId);
		if(d != null) {
			System.out.println("수정하실 아이디어는 다음과 같습니다.");
			System.out.println(d.toString());
		}
		System.out.println("1.제목 수정");
		System.out.println("2.내용 수정");
		int selNum = in.nextInt();
		in.nextLine();
		if(selNum == 1) {
			System.out.println("제목을 수정하세요.");
			String delTitle = in.nextLine();
			d.setTitle(delTitle);
			ideadao.update(d);
		}else if(selNum == 2) {
			System.out.println("내용을 수정하세요.");
			String delTxt = in.nextLine();
			d.setTxt(delTxt);
			ideadao.update(d);
		}else {
			System.out.println("잘 못 입력 하셨습니다.");
			System.out.println("메뉴로 돌아갑니다.");
			return;
		}
	}
	private void del(){
		Scanner in = new Scanner(System.in);
		System.out.println("삭제할 아이디어의 작성자를 입력해주세요.");
		String delId = in.nextLine();
		ideadao.delete(delId);
		
	}
	private void allList(){
		ArrayList<IdeaDTO> d = ideadao.AllList();
		System.out.println(d.size()+" 개의 아이디어가 있습니다.");
		for(IdeaDTO tempd : d) {
			System.out.println(tempd.toString());
		}
	}
	private void search(){
		Scanner in = new Scanner(System.in);
		System.out.println("검색할 작성자를 입력해주세요.");
		String findId  = in.nextLine();
		ideadao.selecOne(findId);
		IdeaDTO d = ideadao.selecOne(findId);
		if(d != null) {
			System.out.println(d.toString());
		}
	}
}
