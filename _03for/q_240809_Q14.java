package _03for;

public class q_240809_Q14 {

	public static void main(String[] args) {
	// 14. 가장 긴 터널의 알파벳 이름과 숫자를 찾으세요
		 String ttt ="aabbbcccaaaaddbbbaaaaa";
		 int bt = ttt.charAt(0);
		 int maxCnt = 0;
		 int maxNumber = 0;
		 int cnt = 0;
		 for(int i=0; i < ttt.length(); i++) {
			 char a = ttt.charAt(i);{
			 //System.out.println(a);
				 if(a == bt) {
					 cnt++;
				 }else {
					 cnt = 1;
					 bt = ttt.charAt(i);}
				 if(maxCnt < cnt) {
					 maxCnt = cnt;
					maxNumber=bt;
				 }
			 }
			 System.out.println(maxCnt + "/" + (char)bt);
			 
		 }
	}
}

	/** 
	 * ttt 참조타입, 기능을 가지고있다, charAt()
	 *  배열 : value 를 하나씩 가져옴
	 * 1. 문자열의 문자를 가져온다. 문자를 첫번째부터 하나씩 가져온다.
	 * 객체는 변수와 메소드로 이루어져있다.
	 */
