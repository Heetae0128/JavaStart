package _10_Class_mission3;

import java.util.Scanner;

public class selA {
	c_one[] c_list = new c_one[5];
	int c_len = c_list.length;
	Scanner in = new Scanner(System.in);
	
	public selA() {
		
	}
	// 1 클래스 분류
		// 2 의존관계 파악 관련 변수 설정
		// 3 기능 분류
		// 4 기능 디테일
		// 5 시나리오 추가 기능,클래스 추가
	public void menu() {	//메뉴
		System.out.println("1. 고객가입");
		System.out.println("2. 정보보기");
		System.out.println("3. 수정");
		System.out.println("4. 삭제");
		System.out.println("5. 돌아가기");
		System.out.println("-- 번호 입력 --");
		int selNum = 0;
		while (true) {
			
			selNum = in.nextInt();
			in.nextLine();
			if(selNum == 1) {
				cAdd();
			}else if(selNum == 2) {
				cList();
			}else if(selNum == 3) {
				cEdit();
			}else if(selNum == 4) {
				cDel();
			}else if(selNum == 5) {
				turn();
			}
		}
	}
	public void cAdd() {	//고객가입
		c_one temp = new c_one();
		Scanner in = new Scanner(System.in);
		System.out.println("아이디 입력");
		temp.c_Id = in.nextLine();
		System.out.println("이름 입력");
		temp.c_name = in.nextLine();
		for(int i = 0; i < c_len; i++) {
			if(c_list[i]==null) {
				c_list[i]=temp;
				break;
			}
		}
		temp=null;
	}
	public void cList() {	//고객리스트
			for(int i = 0; i < c_len; i++) {
			if(c_list[i]!=null) {
				c_list[i].prt();
			}
		}
	}
	public void cEdit() {	//수정
		System.out.println("이름 입력");
		String editName = in.nextLine();
		for(int i = 0; i < c_len; i++) {
			if(c_list[i]!=null) {
				String cc_name =  c_list[i].getC_name();
				if(cc_name.equals(editName)) {
					System.out.println("수정할 아이디 입력");
					String editId = in.nextLine();
					c_list[i].c_Id=editId;
					break;
				}
			}
		}
	}
	public void cDel() {	//삭제
		System.out.println("삭제할 아이디 입력");
		String delId = in.nextLine();
		for(int i = 0; i < c_len; i++) {
			if(c_list[i]!=null) {
				String cc_id = c_list[i].getC_id();
				if(cc_id.equals(delId)) {
					c_list[i] = null;
					break;
				}
			}
		}
	}
	public void turn() {
		new c_center();
	}
}
