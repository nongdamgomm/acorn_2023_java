package test.main;

import test.mypac.Student;

public class MainClass01 {
	public static void main(String[] args) {
		new Student();
		
		new Student().Study();
		
		Student s1 = new Student();
		s1.Study();
		s1.Study();
	}
}
