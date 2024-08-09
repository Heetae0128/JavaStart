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
