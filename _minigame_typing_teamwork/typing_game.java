package _minigame_typing_teamwork;

import java.lang.runtime.TemplateRuntime;
import java.util.Random;
import java.util.Scanner;

public class typing_game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] eng = {"apple","banana","orange","total","blog","naver","java"
				,"tutorial","once","level","sort","english","power","link","guide"
				,"toeic","book","national","price","download"};
		String[] kor = {"사과","바나나","오렌지","전체","블로그","네이버","자바"
				,"튜토리얼","한 번","레벨","정렬","영어","파워","링크","가이드"
				,"토익","도서","전국","가격","다운로드"};
		int[] aaa = new int[10];
		int alt = 0;
		Random ran = new Random();
		int temp = ran.nextInt(20);
		Scanner in =  new Scanner(System.in);
		System.out.println("--------타자연습게임--------");
		System.out.println("     1.영문 , 2.한글 ");
		System.out.println("     번호를 선택해주세요.");
		String id = in.next();
//		for(int i= 0; i<10; i++) {
//			if(aaa[alt]==0) {
//				aaa[alt]=1;
//				
//			}else {i--;}
//		}
		Random rr = new Random();
		
		System.out.println();
	}
}
