package _12_Class_sample;

public class MyDogList {
	
	Dog[] d = new Dog[5];

	public MyDogList() {
		// TODO 자동 생성된 생성자 스텁
		System.out.println("-- 도그 관리 --");
		System.out.println(d[0]); 
		if(d[0]!=null) {
			System.out.println(d[0].name);	
		}
		d[1]=new Dog();//객체 생성
		System.out.println(d[1]);//객체 주소의 위치/ 주소의 값이 아님
		d[2]=d[1];
		System.out.println(d[2]);
		d[3]=new Dog();	//새로운 객체 생성 주소값이 다른객체임
		System.out.println(d[3]);
		Dog dd = new Dog();
		d[4]=dd;
		System.out.println(dd);
		System.out.println(d[4]);
		d[1].name="abc";
		System.out.println(d[1].name);
		System.out.println(d[2].name);
		System.out.println(d[3].name);
		for(int i=0; i<5; i++) {
			if(d[i]!=null) {
				System.out.println((i+1)+" 번째");
				System.out.println(d[i].name);
			}
		}
		
		//	강아지 검색
		String s = "언년이";
		for(int i=0; i<5; i++) {
			if(d[i].name.equals(s)) {
				System.out.println("찾음");
				break;
			}
		}
		
	}
}
