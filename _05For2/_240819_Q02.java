package _05For2;

public class _240819_Q02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		2. 
//		*****
//		****
//		***
//		**
//		*
		for(int i = 5; i > 0; i--) {
			//for(int i = 0; i<5; i++
			for(int j = 0; j < i; j++) {
				// for(int j = 0; j <= 4-i; j++
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
// i와 j의 관계로 식을 만들어라
// 단서를 찾아라