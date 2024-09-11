package _07Array2;

public class _04_Q {

	public static void main(String[] args) {
		
		int[][] a = {{1,2,3,4,5},
				     {6,7,8,9,10},
				     {11,12,13,14,15},
				     {16,17,18,19,20},
				     {21,22,23,24,25}};
		
		int cnt = 0;  // 카운트 할 변수
		//4. 전체 배열의 값 중 짝수는 모두 몇 개인가?
		
		// 전체 배열의 값  >  즉 전체를 조회하며 값을 확인한다.
		//for(int i = 0; i < a.length; i++) 
		//for(int j = 0; j < a[0].length; j++) 
		//System.out.print(a[i][j])
		// 그 중 짝수의 갯수  >  전체를 조회하며 짝수일 때 카운트한다.
		//if(a[i][j]%2==0)  >  cnt++;
		// 
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[0].length; j++) {
				//System.out.print(a[i][j]);
				if(a[i][j]%2==0) {
					cnt++;
					
				}
			}
			
		}
		
		System.out.println("짝수의 갯수 : "+cnt+"개");
		
		
	}

}
