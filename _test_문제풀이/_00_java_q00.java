package _test_문제풀이;

import _01Array.변수_배열_연산자_answer1;

public class _00_java_q00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int [] numbers= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		 int sum = 0;
	        double answer = 0;
	        for(int i=0; i < numbers.length; i++){
	            if(numbers[i]>sum){
	            	sum += numbers[i];
	            	
	                
//	                System.out.println(sum);
//	                System.out.println(numbers.length);
	            }          
	        }System.out.println(sum/numbers.length);
	}

}
