package _05_2For;

public class _240819_Q08 {

	public static void main(String[] args) {
//		8.
		int[] pang={1,0,0,0,2,3,4,4,6,2,2,2,2,5};
		
//		-이중 for  사용
//		애니팡 게임의 일부분인다. 게임의 캐릭터는 숫자로 구분한다.
//		가로에 같은 캐릭터가 /3개 이상/이면 제거 대상이다.
//		제거 대상 /캐릭터 번호/와 /갯수/, /시작위치 인덱스/를 모두 출력하시오.
		
		int cnt = 0;
		int boom = pang[0];
		
		for(int i=0; i<pang.length; i++) {
			boom = pang[i];
			cnt = 0;
			for(int j=i; j<pang.length; j++) {
				if(boom == pang[j]) {
					cnt++;
				}else {
					break;
				}
			}
//				System.out.println(pang[i] + "/" + pang[j]);
				if(cnt >= 3) {
					System.out.println(i + "/" + boom + "/" + cnt);
				i += 3-1;
			}
		}
		
		
		
	}
}



