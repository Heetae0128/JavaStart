package _02if;

public class _01_Q {

	public static void main(String[] args) {
		/**변수 조건 반복

		이름name
		학번classNum
		나이age 
		성적grade
		점수score
		   
		나이변수
		1~100세 

		1~17세까지는 수강신청을 할수 없다.
		System.out.println()

		60점에서 69점까지는 이름뒤 별표


		점수변수
		59아래 F  59>F
		60~69 D  59<D<69
		70~79 C  69<C<79
		80~89 B  79<B<89
		90~100 A  89<A<100

		int score >= 1
		score <= 100*/
		
		int age = 25;
		int score = 65;
		
		if(age >= 1 && age <= 17) {
			System.out.println("수강신청을 할 수 없다.");
		}else if(score < 60) {
			System.out.println("F");
		}else if(score <= 69) {
			System.out.println("D");
		}else if(score <= 79) {
			System.out.println("C");
		}else if(score <= 89) {
			System.out.println("B");
		}else if(score <= 100) {
			System.out.println("A");
		}
		
		int a = 10;
		int b = 20;
		int my = 15;
	
		/**문제 a와 b는 도로의 길이이며 위치이다.
		my는 나의 위치이다
		내가 도로위에 있으면 도로위.. 도로위가 아니라면 도라가 아님이라고 출력하시오
		
		up1
		만약 내가 도로위라면
		a 지점으로부터 5(my위치에 따라 달라짐)만큼 떨어져 있습니다 라고 출력하시오 
		
		up2
		up1에서 현재 my의 위치가 가까운 쪽 기준으로 출력한다
		예를들어 my 18이면 b에 더 가까우니 b에서 부터 2거리 떨어져 있습니다.
		*/
		
		// 문제 1
		if (a - my > 0 || b - my > 0) {
			System.out.println("도로 위");
			}else {
			System.out.println("도로가 아님");
			}
			
		// up1, up2
		if (a - my > 0 || b - my > 0) {
			System.out.println("a지점으로부터 " + ( my - a) + "만큼 떨어져 있습니다.");
			}else {
				System.out.println("b지점으로부터 " + ( my - b) + "만큼 떨어져 있습니다.");
			}
		
		
		
		//up1
		 if( a <= my && my <= b) {
			 System.out.println("도로 위");
		 }else {
			 System.out.println("도로가 아님");
		 }
		//up2
		 if( a <= my && my <= b) {
			 System.out.println("도로 위");
			 int distanceCenter = a+(b-a)/2;
			 System.out.println(distanceCenter);
			 if(my <= distanceCenter) {
				 System.out.println("a로 부터 "+(my-a));
			 }else {
				 System.out.println("b로 부터 "+(b-my));
			 }
		 }else {
			 System.out.println("도로가 아님");
		 }
		
		
		}

	}


