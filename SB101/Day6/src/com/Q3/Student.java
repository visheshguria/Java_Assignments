package com.Q3;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Student {
	
		int roll;
		String name;
		String email;
		int marks;

	
	public Student(int roll, String name, String email, int marks) {
			super();
			this.roll = roll;
			this.name = name;
			this.email = email;
			this.marks = marks;
		}


	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Map<String, Student> sortMapUsingStudentName(Map<String, Student>
	 originalMap){
		Map<String,Student> map=originalMap.entrySet()
               .stream()
               .sorted((i1, i2)
                           -> i1.getKey().compareTo(
                               i2.getKey()))
               .collect(Collectors.toMap(
                   Map.Entry::getKey,
                   Map.Entry::getValue,
                   (e1, e2) -> e1, LinkedHashMap::new));
		return originalMap;
		 
	 }



	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", email=" + email + ", marks=" + marks + "]";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,Student> map=new HashMap<>();
		map.put("Delhi",new Student(24,"abc","vishesh@gmail.com",435));
		map.put("Mubai",new Student(2,"akpr","vishesh@gmail.com",435));
		map.put("Punjab",new Student(4,"pkdr","vishesh@gmail.com",435));
		map.put("Bihar",new Student(54,"sfgv","vishesh@gmail.com",435));
		map.put("Haryana",new Student(54,"as","vishesh@gmail.com",435));
		Student obj=new Student();
		obj.sortMapUsingStudentName(map);
	      for (Entry<String, Student> entry :map.entrySet()) {
	            System.out.println("Key = " + entry.getKey()
	                               + ", Value = "
	                               + entry.getValue());


	}

	}

}
