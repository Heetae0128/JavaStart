package _10_Class_Ex_level2_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

import _10_Class_mission3.eventOne;

//이벤트 관리 클래스
public class EventAdmin {
	ArrayList<EventOne> mlist = new ArrayList<>();
	
	EventAdmin() {
		//menu();
	}
	public void menu() {
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.println("1.이벤트등록");
			System.out.println("2.이벤트보기");
			System.out.println("9.이전메뉴");
			int num = in.nextInt();
			in.nextLine();
			if(num==1) {
				addEvent();
			}else if(num==2) {
				allListEvent();
			}else if(num ==9) {
				break; // while문 종료
			}
		}
	}
	private void allListEvent() {
		// TODO Auto-generated method stub
		for(int i = 0; i < mlist.size(); i++) {
			mlist.get(i).prt();
		}
//		for(int i=0; i < elist.length; i++) {
//			if(elist[i]!=null) {
//				elist[i].prt();
//			}
//		}
		
	}
	private void addEvent() {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		EventOne temp = new EventOne();
		System.out.println("제목을 입력하세요");
		String title = in.nextLine();
		temp.title=title;
		System.out.println("내용을 입력하세요");
		String memo = in.nextLine();
		temp.memo=memo;
		mlist.add(temp);
//		for(int i=0; i < elist.length; i++) {
//			if(elist[i]==null) {
//				elist[i]=temp;
//				break;
//			}
//		}
		temp=null;
		
	}
}
