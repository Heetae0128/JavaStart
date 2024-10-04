package _17_School;

import java.util.ArrayList;
import java.util.Scanner;

public class PartMge {
	private ArrayList<Part> pTemp= new ArrayList<>(); 
	
	
	
	public void menu() {
		while (true) {
			Scanner in =new Scanner(System.in);
			System.out.println("1. 등록");
			System.out.println("2. 전체보기");
			int selNum = in.nextInt();
			in.nextLine();
			if(selNum==1) {
				add();
			}else if(selNum==2) {
				list();
			}else {
				break;
			}
		}
	}
	
	public void add() {
		Scanner in = new Scanner(System.in);
		Part temp = new Part();
		System.out.println("과목명을 입력해주세요.");
		String partName = in.nextLine();
		temp.setpName(partName);
		pTemp.add(temp);
	}
	public void list() {
		for(int i = 0; i < pTemp.size(); i++) {
			pTemp.get(i).prt();	
		}	
	}
}
