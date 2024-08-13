package _03for;

public class test {

	public static void main(String[] args) {
		String a ="23-56+45*2-56";
		char sign='+';
		int result=0;
		String tempInt="";
		a=a+"+";   // for문이 반복되는 동안 if문에서 계산을 해야 하는데
		           // i가 배열의 마지막 인덱스 일 경우는 if문에 true가 되지 않는다.
		           // 그래서 원본에 +를 마지막에 추가하여 해결 함.
		for(int i=0; i < a.length(); i++){
		   	char temp = a.charAt(i);
		   	if(temp == '+' || temp == '-' ||temp == '*'){
		   		int tempInteger = Integer.valueOf(tempInt);
		   		System.out.println(tempInteger);
//		   		if(sign == '+'){
//		   			result += tempInteger;
//		   		}else if(sign == '-'){
//		   			result -= tempInteger;
//		   		}else if(sign == '*'){
//		   			result *= tempInteger;
//		   		}
//		   		sign=temp;
//		   		tempInt="";
//		   	}else{
//		   		tempInt += temp;
//		   	}
//		}
//		System.out.println(result);
		   	}
		}
	}
}