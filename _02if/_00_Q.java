package _02if;

public class _00_Q {

	public static void main(String[] args) {
		/**Basic
		영수는 게임을 개발중인데,
		명중에 따라 점수를 차등 부여 하는 알고리즘을 개발 중이다.
		int point=20;
		int x=40; // x는 화살의 위치이며 화살의 위치는 달라진다.
		화살의 위치가 0에서 12사이이면 +10점
		13-20 사이이면 +9점
		21-30 사이이면 +8점
		31이상이면 +7점을 부여한다.
		
		up1
		0부터 12사이면 +10점을 획득하고
		0-1 사이이면 보너스 점수를 획득한다. 보너스 점수는 현재 point의 10% 이다.
		 * 
		 */
		// Basic
		int point = 20;
		int x = 0;
		if(x >= 0 && x <= 12) {
			point += 10;
		}else if(x > 13 && x <= 20) {
			point += 9;	
		}else if(x > 21 && x <= 30) {
			point += 8;
		}else if(x >= 31) {
			point += 7;
		}
		System.out.println(point);
		
		// up1
		
		if(x >= 0 && 0 <= 12) {
			if(x >= 0 && x <= 1) {
			point += point*0.1;
			}
			point+=10;
		}else if(x > 13 && x <= 20) {
			point += 9;	
		}else if(x > 21 && x <= 30) {
			point += 8;
		}else if(x >= 31) {
			point += 7;
		}
		System.out.println(point);
		
	}
}

	


