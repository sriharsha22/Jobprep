package com.harsha.servlet.mvcdemo;

import java.util.ArrayList;
import java.util.List;

public class StudentDataUtil {
	
	public static List<Student> getStudents(){
		
		List<Student> students = new ArrayList<>();
		
		students.add(new Student("harsha", "ande", "harsha@gmail.com"));
		students.add(new Student("harsha1", "ande1", "harsha1@gmail.com"));
		students.add(new Student("harsha2", "ande2", "harsha2@gmail.com"));

		return students;
		
	}
}
