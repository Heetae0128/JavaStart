package _10_Class_mission3;

import java.util.Scanner;

public class selB {
	eventOne[] e_list = new eventOne[5];
	int e_len = e_list.length;
	Scanner in = new Scanner(System.in);
	
	public selB() {
		
	}
	// 1 클래스 분류
		// 2 의존관계 파악 관련 변수 설정
		// 3 기능 분류
		// 4 기능 디테일
		// 5 시나리오 추가 기능,클래스 추가
	
	public void menu() {	//메뉴
		System.out.println("1. 이벤트등록");
		System.out.println("2. 전체보기");
		System.out.println("3. 돌아가기");
		System.out.println("-- 번호 입력 --");
		int selNum = 0;
		while (true) {
			selNum = in.nextInt();
			in.nextLine();
			if(selNum == 1) {
				addEvent();
			}else if(selNum == 2) {
				eventList();
			}else if(selNum == 3) {
				turn();
			}
		}
	}
	public void addEvent() {	//이벤트추가
		eventOne temp = new eventOne();
		Scanner in = new Scanner(System.in);
		System.out.println("제목 입력");
		temp.title = in.nextLine();
		System.out.println("내용 입력");
		temp.body = in.nextLine();
		for(int i = 0; i < e_len; i++) {
			if(e_list[i]==null) {
				e_list[i]=temp;
				break;
			}
		}
	}
	public void eventList() {	//이벤트리스트
		for(int i = 0; i < e_len; i++) {
			if(e_list[i]!=null) {
				e_list[i].prt();
			}
		}
	}
	public void turn() {
		
		new c_center();
	}
}
