package _08Array2_2;

public class _240911_Q3 {

	public static void main(String[] args) {
		int[][]a = new int[4][5];
		int num = 1;
		//배열 값 입력부
//		1   2   3   4   5
//		10  9   8   7   6
//		11  12  13  14  15
//		20  19  18  17  16  
		//문제 푸는 곳
		//열이 순회하다 다음행을 순회할때 순서가 반대가 된다
		//조건이 붙는다 조건은 다음행으로 넘어갈때다. 구체적으로 보자면 0행 1행 2행 3행
		//어떨때 반대로 가는가를 확인해보자
		//0행에서 1행이될때 2행에서3행이 될때
		//행이 변화하는 때이니 'i'를 기준으로 둔다.
		//수열?이 숨어져있다 0 > ++로 1 > --로 2 > ++ 3 > --
		// 나누기연산자? 퍼센트연산자?
		// 퍼센트로 해서 만들어보자
		
		
		
		//선생님 풀이				첫번째				두번째
		//0,0 0,1 0,2 0,3 0,4	행은 고정 열은 변화		열이 01234
		//1,4 1,3 1,2 1,1 1,0	행은 고정 열은 변화		열이 43210
		//2,0 2,1 2,2 2,3 2,4	행은 고정 열은 변화
		//3,4 3,3 3,2 3,1 3,0	행은 고정 열은 변화
		
		//행이 먼저 반복되고 다시 열이 반복된다.
		//행은 아이로 결정
		for(int i=0; i<a.length; i++) {
			if(i%2==0) {
				for(int j=0; j<a[0].length; j++) {
					a[i][j]=num;
					num++;
				}
			}
			else {
				for(int j=a[0].length-1; j>=0; j--) {
					a[i][j]=num;
					num++;
				}
			}
		}
		
		// a[행][열]=num++; < 후위 단일 연산자 
		// 대입연산자가 일어난 후 단일 연산자인 ++이 실행된다.
		// a[행][열]=++num; < 전위 단일 연산자 
		// 단일연산자가 먼저 실행된 뒤 대입연산자가 실행된다.
		
		
		
		//배열 값 출력부
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[0].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
