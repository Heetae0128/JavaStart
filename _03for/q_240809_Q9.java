package _03for;

public class q_240809_Q9 {

	public static void main(String[] args) {
		String test = "abcdeabce";
		int cnt = 0;
	    for(int i=0; i < 9; i ++){
	    	char aaa = test.charAt(i);
	    	if(test.charAt(i) == test.charAt(0))
	    		cnt++;
	    	System.out.println(aaa);
	        }
	    System.out.println("a문자열에 a는 " + cnt + "개다");

	       //위 코드를 분석하여 a문자열에 a가 몇개 있는지 구하는 프로그램을 작성하세요
	    
	    
	}

}
