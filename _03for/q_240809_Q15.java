package _03for;

public class q_240809_Q15 {

	public static void main(String[] args) {
	// 15.  
//		String ttt ="aabbbcccaaaaddbbbaaaaa";
	//  압축하시오. 압축 하는 방법 a2b3c3a4d2b3a5
		
//		 int bt = ttt.charAt(0);
//		 int maxCnt = 0;
//		 int maxNumber = 0;
//		 int cnt = 0; String resultZip=""; 
//		 for(int i=0; i < ttt.length(); i++) {
//			 char a = ttt.charAt(i);{
//			 //System.out.println(a);
//				 if(bt == ttt.charAt(i)) {
//					 cnt++;
//				 }else {
//					 resultZip = resultZip + (char)bt + cnt;  // (char)bt = ??
//					 cnt = 1;
//					 bt = ttt.charAt(i);
//				 }
//			 }
//			 resultZip = resultZip + (char)bt + cnt;
//			 System.out.println(resultZip);
			 
			 
//		 }
		//	int[] arr = { 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 1, 3 };
		String ttt = new String("aabbbcccaaaaddbbbaaaaa");
		int cnt = 0;
		String resultZip = "";
		char bT = ttt.charAt(0);
		int maxCnt = 0;
		char maxNumber;
		for (int i = 0; i < ttt.length(); i++) {
			if (bT == ttt.charAt(i)) {
				cnt++;
			} else {
				resultZip = resultZip + (char) bT + cnt;
				bT = ttt.charAt(i);
				cnt = 1;
			}
		}
//		resultZip = resultZip + (char) bT + cnt;
		System.out.println(resultZip);

	}


}
