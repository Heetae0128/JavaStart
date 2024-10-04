package _17_School;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Stu {
	private String id = null;
	private String name = null;
	private int tell = -1;
	private int grade = -1;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTell() {
		return tell;
	}
	public void setTell(int tell) {
		this.tell = tell;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public void abbbcc(){
		try {
			File file = new File("Output.txt");
			FileWriter write = new FileWriter(file,true);
			BufferedWriter bufferedWriter = new BufferedWriter(write);
			bufferedWriter.write(" apple \n 사과 \n");
			bufferedWriter.write(" apple \n 사과 \n");
			bufferedWriter.write(" apple \n 사과 \n");
			bufferedWriter.write(" apple \n 사과 \n");
			bufferedWriter.write(" apple \n 사과 \n");
			bufferedWriter.write("  \n 바나나 \n");
			
			bufferedWriter.write(" my test");
			bufferedWriter.flush();
			bufferedWriter.close();
		} catch (Exception e) {
			e.getStackTrace();
		}
	}

}
