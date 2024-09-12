package _05For2;

public class _240819_Q03 {

	public static void main(String[] args) {
//		3.
//		000*
//		00***
//		0*****
//		*******
//	for(int i=0; i<4; i++) {
//		for(int j=3; j>i; j--) {
//			System.out.print("0");
//		}
//		for(int j=0; j<=i*2; j++) {
//			System.out.print("*");
//		}
//		System.out.println();
//	}
//	}
//}

	for(int i=0; i<4; i++) {
		for(int j=0; j<=3+i; j++) {
		if(j>=3-i)	
		System.out.print("*");
		else {
			System.out.print("0");
		}
		}
		System.out.println();
	}
	}
}