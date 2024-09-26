package miniProject;

import java.util.Scanner;

public class Join {
	MemMge m = null;
	ClearMemMge cm = null;
	
	Join(){
		menu();
	}
	Scanner in = new Scanner(System.in);
	public void menu() {
		while (true) {
			System.out.println("1. 취업중인인원 취업완료인원으로 이동");
			System.out.println("2. 끝내기");
			int selNum = in.nextInt();
			in.nextLine();
			if(selNum==1) {
				move();
			}else if(selNum==2) {
				break;
			}
		}
	}
	
	public void move() {
		System.out.println("id를 입력하세요");
		String moveId = in.nextLine();
		
			
		
	}
}
