package com.spring.SpringFramework;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Student {
	
	@Value("${student.interstedCourse}")
	private String name;
	
	@Value("${student.interstedCourse}")
	private String interstedCourse;
	
	@Value("${student.hobby}")	
	private String hobby;
	
		
		public void displayStudentInfo() {
		System.out.println("Student Name" +name);
		System.out.println("Student intersted Course" +interstedCourse);
		System.out.println("Student hobby" +hobby);
	}
	
	

}
