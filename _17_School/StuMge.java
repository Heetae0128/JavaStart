package _17_School;

import java.util.ArrayList;
import java.util.Scanner;

public class StuMge {
	ArrayList<Stu> sTemp = new ArrayList<>(); 
	
	public void menu() {
		while (true) {
			Scanner in =new Scanner(System.in);
			System.out.println("1. 등록");
			System.out.println("2. 삭제");
			System.out.println("3. 전체보기");
			int selNum = in.nextInt();
			Stu sibal = new Stu();
			in.nextLine();
			if(selNum==1) {
				add();
			}else if(selNum==2) {
				delete();
			}else if(selNum==3) {
				sibal.abbbcc();
			}else {
				break;
			}
		}
	}
	
	public void add() {
		Scanner in = new Scanner(System.in);
		Stu temp = new Stu();
		System.out.println("아이디를 입력해주세요.");
		String id = in.nextLine();
		temp.setId(id);
		sTemp.add(temp);
	}
	
	public void delete() {
		Scanner in = new Scanner(System.in);
		System.out.println("삭제하실 정보의 아이디를 입력해주세요.");
		String delId = in.nextLine();
//		for(int i = 0; i < sTemp.size(); i++) {
//			sTemp.get(i).
			
		}
//	}
	
	public void list() {
		
	}
	
	public void search() {
		
	}
}
