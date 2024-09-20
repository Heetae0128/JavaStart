package _10_Class_mission2;

import java.util.Scanner;

import _10_Class_mission.Parking_obj;

public class Train_mng {
	Trains[] T_temp = new Trains[4];
	Scanner in = new Scanner(System.in);
	Train_mng(){
		while(true) {
			
			int selNum = in.nextInt();
			in.nextLine();
			System.out.println(selNum+"를 선택함");
			if(selNum == 1) {
				add();	// 등록 메서드 호출
			}else if(selNum == 2) {
				allList();	// 조회 메서드 호출
			}else if(selNum == 3) {
				edit();	// 전체보기 메서드 호출
			}else {
				break;
			}
		}
	}
	
	public void menu() {
		System.out.println("메뉴");
		System.out.println("1. 등록");
		System.out.println("2. 전체보기");
		System.out.println("3. 수정");
		System.out.println("선택 >>");
	}
	
	public void add() {		
		System.out.println("---- 기차시간 등록 ----");	
		// 기차번호 , 기차시간을 등록한다.
		Trains trainTemp = new Trains();
		System.out.println("기차 시간을 입력해주세요.");
		trainTemp.go_Time = in.nextLine();
		System.out.println("기차번호를 입력해주세요.");
		trainTemp.t_Num = in.nextLine();
		for(int i=0; i < T_temp.length; i++) {
			if(T_temp[i]==null) {	
				T_temp[i]=trainTemp;
				break;		// 빈칸이 다 차면 브레이크
			}
		}
	}

	public void allList() {		// 메서드 정의
		System.out.println("전체보기");
		for(int i=0; i < T_temp.length; i++) {
			if(T_temp[i]!=null) {
				T_temp[i].prt();
			}
		}
	}
	
	public void edit() {
		Trains trainTemp = new Trains();
		System.out.println("기차번호를 입력해주세요.");
		String temp = in.nextLine();
		System.out.println("수정될 기차시간을 입력해주세요.");
		String temp1 = in.nextLine();
		for(int i = 0; i < allList.length; i++) {
			
		}
	}
}
