package _05_2For;

public class _240819_Q08 {

	public static void main(String[] args) {
//		8.
		int[] pang={1,0,0,0,2,3,4,4,6,2,2,2,2,5};
		int boom= pang[0];
		int cnt = 0;
//		-이중 for  사용
//		애니팡 게임의 일부분인다. 게임의 캐릭터는 숫자로 구분한다.
//		가로에 같은 캐릭터가 /3개 이상/이면 제거 대상이다.
//		제거 대상 /캐릭터 번호/와 /갯수/, /시작위치 인덱스/를 모두 출력하시오.
		
		for(int i=0; i<pang.length; i++) {
			for(int j=0; j<7; j++) {
				if(pang[i]==j)
					cnt++;
				else {cnt=1; boom=pang[i];}
//				System.out.print(cnt);
			}
	}
	}
}



