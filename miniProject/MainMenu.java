package miniProject;

import java.awt.Menu;
import java.util.Scanner;

public class MainMenu {
	ClearMemMge cmemMge = null;
	MemMge memMge = null;
	Join join = null;
	Retire retire = null;
	
	
	MainMenu(){
		if(cmemMge==null) {
			cmemMge= new ClearMemMge();
		}
		if(memMge==null) {
			memMge= new MemMge();
		}
		menu();
	}
	
	public void menu(){
		while (true) {	
			Scanner in = new Scanner(System.in);
			System.out.println("1. 구직중 인원관리");
			System.out.println("2. 구직완료 인원관리");
			System.out.println("3. 취업");
			System.out.println("4. 퇴사");
			System.out.println("5. 프로그램 종료");
			int selNum = in.nextInt();
			in.nextLine();
			if(selNum==1) {
				memMge.menu();
			}else if(selNum==2) {
				cmemMge.menu();
			}else if(selNum==3) {
				join.menu();
			}else if(selNum==4) {
				retire.menu();
			}else if(selNum==5) {
				break;
			}
		}	
	}
}
	
