package _10_Class_mission4;

public class MainMenu {
	OneClient oCl=null;
	OneEvent oEv=null;
	
	MainMenu(){
		if(oCl==null) {
			oCl = new OneClient();
		}
		if(oEv==null) {
			oEv = new OneEvent();
		}
	}
}

