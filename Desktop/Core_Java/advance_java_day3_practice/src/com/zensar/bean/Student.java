package com.zensar.bean;

public class Student {
	private int rollno;
	private String name;
	private String course;
	private int duration;
	private int age;
	private String gender;
	private String hometown;
	
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	
	public String getHometown() {
		return hometown;
	}
	public void setHometown(String hometown) {
		this.hometown = hometown;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Student(int rollno, String name, String course, int duration, int age, String gender,String hometown) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.course = course;
		this.duration = duration;
		this.age = age;
		this.gender = gender;
		this.hometown = hometown;
	}
	
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", course=" + course + ", duration=" + duration
				+ ", age=" + age + ", gender=" + gender + ", hometown=" + hometown +"]";
	}
	
}
