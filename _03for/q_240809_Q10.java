package _03for;

public class q_240809_Q10 {

	public static void main(String[] args) {
		// 10. int[] arr = {45,23,25,64,3,24,48} 
		//   배열에서 가장 큰 값과 가장 큰 값이 있는 인덱스를 출력하시오.
		   int[] arr = {45,23,25,64,3,24,48};
		   int max = 0;
		   int index = 0;
		   for(int i=0; i<=6; i++) {
			   if(max < arr[i]) { 
				   max = arr[i];
			   	index = i;
			   }
			   
		   }
		   System.out.println("가장 큰값 = "+ max + " 인덱스의 번호 : " + index );
	}

}

	/**
	 * 1. for문작성 i=0 i<arr.length i++
	 * 	  i는 배여의 index 보겠다.
	 * 2. 배열에서 가장큰값 2차! 시나리오 직접 수행
	 * 				   3차! 가장큰값정보필요 (선언문)
	 * 3. i의 value값과 최대값을 저장한 변수와 비교 arr(i)<max 최대값 변경
	 * 
	 * 
	 * 2. int max=0;
	 * 	  int maxIndex=-1;
	 * 1. for(int i=0; i<arr.length; i++)
	 * 3. if(arr[i] < max) {
	 * 		max = arr(i);
	 * }
	 * 		sysout(max);
	 * 		sysout(i)
 	 */
