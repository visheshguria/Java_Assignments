package com.Q3;

public class Main {
	private static Member Employee;
	private static Member Manager;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee = new Member();
		
		Employee.Name="Ram";
		Employee.Age=25;
		Employee.PhoneNumber= "9988332537";
		Employee.Address="Rajasthan";
		Employee.Salary=80000.00;
		
	
		
		Member.printSalary(Employee.Salary,Employee.Name);
		
		Manager =new Member();
		
		Manager.Name="Vishesh";
		Manager.Age=27;
		Manager.PhoneNumber= "9988332537";
		Manager.Address="Punjab";
		Manager.Salary=140000.00;
		
		Member.printSalary(Manager.Salary,Manager.Name);

	}

}
