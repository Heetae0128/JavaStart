package _25_MAIN;

import _25_DAO_inf.DBdao;
import _25_DAO_inf.WordDAO;
import _25_Service.WordMainFrame;

public class Main {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		// oracle veresion
		DBdao dao = new WordDAO();
		WordMainFrame ws = new WordMainFrame(dao);
	}
}
