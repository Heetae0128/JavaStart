package miniProject;

import java.util.ArrayList;
import java.util.Scanner;

public class ClearMemMge {
	ArrayList<ClearMemOne> cmemList = new ArrayList<>();
	ClearMemMge(){
	}
	public void menu() {	
		Scanner in = new Scanner(System.in);
		
		while (true) {
			System.out.println("1. 구직완료인원 등록");
			System.out.println("2. 구직완료인원 삭제");
			System.out.println("3. 구직완료인원 수정");
			System.out.println("4. 구직완료인원 전체보기");
			System.out.println("5. 돌아가기");
			int selNum = in.nextInt();
			in.nextLine();
			if(selNum==1) {
				cmAdd();
			}else if(selNum==2) {
				cmDel();
			}else if(selNum==3) {
				cmEdit();
			}else if(selNum==4) {
				cmList();
			}else if(selNum==5) {
				break;
			}
		}
	}
	
	public void cmAdd() {	// 구직완료인사람의 정보를 등록
		Scanner in = new Scanner(System.in);
		ClearMemOne cmo = new ClearMemOne();
		System.out.println("아이디를 입력해주세요.");
		String cmid = in.nextLine();
		int idx =search(cmid);		// 중복 id는 중복될수없지만 이름과 나이는 중복될수 있다.
		if(idx == -1) {
			cmemList.add(cmo);
		}else {
			System.out.println("중복된 id입니다.");
			return ;
		}
		cmo.setCmid(cmid);
		System.out.println("이름을 입력해주세요.");
		String cmname = in.nextLine();
		cmo.setCmname(cmname);
		System.out.println("나이를 입력해주세요.");
		String cmage = in.nextLine();
		cmo.setCmage(cmage);
		
//		idx =search(cmid);		// 중복 id는 중복될수없지만 이름과 나이는 중복될수 있다.
//		if(idx == -1) {
//			cmemList.add(cmo);
//		}else {
//			System.out.println("중복된 id입니다.");
//		}
		cmo=null;
		
		
	}
	public void cmDel() {		// 삭제 메서드
		Scanner in = new Scanner(System.in);
		System.out.println("삭제하실 정보의 id를 입력하세요.");
		String cmid = in.nextLine();
		int idx =search(cmid);
		if(idx!=-1) {
			cmemList.remove(idx);
		}
		
	}
	public void cmEdit() {		// 수정 메서드
		Scanner in = new Scanner(System.in);
		System.out.println("변경하실 정보의 id를 입력해주세요.");
		String cmid = in.nextLine();
		int idx =search(cmid);
		if(idx!=-1) {
			System.out.println("수정하실 나이를 입력해주세요.");
			String cmage = in.nextLine();
			cmemList.get(idx).setCmage(cmage);
		}
	}
	public void cmList() {		// 전체리스트 확인 메서드
		for(ClearMemOne cmo : cmemList) {
			cmo.prt();
		}
	}
	public int search(String cmid) {		// ID 검색 메서드
		for(int i=0; i < cmemList.size(); i++) {
			if(cmemList.get(i).cmid.equals(cmid)) {
				return i;
			}
		}
		return -1;
	}
}
