package _03for;

import java.security.InvalidKeyException;
import java.util.Random;

public class q_240812_Q {

	public static void main(String[] args) {
		// 0 선택받은너
		int[] letter={8,12,4,13,2,14,4,5};
		//짝수만 출력하시오.
		for(int i=0; i<7; i++) {
			if(letter[i]%2==0)
				System.out.println(letter[i]);
		}
		System.out.println("<---------------0--------------->");
		//1 큰놈
		int[] letter1={8,12,4,13,2,14,4,5};
		//배열의 가장 큰수가 있는 인덱스를 출력하시오.
		int max = 0;
		for(int i=0; i<7; i++) {
			if(letter1[i] > max)
				max = letter1[i];
		}
		System.out.println(max);
		
		System.out.println("<---------------1--------------->");
		

//		2 현상수배
		int[] letter2={8,12,4,13,25,14,4,5};
//		범인을찾으시오
//		범인은 짝수이면서 가장큰 값이다. 
//		범인은 14입니다. 
		max = 0;
		for(int i=0; i<7; i++) {
			if(letter2[i]%2==0 && letter2[i]>max)
				max = letter2[i];
		}
		System.out.println(max);
				
				
		System.out.println("<---------------2--------------->");
//
//		3 비밀편지
		String word ="gehoudfkimjnlvy";
		int[] letter3={8,12,3,13,1,14,3,4};
		
		
//		letter  배열은 word문자열 알파벳의 위치이다.
//		letter배열의 암호를 풀어서 편지의 내용을 출력하시오. 
		for(int i=0; i<letter3.length; i++) {
			System.out.println(word.charAt(letter3[i]));
		}
			
		System.out.println("<---------------3--------------->");
//
//		4 난건물주
		int[] arr = {1,0,0,0,1,1,1,0,0,0,0,1,1,1,1,0,0,0,1};
		int size=2;
//		arr 배열에서 0이 의미하는 것은 공터이다. 
//		size는 건물의 크기 이다. 건물은 하나만 짓는다. 공터는 연속적으로 있어야 한다. 
//		size 설정값에 따라 공터에 건물을 지을 수 있는 위치는 모두 몇개인가?
//		size가 2일경우에 7개이다. 
		int cnt = 0;
		int sizeCnt = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i]==0) {
				cnt++;
			}else{cnt=0;
			}if(cnt >= size) {
				sizeCnt++;
			}
		}
		System.out.println("size가 " + size + "일 때 " + sizeCnt + "개이다.");
		
		System.out.println("<---------------4--------------->");
//
//		5. 앞뒤가똑같은너
//		키보드로 문자를 입력받는다. 
//		문자로 입력 받는 방법은 
//		Scanner in = new Scanner(System.in);
//		String a  = in.nextLine();     //숫자는  nextInt(), 문자열을 nextLine() 메서드를 사용한다. 
//		이때 문자열의 길이는 0보다 크고 10보다 작으며 짝수만 가능하다.
//		조건에 만족될때까지 문자 입력을 받는다.
//		문자열을 앞으로 읽으나 뒤로 읽으나 같은 경우의 문자를 판별하는 코드를 작성하세요
//
		System.out.println("<---------------5--------------->");
		
//		6
		
//		수식을 계산하는 프로그램을 작성하세요.
//		수식 계산 규칙은 연산자 우선순위 없이 앞에서 부터 차례대로 계산한다.
//		지금까지 공부한 내용으로 해결하시고, 형변환만 검색이 가능합니다. 
//		메서드는 최대한 적게 사용하세요
//		
		String a ="23-56+45*2-56";
		
		for(int i=0; i<a.length(); i++) {
		
		char aaa = a.charAt(i);
		int b = Integer.valueOf(aaa);
		System.out.println(b);
		}
			
		
		
		System.out.println("<---------------6--------------->");
		
//
//		-------------------------------------------------------------------------------
//		[7번 , 8번 문제 배열 제시]
//		int[]aa= {34,2,35,8,31,45};
//		최대값을 구하는 문제에서
//		철수는 변수를 사용하지 않고 배열만 이용하여 푸는 방법을 생각하였다. 
//
//		7
//		철수는 배열의 0번 인덱스부터 순회한다.
//		0번 인덱스에서는 0번인덱스와 그 다음 인덱스를 비교하여 큰 수를 뒤로 배치한다.
//		이러한 방식으로 배열의 뒤까지 반복하면 맨 뒤에 가장 큰 수가 배치 될 것이다.
//		위와 같은 방식으로 가장큰 수를 구하시오.
		
		
		
				int[] a11 = {34,2,100,8,31,45};
				for(int i=0; i<a11.length-1; i++) {
					if(a11[i]>a11[i+1]) {
						int temp=a11[i];
						a11[i]=a11[i+1];
						a11[i+1]=temp;
					}
				}
				System.out.println(a11[a11.length-1]);
		
		System.out.println("<---------------7--------------->");
			
			
			
			
		
//
//		8
//		철수는 배열의 0번 인덱스에 가장 큰 값을 저장하면 될 것이라고 생각한다.
//		0번 인덱스가 가장 큰 값이라고 정의하고 1번부터 마지막까지 순회하면서
//		가장 큰 값이 나오면 가장 큰 값을 갱신한다.
//		위와 같은 방식으로 가장 큰 수를 구하시오.
//			for(int i = 1; i < 6; i++) {
//				if(aa[i] > aa[i+1]) {
//					aa[i]=aa[i+1];
//				}
//				else if (aa[0]==aa[i]) {
//					
//				}
//			}
//			System.out.println(aa[0]);
//			System.out.println("<----------------8-------------->");
		
//
//		----------------------------------------------------------------------------------------------
//		[9번 - 12번까지 문제 제시]
//		Random이라는 클래스로 객체를 만들어서 r이라는 참조변수로 참조해서 사용해 보자~
//		Random r = new Random();  
//		int num = r.nextInt(45)+1;     // 변수 r을 참조하여 nextInt 메서드를 호출함. 매개변수는 랜덤한 숫자의 범위를 지정함
//		                                     // 즉 0 - 44까지 중 랜덤한 숫자 하나를 선택하여 리턴함.
//		                                     // 로또 번호는 1-45까지 이므로 리턴값이 +1로 보정함
//		                                     // 리턴값을 보정하여  num변수의 값에 대입
		
//
//		위 코드를 이용하여
		
//		9
//		로또번호를 자동으로 생성하는 게임을 작성하시오.
//		중복허용 가능, 로또 번호 6개를 배열에 저장하고, 출력하시오.
			
			int [] lotto = new int[6];
			for(int i=0; i < 6; i++) {
				lotto[i]=new Random().nextInt(45)+1;
			}
			System.out.println(lotto[0] + "/" + lotto[1] + "/" + lotto[2] + "/" + lotto[3] + "/" +
					lotto[4] + "/" + lotto[5]);
			
			System.out.println("<---------------9--------------->");
		
		
//		10
//		4번에서 중복이 되지 않게 하시오...  이때 for문은 한 개만 사용
		
			lotto = new int[6];
			for(int i=0; i < 6; i++) {
				lotto[i]=new Random().nextInt(45)+1;
				if(lotto[3] == lotto[0]) {
					lotto[3] = lotto[i];
					}
				else if(lotto[3] == lotto[1]) {
						lotto[3] = lotto[i];
						}
				else if(lotto[3] == lotto[2]) {
							lotto[3] = lotto[i];
						}
				else if(lotto[3] == lotto[4]) {
					lotto[3] = lotto[i];
				}
				else {lotto[3] = lotto[i];
				}
				System.out.println(lotto[i]);
			}
			
		/**
		 * FOR문은 9번과 동일 
		 * 6개의 랜덤한 숫자중 4번에서 중복이 되지 않게하려면
		 * 나머지 인덱스번호 0,1,2,4,5 와 IF문에서 비교하여
		 * 새로 뽑는 조건식을 짠다.? 
		 */
			
			System.out.println("<---------------10--------------->");
			
//
//		11
//		컴퓨터는 랜덤으로 번호를 먼저 뽑고, 키보드로 사용자가 번호를 입력하는 방식으로 가위 바위 보 게임을 작성하시오
//
			
			System.out.println("<---------------11--------------->");

			
//		12
//		컴퓨터는 랜덤으로 로또 번호를 10000번 뽑는다.
//		가장 많이 뽑힌 로또 번호가 오늘의 추천 로또 번호이다.
//		오늘의 추천 로또 번호 하나를 출력하시오.  만약 로또 번호가 같은 횟수로 나왔을 경우에는 큰 숫자가 우선한다.
//
//
			System.out.println("<---------------12--------------->");
			
//
//		특별1
		String temp = "6/4/3/2/5/1/4/5/6/7/8/9/1/2/3/4/5/6";
//		문자열 a는 한자릿수의 숫자를 수집한 문자열이다.
//		숫자별로 수집된 수만큼 카운팅하세요.
//		카운팅 배열은
		int[] aC = new int[10]; 
		int cntNum = 0;
//		// 위 선언문은 길이 10의 배열을 생성한 선언문이다. 초기값은 0이다. -A
//		// 인덱스 0 - 9까지를 숫자로 정의한다.
//		조건 : 형변환은 사용하지 않는다. 메서드는  charAt()만 사용한다. 
			
		
			
			/**
			 * FOR문의 초기값 범위 증감식은 A이고,
			 * 문제는 aA의 문자열을 charAt 메소드를 사용하여 
			 * 정수로 바꾼뒤 슬래쉬를 변수로 상쇄하여 IF문의 비교식을 
			 * 써서 카운트한다? 배열에 저장한다?
			 */
			
			System.out.println("<---------------특1--------------->");
//
//
//		특별2
//		 String a ="67/414/1/23/32/45/54/12/11/232"
//		문자열 a는 해충에 대한 숫자를 카운팅한 결과이다.
//		해충의 갯수를 모두 합하시오.
//		charAt() 메서드만 사용이 가능하다. 
//		형변환이 필요하면 검색하여 사용하시오.


	}
}



