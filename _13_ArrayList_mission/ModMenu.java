package _13_ArrayList_mission;

import java.util.ArrayList;
import java.util.Scanner;

public class ModMenu {
	ArrayList<Words> wordList = new ArrayList<>();
	Scanner in = new Scanner(System.in);
	ModMenu(){
		menu();
	}
	
	
	public void menu(){
		while (true) {
			System.out.println("1. 영어단어 추가");
			System.out.println("2. 단어 전체보기");
			System.out.println("3. 단어 삭제하기");
			System.out.println("4. 단어 수정하기");
			System.out.println("5. 종료하기");
			int	selNum = in.nextInt();
			in.nextLine();
			if(selNum==1) {
				add();
			}else if(selNum==2) {
				wList();
			}else if(selNum==3) {
				wDel();
			}else if(selNum==4) {
				wEdit();
			}else if(selNum==5) {
				break;
			}
		}
	}
	
	public void add(){
		Words temp = new Words();
		System.out.println("영어단어를 입력해주세요.");
		String eng = in.nextLine();
		temp.eng = eng;
		System.out.println("뜻을 한국어로 입력해주세요.");
		String kor = in.nextLine();
		temp.kor = kor;
		wordList.add(temp);
		temp = null;
	}
	
	public void wList(){
		for(int i = 0; i < wordList.size(); i++) {
			wordList.get(i).prt();
		}
	}

	public void wDel(){
		
		System.out.println("삭제하실 영어단어를 입력해주세요.");
		String eng = in.nextLine();
		for(int i = 0; i < wordList.size(); i++) {
			if(wordList.get(i).eng.equals(eng)) {
				wordList.remove(i);
			}
		}
	
	}
	public void wEdit(){
//		Words temp = new Words();
		System.out.println("수정하실 영어단어를 입력해주세요.");
		String eng = in.nextLine();
		System.out.println("영어단어와 뜻을 입력해주세요.");
		String engTemp = in.nextLine();
		
		for(int i = 0; i < wordList.size(); i++) {
			if(wordList.get(i).eng.equals(eng)) {
				wordList.get(i).eng=engTemp;
				
				
			}
		}
	}
}
