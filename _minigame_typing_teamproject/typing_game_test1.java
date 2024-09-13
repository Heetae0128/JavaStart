package _minigame_typing_teamproject;

import java.util.Random;
import java.util.Scanner;

public class typing_game_test1 {

    public static void main(String[] args) {
       
        String[] eng = {"apple", "banana", "orange", "total", "blog", "naver", "java",
                        "tutorial", "once", "level", "sort", "english", "power", "link", "guide",
                        "toeic", "book", "national", "price", "download"};
        String[] kor = {"사과", "바나나", "오렌지", "전체", "블로그", "네이버", "자바",
                        "튜토리얼", "한 번", "레벨", "정렬", "영어", "파워", "링크", "가이드",
                        "토익", "도서", "전국", "가격", "다운로드"};

        
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("--------타자 연습 게임--------");
        System.out.println("     1. 영문, 2. 한글 ");
        System.out.println("     번호를 선택해주세요 ");
        System.out.println();
        System.out.println();
        
        int selec = scanner.nextInt();
        int point = 0;
        String[] word = (selec == 1) ? eng : kor;
        int numWord = word.length;
        for (int i = 0; i < 10; i++) {
            String aaa = word[random.nextInt(numWord)];
            System.out.println("   타이핑 할 문제: " + aaa);
            System.out.println("   입력하세요: ");
            String temp = scanner.next();
            if (temp.equals(aaa)) {
            	point+=10;
                System.out.println("      정답입니다!");
                System.out.println("      point :" + point);
                System.out.println();
                System.out.println();
            } else {
                System.out.println("   틀렸습니다. 정답은: " + aaa);
                System.out.println();
                System.out.println();
            }
           
            
        }
        if (point < 80) {
        System.out.println("    재도전하시겠습니까?");
    	System.out.println();
    	System.out.println();	
        // 스캐너 닫기
        scanner.close();
        System.out.println("  ( ͡° ͜ʖ ( ͡° ͜ʖ ( ͡° ͜ʖ ( ͡° ͜ʖ ͡°) ͜ʖ ͡°)ʖ ͡°)ʖ ͡°)");
        }
    }
}
