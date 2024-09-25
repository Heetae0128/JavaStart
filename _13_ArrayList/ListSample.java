package _13_ArrayList;

import java.security.PublicKey;
import java.util.ArrayList;

public class ListSample {
	
	ArrayList<String> a= new ArrayList<>();
	ListSample(){
		System.out.println("리스트의 길이 "+a.size());
		a.add("apple");
		System.out.println("리스트의 길이 "+a.size());
		a.add("banana");
		a.add("crab");
		a.add("garbege");
		System.out.println("리스트의 길이 "+a.size());
		System.out.println("------------------------------");
		System.out.println(a.get(0));
		System.out.println("------------------------------");
		for(int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}
		System.out.println("------------------------------");
		for(int i = 0; i < a.size(); i++) {
			if(a.get(i).charAt(0)!='a') {				
			System.out.println(a.get(i));
			}
		}
		System.out.println("------------------------------");
		a.add(1,"쭈꾸미");	//특정 인덱스 위치에 추가
		for(int i = 0; i < a.size(); i++) {
			System.out.println(i+":"+a.get(i));
		}
		System.out.println("------------------------------");
		a.remove(3);	// 특정 인덱스 삭제
		for(int i = 0; i < a.size(); i++) {
		System.out.println(i+":"+a.get(i));
		}
		System.out.println("------------------------------");
		a.set(1, "갑오징어");	// 특정 인덱스 수정
		for(int i = 0; i < a.size(); i++) {
			System.out.println(i+":"+a.get(i));
		}
		System.out.println("------------------------------");
		a.clear();	// 리스트 전체 삭제
		System.out.println(a.size());
	}
}


