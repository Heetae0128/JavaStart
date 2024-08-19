package _03for;

public class q_240809_Q13 {

	public static void main(String[] args) {
	// 13.  
		//	숫자는 터널의 번호이다. 터널의 길이가 가장 긴 숫자와 길이를 출력하시오.
		
		int[] arr = {1,2,3,0,0,0,1,2,2,4,2,2,2,2,2,2,2,0,0,0,0,0,3,3};
		int cnt=0;
		int bt= arr[0];
		int maxLength=0;
		int maxIndex=0;
		
		for(int i=0; i < arr.length; i++) {
			if(arr[i]==bt) {
				cnt++;}
			else {cnt=1;
				bt=arr[i];}
//			System.out.println(i+"/"+cnt);	// A
			if(maxLength<cnt) {
				maxLength=cnt;
				maxIndex=bt;		// B
			}
		}
		System.out.println(maxLength);
		System.out.println(maxIndex);
	}
}

	/** 1. for문으로 배열순회 초기값 i=0; i < arr.length; i++
	 * 	   i는 배열의 index
	 *	A-2. 현재번호 : arr[i] 연속된 터널인지(비교할 변수선언) arr[i]=bt  
	 *  B-3. A에서는 터널카운팅
	 *  	 B에서는 최대길이 판별 길이 갱신 
	 */		   	
		
		