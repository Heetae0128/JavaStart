package _05For2;

public class _240819_Q07 {

	public static void main(String[] args) {
//		7. 거스름돈 구하기   10000원짜리 0개, 1000원짜리 0 개, 100짜리 0개, 10짜리 0개,   
//		조건 : /나 %연산자는 각각 최대 두 번씩 사용가능 
//		단, 거스름돈은 만천원이 최대 값이다. 
		int money= 4570;  // 가격
		int pay = 10000;  //지불금액
		int cash = (pay-money);
		System.out.println("10000원짜리"+ cash%1000+"개" + "1000원짜리"+ cash/1000 + "개" + "100원짜리" 
				+ (cash%1000)/100 + "개" + "10원짜리" + cash + "개" );
	}

}
