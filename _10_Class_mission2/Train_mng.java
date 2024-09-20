package _10_Class_mission2;

import java.util.Scanner;

import _10_Class_mission.Parking_obj;

public class Train_mng {
	Trains[] T_temp = new Trains[4];
	Scanner in = new Scanner(System.in);
	
	Train_mng(){
		int selNum = 0;
		while(true) {
			menu();		// 메뉴 메서드 호출
			selNum = in.nextInt();
			in.nextLine();
			System.out.println(selNum+"를 선택함");
			if(selNum == 1) {
				add();	// 등록 메서드 호출
			}else if(selNum == 2) {
				allList();	// 전체보기 메서드 호출
			}else if(selNum == 3) {
				edit();	// 수정 메서드 호출
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
		// 순서
		// 새로운 기차시간과 기차번호를 만든다
		// 위의 값을 T_temp 배열에 저장한다.
		Trains trainTemp = new Trains();
		System.out.println("기차 시간을 입력해주세요.");
		trainTemp.go_Time = in.nextLine();
		System.out.println("기차번호를 입력해주세요.");
		trainTemp.t_Num = in.nextLine();
		for(int i=0; i < T_temp.length; i++) {
			if(trainTemp.t_Num == "1111"||trainTemp.t_Num == "3333") {
				trainTemp.trainJ="무궁화";
			}
			if(trainTemp.t_Num == "2222"||trainTemp.t_Num == "4444") {
				trainTemp.trainJ="새마을*";
			}
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
		
		System.out.println("기차번호를 입력해주세요.");
		String temp = in.nextLine();
		for(int i = 0; i < T_temp.length; i++) {
			if(T_temp[i]!=null) {
				if(T_temp[i].t_Num.equals(temp)) {
					System.out.println("수정될 기차시간을 입력해주세요.");
					String new_Time = in.nextLine();
					T_temp[i].go_Time=new_Time;
					break;
				}
			}
		}
	}
	
	
}
