package com.Q1;

public class Main {
	
public static Person generatePerson(Person person) {
		if(person instanceof Student) {
			
			Student NewStudent= new Student();
			NewStudent.name="Ram";
			NewStudent.gender="Male";
			NewStudent.city="Chandigarh";
			NewStudent.pinCode="160014";
			NewStudent.state="Chandigarh";
			NewStudent.studentId= 264;
			NewStudent.courseEnrolled="Web Development";
			NewStudent.courseFee=24000;
			return NewStudent;
			
		} 
		if(person instanceof Instructor){
			
			 Instructor NewInstructor= new Instructor(); 
			 NewInstructor.name="Vishesh";
			 NewInstructor.gender="Male";
			 NewInstructor.city="Fazilka";
			 NewInstructor.pinCode="152123";
			 NewInstructor.state="Punjab";
			 NewInstructor.instructorId=126;
			 NewInstructor.salary=130000;
			 return NewInstructor;
			 
		}
		return person;		
	}

	public static void main(String[] args) {

		Person newStudent = generatePerson(new Student());
		Person newTeacher = generatePerson(new Instructor());

		System.out.println(newStudent);
		System.out.println(newTeacher);
	
	}
}
