package _03for;

public class q_240809_Q12 {

	public static void main(String[] args) {
	// 12. 
		int[] arr = {1,2,3,0,0,0,1,2,3,4,5,2,2,2,2,0,0,0,0,0,0,0};
	//	   0은 터널이다. 가장 긴 터널의 길이를 구하시오.
		
		int cnt=0;
		int maxLength=0;
		
		for(int i=0; i < arr.length; i++) {
			//System.out.println("현재 번호 : " + arr[i]);
			if(arr[i]==0) {
				cnt++;
			}else{cnt=0;} 		// 여기까지 A
			if(cnt>maxLength) {
				maxLength = cnt;	// 여기까지 B
			}
		}
		System.out.println(maxLength);
	}
}

	/** 1. for문으로 배열순회 초기값 i=0; i < arr.length; i++
	 * 	   i는 배열의 index
	 *	A-2. 현재번호 : arr[i] 터널인지 아닌지 판단을 코드로! arr[i] ==0
	 *	   참일경우 카운팅 > 변수			거짓일경우 카운팅 > 초기화
	 *  B-3. A에서는 터널카운팅
	 *  	 B에서는 최대길이 판별
	 */		   	