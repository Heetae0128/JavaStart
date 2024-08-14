package _04Random;

import java.util.Random;

public class _Q_240814 {

	public static void main(String[] args) {
//		0. 키보드로 숫자 한 개를 입력 받아서 홀짝을 출력하는 프로그램을 작성하세요.
		
	
		 
		// 키보드로 부터 입력받기 위한 객체 만들기.
//		Scanner in =  new Scanner(System.in);
//		
//		System.out.println("한자릿수 숫자를 입력하세요");
//			int k = in.nextInt();	// nextInt는 키보드로 숫자만 가져온다.
//			in.nextLine();	// 버퍼 지우기 
//			if(k%2==0) {
//				System.out.println("짝");
//			}else {System.out.println("홀");
//			}
//	

//
//		1. 키보드로 두 개의 숫자를 입력받아서 합하는 프로그램을 작성하세요.
			
//		Scanner in =  new Scanner(System.in);
//			
//		System.out.println("숫자 두개를 입력하세요.");
//			int k1 = in.nextInt();	// nextInt는 키보드로 숫자만 가져온다.
//			int k2 = in.nextInt();
//			in.nextLine();	// 버퍼 지우기 
//			
//				System.out.println(k1+k2);
//			
//
//
//		2. 행운의 숫자 인지를 판별해 보자
//		   1부터 100까지 숫자 중 랜덤 수를 하나 뽑아서 출력한다.
//		   이 숫자가 7의 배수이면 행운의 숫자, 7의 배수가 아니면 조심해야하는 숫자 입니다.
				
//		Random r = new Random();
//		int k = r.nextInt(99)+1;
//		System.out.println(k);
//		if(k%7 ==0) {
//			System.out.println("행운의 숫자");
//		}else {
//			System.out.println("조심해!");
//		}
//
//		3. 2번 업그레이드, 랜덤 수를 하나 뽑아서 출력한다
//		  7의 배수이면 행운의 숫자, 7의 배수가 아니면 행운의 숫자가 나올 때 까지 계속 뽑는다.
		
//		Random r1 = new Random();
//		
//		for(;;) {
//		int k1 = r1.nextInt(99)+1;
//		int k2 = 0;
//			System.out.println(k1);
//			if(k1%7==0) {
//				System.out.println("행운의 숫자");
//				break;	
//			}else{k2*=k1;}
//			}
//		}
//	}

//		
		
		
//		4. . 숫자 10개를 저장할수 있는 배열을 만들고
//		   0부터 99숫자중 랜덤으로 10개를 뽑습니다.
//		   이중 짝수만 저장하고 홀수는 무시합니다.(다시 뽑지 않습니다.)
//		  0번째 번호 98이라면   0번 인덱스에 저장
//		  1번째 번호 97이라면   무시  1번 인덱스는 선언시 초기값
//		  2번째 번호 88이라면   2번  인덱스에 저장
		
//		int [] temp = new int[10];
//		Random r1 = new Random();
//		
//		for(int i = 0; i<temp.length; i++) {
//			int kk = r1.nextInt(99);
//			temp[i] = kk;
//		}if(temp[0]==98) {
//			temp[0]=98;
//		}else if (temp[1]==97) {
//			temp[1] = 0;
//		}else if (temp[2]==88) {
//			temp[2]=88;
//		}
		
//
//		------------------------------------------
//		Random r = new Random();   //변수이름은 r이며 랜덤한 숫자를 추출하는 기능인 Random이라는 자료형을 선언함
//		int num = r.nextInt(45)+1;     // 변수 r을 참조하여 nextInt 메서드를 호출함. 매개변수는 랜덤한 숫자의 범위를 지정함
//		                                     // 즉 0 - 44까지 중 랜덤한 숫자 하나를 선택하여 리턴함.
//		                                     // 로또 번호는 1-45까지 이므로 리턴값이 +1로 보정함
//		                                     // 리턴값을 보정하여  num변수의 값에 대입
//
//		위 코드를 이용하여
//		5.
//		로또번호를 자동으로 생성하는 게임을 작성하시오.
//		중복허용 가능, 로또 번호 6개를 배열에 저장하고, 출력하시오.
		
//		int [] lotto = new int[6];
//		for(int i=0; i < 6; i++) {
//			lotto[i]=new Random().nextInt(45)+1;
//		}
//		System.out.println(lotto[0] + "/" + lotto[1] + "/" + lotto[2] + "/" + lotto[3] + "/" +
//				lotto[4] + "/" + lotto[5]);
//
//		6. 
//		컴퓨터는 랜덤으로 로또 번호를 10000번 뽑는다.
//		가장 많이 뽑힌 로또 번호가 오늘의 추천 로또 번호이다.
//		오늘의 추천 로또 번호 하나를 출력하시오.  만약 로또 번호가 같은 횟수로 나왔을 경우에는 큰 숫자가 우선한다.
		
		Random r1 = new Random();
		int [] lotto = new int [10000];
		
		for(int i = 0; i<lotto.length; i++) {
			int k1 = r1.nextInt(45)+1;
		}
	}
}
//			
//
//		-------------------------------------------------------
//		7. int jobTime ={40,32,4,16,5,8};
//		위 배열에서 인덱스를 사람의 번호로 가정한다.
//		jobTime[2] 의 의미는 2번 사람이 업무를 마치기 위한 시간이다.
//		작업장을 사용할 수 있는 시간은 최대  4시간이다.
//		작업장은 한 사람만 사용할 수 있고. 사용이 끝나면 작업장을 나와야 하고
//		다음 사람이 작업장을 사용한다. (만약,다음 사람의 업무가 종료 되었다면, 그 다음 사람이 사용이 가능하다)
//		0번 부터 1 2 3 4 5번 순으로 작업장을 사용한다면
//		실제 작업장을 사용한 사람의 기록을 순서대로 출력하시오.
//
//		8.
//		// 배열 저장 변수
//				int[] lotto = new int[6];
//				// 키보드로 부터 입력받기 위한 객체 만들기.
//				Scanner in = new Scanner(System.in); // ctrl shift o
//				// 0번째 번호부터 로또 번호 입력받기
//				for (int i = 0; i < lotto.length; i++) {
//					System.out.println((i + 1) + "번 입력하세요");
//					int k = in.nextInt();  // nextInt는 키보드로 숫자만 가져온다.
//					in.nextLine();  // 버퍼 지우기
//					lotto[i] = k;
//				}
//				// 로또 번호를 출력하는 반복문
//				for (int i = 0; i < lotto.length; i++) {
//					if (i == lotto.length - 1) { // 마지막 번호
//						System.out.println("보너스 : " + lotto[i]);
//					} else {
//						System.out.println(lotto[i]);
//					}
//				}
//
//	}
	
	



