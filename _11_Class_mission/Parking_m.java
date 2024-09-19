package _11_Class_mission;


import java.awt.Checkbox;
import java.util.Scanner;

public class Parking_m {
	Parking_obj[] userName = new Parking_obj[7];
	int[] carNum = new int[7];
	Scanner in = new Scanner(System.in);
	Parking_m(){
		while(true) {
			System.out.println("주차 관리");
			System.out.println("1. 등록");
			System.out.println("2. 조회");
			System.out.println("3. 전체보기");
			System.out.println("4. 삭제");
			System.out.println("선택 >>");
			int selNum = in.nextInt();
			in.nextLine();
			System.out.println(selNum+"를 선택함");
			if(selNum == 1) {
				add();	// 메서드 호출
			}else if(selNum == 2) {
				check();	// 메서드 호출
			}else if(selNum == 3) {
				allList();	// 메서드 호출
			}else if(selNum == 4) {
				delete();	// 메서드 호출
			}else {
				break;
			}
		}
	}
	public void add() {		// 메서드 정의
		System.out.println("---- 주차 등록 ----");	
		// 주차할 고객명 입력
		Parking_obj parking = new Parking_obj();
		System.out.println("주차하실 고객님의 성함을 입력해주세요.");
		parking.userName = in.nextLine();
		System.out.println("고객님의 차번호를 입력해주세요.");
		parking.carNum = in.nextInt();

		for(int i=0; i < userName.length; i++) {
			if(userName[i]==null) {	
				userName[i]=parking;
				carNum[i]=parking.carNum;
				break;		// 빈칸이 다 차면 브레이크
			}
		}
	}
	
	public void delete() {
		System.out.println("---- 삭제 ----");
		//삭제할 주차번호
		Parking_obj parking = new Parking_obj();
		System.out.println("주차번호를 입력해주세요.(0~6)");
		parking.carNum = in.nextInt();
		for(int i=0; i < userName.length; i++) {
			if(carNum==i) {	
				userName[i]=null;
				carNum[i]=0;
				System.out.println(i+"번이 삭제되었습니다.");
				break;
			}
		}
	}
	
	
	public void check() {	// 메서드 정의
		System.out.println("---- 조회 ----");
		//조회할 주차번호
		Parking_obj parking = new Parking_obj();
		System.out.println("주차번호를 입력해주세요.(0~6)");
		parking.carNum = in.nextInt();
		for(int i=0; i < userName.length; i++) {
			if(i==i) {	
				userName[i].prt();
				break;
			}
		}
	}
	
	public void allList() {		// 메서드 정의
		System.out.println("주차되어있는 차");
		for(int i=0; i < userName.length; i++) {
			if(userName[i]!=null) {
				userName[i].prt();
				System.out.println(i+"번 주차자리");
				
			}
		}

	}
}
	
