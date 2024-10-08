package _08Array2;

import java.awt.image.AreaAveragingScaleFilter;

public class _07_Q {

	public static void main(String[] args) {
		

		//7. 위와 같은 게임 배열에서 같은 번호가 세로로 연속 3개 이상이면 제거가 가능하다.
		//	 제거가 가능한 블록의 좌표를 출력하시오.
		
		
		//   집중이 안된다..
		//   집중이 안되는걸까 아니면 문제에 접근하는 방법을 모르는걸까
		//   모르겠다 모르면 일단 정보를 나열해보자
		//   같은 번호 세로
		//   연속 3개 이상 > 3또는 4 혹은 5,6,7,8 그런데 4자릿수다 3또는 4
		//   제거가능하다
		//   제거가 가능한 블록의 좌표를 출력
		
	    //   같은 번호 세로 = 예로 변수 'a'의 육안으로 확인가능한 세로번호를 본다.
		//   그자리 배열의 값은 a[3][1],a[4][1],a[5][1]
		//   음 로우는 순서가 있고 컬럼은 중복된다.
		//   그렇다면 조회한다?
		//   모든 자리의 값은 나와있고 육안으로 보기 위해 배열의값을
		//   로우와 컬럼으로 나타내보자
		//   [0][0],[0][1],[0][2],[0][3]
		//	 [1][0],[1][1],[1][2],[1][3]
		//   [2][0],[2][1],[2][2],[2][3]
		//	 [3][0],[3][1],[3][2],[3][3]
		//   [4][0],[4][1],[4][2],[4][3]
		//	 [5][0],[5][1],[5][2],[5][3]
		
		//   같은 번호 세로  =  for(int i = 0; i < a[0].length; i++)
		//						for(int j = 0; j < a.length; j++)  여기까지는 전체를 조회
		//   세로는 a[j][i]  =  i의값은 0부터 3까지 조회한다
		//					  j는 i가 0일때 0부터 5까지 조회한다 
		//   a[j][i] 이면 조회하는 방식이 행이 아닌 열로 조회를 할 것이다.
		//   세로는 찾았으니 세로끼리 비교하는 방법을 찾아야한다.
		//   비교한다.. 비교한다.. a[j][i] = a[j+1][i] 이런식일거같다.
		//   모든식을 쓰고보니 에러가 난다... 값을 대입하여 손코딩을 풀어보았다
		//   아.. 'j'의 마지막값을 넣으니 a[5+1][0] ? 당연히 에러가 나겠구나..
		//   그럼 방식을 바꿔야 할것같다.
		//   변수를 만들어보자 아무래도 비교하는게 가장 기초적인거같다.
		//   int temp = a[0][0];
		//   if(a[j][i]==temp)
		//   cnt++
		//   세로열이 = 0 이라면
		//   카운트를 하게 만들었다
		//   if문을 사용했으니 아닐경우도 만들어야 에러를 피하고 원하는 답을 출력할 수 있을것이다.
		//   아닐경우는 cnt = 0 으로 돌아가고(여기서 에러가 났다.) temp의 값을 아닌값과 똑같이 바꿔준다.
		//   else {
		//	 temp = a[j][i];
		//	 cnt = 1;}
		//   cnt = 0 으로 바꾸게 되면 처음시작카운터가 0이기에 3개가 맞아도 2로 출력되므로
		//   문제의 답이 출력되지 않을것이다.
		//   자, 식은 완성되었다.
		//   문제의 답은 세로열의 3개가 같을경우 3가지 배열의 행과열 값이다.
		//   출력방향만 생각하면 답을 출력할 수 있을 것이다.
		//   카운트한값이 3보다 크거나 같다면   >   cnt >= 3
		//   카운트는 3번째 혹은 4번째에 조건을 만족한다.
		//   즉, 마지막을 출력한다 그렇다면 3일경우와 4일경우
		//   일단 3일경우만 만든다.
		
		int	a[][] = {{1,1,0,2},
				     {3,2,1,2},
				     {0,0,3,2},
				     {4,4,4,4},
				     {2,4,3,1},
				     {2,4,1,3}};
		int cnt = 0;
		int temp = a[0][0]; // 세로열을 비교하기위해 변수를 만들었다.
		for(int i = 0; i < a[0].length; i++) {
			cnt = 0;
			for(int j = 0; j < a.length; j++) {
				if(a[j][i]==temp) {
					temp = a[j][i];
					cnt++;
				}
				else {
				temp = a[j][i];
				cnt = 1;
				}
				if(cnt==3) {
						System.out.print("["+j+"/"+i+"]");
						System.out.print("["+(j-1)+"/"+i+"]");
						System.out.print("["+(j-2)+"/"+i+"]");
				}System.out.println();
			}
		}
	}
}
