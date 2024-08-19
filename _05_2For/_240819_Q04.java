package _05_2For;

public class _240819_Q04 {

	public static void main(String[] args) {
//	4. 
//	*******
//	0*****
//	00***
//	000*
		
	for(int i=0; i<4; i++) {
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
