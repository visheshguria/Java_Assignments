package com.Q5;
import java.util.Scanner;
public class Main {
	public static Employee getEmployeeDetails() {
		Scanner sc = new Scanner(System.in);

		Employee e1 = new Employee();

		System.out.println("Enter id");
		e1.employeeId = sc.nextInt();

		System.out.println("Enter name");
		e1.employeeName = sc.next();

		System.out.println("Enter Salary ");
		e1.salary = sc.nextDouble();

		System.out.println("enter PF percentage");	
		int pf = sc.nextInt();

		e1.calculateNetSalary(pf);
		return e1;
	}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee obj = getEmployeeDetails();

		System.out.println("Employee id :" + obj.employeeId);
		System.out.println("Employee name :" + obj.employeeName);
		System.out.println("Employee salary :" + obj.salary);
		System.out.println("Employee net salary :" + obj.netSalary);

	}


}
