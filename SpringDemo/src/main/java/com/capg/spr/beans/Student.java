package com.capg.spr.beans;

public class Student {
	
	private int stuId;
	private String stuName;
	private int year;
	private Courses course;
	
	
	public Student() {
		super();
	}

	public int getStuId() {
		return stuId;
	}

	public void setStuId(int stuId) {
		this.stuId = stuId;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Courses getCourse() {
		return course;
	}

	public void setCourse(Courses course) {
		this.course = course;
	}

	public Student(int stuId, String stuName, int year, Courses course) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.year = year;
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuName=" + stuName + ", year=" + year + ", course=" + course + "]";
	}

	
	
	

}
