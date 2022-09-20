package com.Q4;

	public class Student {
		   
		private String roll;
		private String name;
		private int marks;
		private char grade;
		
		public Student(String roll, String name, int marks) {
			super();
			this.roll = roll;
			this.name = name;
			this.marks = marks;
		}

		public void displayDetails() {
			System.out.println(toString());
		}
		
		@Override
		public String toString() {
			return "Student roll=" + roll + ", name=" + name + ", marks=" + marks +", grade=" + calculateGrade();
		}

		private char calculateGrade(){
			
			if(marks>=500) {
				 grade='A';
			}else if(marks<500 && marks>= 400) {
				 grade ='B';
			}else if(marks<400) {
				grade ='C';
			}
			return grade;
		}

}
