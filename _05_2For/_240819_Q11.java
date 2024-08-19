package _05_2For;

public class _240819_Q11 {

	public static void main(String[] args) {

//	11.
//	000*
//	00***
//	0*****
//	*******
//	0*****
//	00***
//	000*
		
		for(int i=0; i<4; i++) {
			for(int j=3; j>i; j--) {
				System.out.print("0");
			}
			for(int j=0; j<=i*2; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1; i<4; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("0");
			}
			for(int j=7; j>i*2; j--) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
	}
}



