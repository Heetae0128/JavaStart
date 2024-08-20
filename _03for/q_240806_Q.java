package _03for;

import java.util.Iterator;

public class q_240806_Q {

	public static void main(String[] args) {
		// 문제 1
		int[] a = {30,40,50,55,65};
		//모든 value 값을 출력하시오
		
		for(int i=0; i <5; i++) {
			System.out.println(a[i]);
		}
		
		// 문제 2 for문 수정하여 65 55 50 40 30 의 순서로 만들어라
		
		for(int i=4; i >= 0; i--) {
			System.out.println(a[i]);
		}

		// 문제 2 for문을 수정하여 40 50 55 65 30의 순서로 만들어라
		
		for(int i=1; i <=5; i++) {
			System.out.println(a[i%5]);	// % = 까먹을때쯤 되면 또 다시 나온다.. 잘 써먹어야한다
		}								// <2024.08.08>
		System.out.println("-------------------");
		// 문제 3 배열에서 50이상인 수만 정제해라
		//배열순회를 반복하면서 값의 조건판단후 출력
		for(int i=0; i<5; i++) {
			if(a[i]>=50){
				System.out.println(a[i]);
			}
		}
		System.out.println("-------------------");
		// 문제 4 50점이상 점수를 합하시오
		//int[] a = {30,40,50,55,65};
		
		int sum = 0;
		int cnt = 0;
		
		for(int i=0; i<5; i++) {
			if(a[i]>=50){
				sum += a[i];
			}
		}
		System.out.println(sum);
		
		// 문제 5 평균을 구하시오 단, 50점 이상만
		
		for(int i=0; i<5; i++) {
			if(a[i]>=50){
				cnt++;
			}
		}
		System.out.println((double)sum/cnt);
		
		
		// 문제 6 평균을 구하시오 단, 최저점수를 포함하지마시오
		//int[] a = {30,40,50,55,65};
		
		int min = 1000; 
		int sum1 = 0;
		int cnt1 = 0;
		
		for(int i=0; i<5; i++) {
			if(min > a[i]){
				min = a[i];
			}
			if(min != a[i]){
				sum1 += a[i];
				cnt1++;
			}
		}
		
//		for(int i=0; i<5; i++) {
//			if(min != a[i]){  // 최저점수를 제외하기 위한 식, 위에서 구한 최소값을 제외한 밸류값을 선별하기 위한 식
//				sum1 += a[i]; // 선별된 총 합을 구한다.
//				cnt1++;		  // 갯수를 구한다.
//			}
//		}
	
		System.out.println((double)sum1/cnt1);
		
	}

}
