package _23_Extends_playMap;

import java.util.ArrayList;

import _23_Extends_unit.Seok;
import _23_Extends_unit.StarUnit;
import _23_Extends_unit.ZZan;

public class GamePlay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 여기서 게임을 진행한다.
		// 캐릭터 석을 선택함 > 객체를 만든다
		ArrayList<StarUnit> seokList = new ArrayList<>();
		StarUnit s1 = new Seok();
		s1.unitName ="석진";
		s1.hp=6000;
		s1.attack=100;
		seokList.add(s1);		
		Seok s2 = new Seok();
		s2.unitName ="홍길";
		s2.hp=5500;
		s2.attack=80;
		seokList.add(s2);		
		StarUnit z1 = new ZZan();
		z1.unitName="짜장";
		z1.hp=7000;
		z1.attack=120;
		seokList.add(z1);				
		for(StarUnit s : seokList) {
			//System.out.println(s.toString());
			s.attack();
		}
	}

}