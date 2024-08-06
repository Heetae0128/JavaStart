package _01Array;

public class 변수_배열_연산자_answer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//문제 1
		int[] point = {30,40,50,60,55}; 
		System.out.println(point[0]+"/"+point[1]+"/"+point[2]+"/"+point[3]+"/"+point[4]);
		
		//문제 2
		String[] firstName = {"kim","lee","park"};
		System.out.println(firstName[0]+"/"+firstName[1]+"/"+firstName[2]);
		
		//문제 3
		int[] lotto = {6,12,33,4,5,26};
		lotto[2] = lotto[2]+2;
		
		//문제 4
		System.out.println(lotto[0]+lotto[2]+lotto[4]);
		
		//문제 5
		lotto[1] = lotto[0] + lotto[1];
		lotto[2] = lotto[0] + lotto[1] + lotto[2];
		lotto[3] = lotto[0] + lotto[1] + lotto[2] + lotto[3];
		lotto[4] = lotto[0] + lotto[1] + lotto[2] + lotto[3] + lotto[4];
		lotto[5] = lotto[0] + lotto[1] + lotto[2] + lotto[3] + lotto[4] + lotto[5];
		
		//문제 6
		System.out.println(lotto[3] % 2 > 0);
				
		//문제 7
		int money = 2750;
		int pay = 10000;
		int change = pay - money;
		
		System.out.println("천원" + change/1000 + "개" + ", " + 
						   "백원" + (change%1000)/100 + "개" + ", " + 
						   "십원" + (change%100)/10 + "개");
		
		//문제 8 
		int xA = 700;
		int yA = 500;
		int xB = 900;
		int yB = 300;
		
		int xC = 650;
		int yC = 150;
		
		System.out.println(xA < xC && xC <= (xB-3) && (yB+3) <= yC && yC < yA);
//		xA < xC <= xB-3
//		yB+3 <= yC < yA
		
	
		
	}

}
