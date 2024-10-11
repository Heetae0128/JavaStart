package _23_Extends_playMap;

import java.util.ArrayList;

import _23_Extends_zoounit.Mon;
import _23_Extends_zoounit.Ti;
import _23_Extends_zoounit.Zooinfo;

public class Zooplay {
	
	public static void main(String[] agrs) {
		
		ArrayList<Zooinfo> zlist = new ArrayList<>();
		Zooinfo z = new Ti();
		z.name="호돌이";
		z.age=1;
		zlist.add(z);
		z = new Ti();
		z.name="호순이";
		z.age=2;
		zlist.add(z);
		z= new Mon();
		z.name="숭이";
		z.age=3;
		zlist.add(z);
		for(Zooinfo zz : zlist) {
			zz.eat();
		}
		for(Zooinfo zz : zlist) {
			System.out.println(zz.toString());
		}
		
		
		
		
	}

}