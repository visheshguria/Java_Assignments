package com.Q2;

public class Student {
	
	private int rollNumber;
	private String studentName;
	private int marks;
	
	
	public Student(){
		
	}
	
	public Student(int rollNumber , String StudentName ,int marks){
		super();
		this.rollNumber = rollNumber;
		this.studentName =StudentName;
		this.marks =marks;
		
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
	

	
}
