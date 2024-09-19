package _09Array2_2;

public class _240911_Q6 {

	public static void main(String[] args) {
		int[][]a= {{1,2,3,4,5},
				   {6,7,8,9,10},
				   {11,12,13,14,15},
				   {16,17,18,19,20},
				   {21,22,23,24,25}};
		
		
		
//		6  1  2  3  4  	
//		11 12 7  8  5
//		16 17 13 9 10
//		21 18 19 14 15
//		22 23 24 25 20
		
		
		
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[0].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
		
