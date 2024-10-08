package _21_main;

import _21_service.FishService;

public class Main {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		System.out.println("Fish World");
		FishService fs = new FishService();
		fs.menu();
		
		// dao 단위 테스트  :  DAO add 기능 테스트, 결과 : 성공
//		FishDAO f = new FishDAO();
//		FishDTO d = new FishDTO();
//		d.setId("aa");
//		d.setPwd("ppp");
//		f.add(d);
		
	}

}
