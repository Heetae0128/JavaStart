package miniProject;

import java.util.ArrayList;
import java.util.Scanner;

public class MemMge {
	ArrayList<MemOne> memList = new ArrayList<>();
	MemMge(){
	}
	public void menu() {	
		Scanner in = new Scanner(System.in);
		
		while (true) {
			System.out.println("1. 구직중인원 등록");
			System.out.println("2. 구직중인원 삭제");
			System.out.println("3. 구직중인원 수정");
			System.out.println("4. 구직중인원 전체보기");
			System.out.println("5. 돌아가기");
			int selNum = in.nextInt();
			in.nextLine();
			if(selNum==1) {
				mAdd();
			}else if(selNum==2) {
				mDel();
			}else if(selNum==3) {
				mEdit();
			}else if(selNum==4) {
				mList();
			}else if(selNum==5) {
				break;
			}
		}
	}
	
	public void mAdd() {	// 구직중인사람의 정보를 등록
		Scanner in = new Scanner(System.in);
		MemOne mo = new MemOne();
		System.out.println("아이디를 입력해주세요.");
		String mid = in.nextLine();
		mo.setmid(mid);
		System.out.println("이름을 입력해주세요.");
		String mname = in.nextLine();
		mo.setmname(mname);
		System.out.println("나이를 입력해주세요.");
		String mage = in.nextLine();
		mo.setmage(mage);
		
		int idx=search(mid);		// 중복 id는 중복될수없지만 이름과 나이는 중복될수 있다.
		if(idx == -1) {
			memList.add(mo);
		}else {
			System.out.println("중복된 id입니다.");		// 리팩토링
		}											// 중복된게 확인되면 다시 아이디를  
		mo=null;									// 입력하게끔 만들고싶었다.
													// 특정한 상황에서 중복이 안된다.
		
	}
	public void mDel() {		// 삭제 메서드
		Scanner in = new Scanner(System.in);
		System.out.println("삭제하실 정보의 id를 입력하세요.");
		String mid = in.nextLine();
		int idx =search(mid);
		if(idx!=-1) {
			memList.remove(idx);
		}
		
	}
	public void mEdit() {		// 수정 메서드
		Scanner in = new Scanner(System.in);
		System.out.println("변경하실 정보의 id를 입력해주세요.");
		String mid = in.nextLine();
		int idx =search(mid);
		if(idx != -1) {
			System.out.println("수정하실 나이를 입력해주세요.");
			String mage = in.nextLine();
			memList.get(idx).setmage(mage);
		}
	}
	public void mList() {		// 전체리스트 확인 메서드
		for(MemOne mo : memList) {	// 콜론 연산자는 memList를 순차적으로 꺼내서 mo에 입력하는 것이다.
			mo.prt();				// for문 대신 씀
		}
	}
	public int search(String mname) {		// 검색 메서드 - 매개변수의 값이 리스트의 값과 같을때
		for(int i=0; i < memList.size(); i++) {			// 인덱스의 번호가 리턴된다.
			if(memList.get(i).mid.equals(mname)) {
				return i;
			}
		}
		return -1;
	}
}
