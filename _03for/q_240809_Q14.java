package _03for;

public class q_240809_Q14 {

	public static void main(String[] args) {
		String ttt = new String("aabbbcccaaaaddbbbaaaaa");
		int cnt = 0;
		char bT = ttt.charAt(0);
		int maxCnt = 0;
		char maxNumber;
		for (int i = 0; i < ttt.length(); i++) {
			if (bT == ttt.charAt(i)) {
				cnt++;
			} else {
				bT = ttt.charAt(i);
				cnt = 1;
			}
			if (maxCnt < cnt) { 
				maxCnt = cnt;
				maxNumber = bT;
			}
		}
		System.out.println(maxCnt + "/" + bT); // 14번 문제 확인

	}

}

	/** 
	 * ttt 참조타입, 기능을 가지고있다, charAt()
	 *  배열 : value 를 하나씩 가져옴
	 * 1. 문자열의 문자를 가져온다. 문자를 첫번째부터 하나씩 가져온다.
	 * 객체는 변수와 메소드로 이루어져있다.
	 */
