package _05For2;

public class _240819_Q09 {

	public static void main(String[] args) {

//9. 가장 긴 터널의 알파벳 이름과 갯수를 찾으세요 <이중For사용>
//	String ttt ="aabbbcccaaaaddbbbaaaaa";
//	int sum = 0;
//	int name = 0;
//	int aaa = ttt.charAt(0);
//	int cnt = 0;
//	for(int i = 0; i<ttt.length(); i++) {
//		 	if(ttt.charAt(i)==aaa)
//		 		cnt++;
////		 	System.out.println(cnt);
//		 	else {cnt=1;
//		 	aaa=ttt.charAt(i);
//		 	}
//		 	if(cnt>sum)
//		 		cnt=sum;
//		 		aaa=name;
//	}
//	System.out.println(sum);
//	System.out.println(name);
	
	//a중에 가장 긴 a?
	//i는 a문자열의 index
	int	maxCnt = 0; // a 중 가장 긴 길이
	int cnt = 0; // 현재의 길이
	String ttt ="aabbbcccaaaaddbbbaaaaa";
	
	
	for(int i=0; i<ttt.length(); i++) {
		char temp = ttt.charAt(i); cnt=0;
		char bt = ttt.charAt(0);
		char num;
		if(temp == 'a') {
		for(int j=i; j<ttt.length(); j++) {
			if(ttt.charAt(j)!='a') {
			break;
			}else {
			cnt++;
			bt = ttt.charAt(i);
			}
			} // i값 위치를 시작으로 연속된 a의 길이
			if(maxCnt<cnt) {
			maxCnt = cnt;
			num=bt;
			i += cnt-1;
			}
		}
	}
//	가장 긴 터널의 알파벳 이름과 갯수를 찾으세요 <이중For사용>
	ttt ="aabbbcccaaaaddbbbaaaaa";
	char nowNumber=ttt.charAt(0);
	char maxNumber=ttt.charAt(0);
	maxCnt=0;
	cnt=0;
	for(int i=0; i < ttt.length(); i++) {
		nowNumber=ttt.charAt(i);
		cnt=0;
		for(int j=i; j < ttt.length(); j++) {
			if(nowNumber == ttt.charAt(j)) {
				cnt++;
			}else {
				break;
			}
		}
		if(cnt >= maxCnt) {
			maxNumber = nowNumber;
			maxCnt=cnt;
		}			
		i += cnt-1;
	}
	System.out.println(maxNumber+"/"+maxCnt);
	}
}



