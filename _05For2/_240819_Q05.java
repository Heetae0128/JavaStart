package _05For2;

public class _240819_Q05 {

	public static void main(String[] args) {
//		5. 
		int[] a ={34,55,23,56,34,45,34};
		int cnt = 0;
//		40보다 큰 수는 모두 몇개인가?
		
		for(int i=0; i<a.length; i++) {
			if(a[i]>40) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
