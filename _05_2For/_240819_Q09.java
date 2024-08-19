package _05_2For;

public class _240819_Q09 {

	public static void main(String[] args) {

//9. 가장 긴 터널의 알파벳 이름과 갯수를 찾으세요 <이중For사용>
	String ttt ="aabbbcccaaaaddbbbaaaaa";
	int sum = 0;
	int name = 0;
	int aaa = ttt.charAt(0);
	int cnt = 0;
	for(int i = 0; i<ttt.length(); i++) {
		 	if(ttt.charAt(i)==aaa)
		 		cnt++;
//		 	System.out.println(cnt);
		 	else {cnt=1;
		 	aaa=ttt.charAt(i);
		 	}
		 	if(cnt>sum)
		 		cnt=sum;
		 		aaa=name;
	}
	System.out.println(sum);
	System.out.println(name);
	}
}



