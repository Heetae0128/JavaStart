package _05_2For;

public class _240819_Q03 {

	public static void main(String[] args) {
//		3.
//		000*
//		00***
//		0*****
//		*******
	for(int i=0; i<4; i++) {
		for(int j=3; j>i; j--) {
			System.out.print("0");
		}
		for(int j=0; j<=i*2; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	} 

}
