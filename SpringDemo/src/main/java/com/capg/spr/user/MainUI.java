package com.capg.spr.user;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capg.spr.beans.Student;

public class MainUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext spring = new ClassPathXmlApplicationContext("spring.xml");
		
		Student student = (Student)spring.getBean("stud1");
		
		System.out.println(student);
		System.out.println("Year: "+ student.getYear());
		System.out.println("Course Id: "+student.getCourse().getCourseId());
		System.out.println("Course Name: "+ student.getCourse().getCourseName());

	}
	

}
