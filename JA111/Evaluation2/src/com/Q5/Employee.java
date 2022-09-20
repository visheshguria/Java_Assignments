package com.Q5;

public class Employee {

	int employeeId;
	String employeeName;
	double salary;
	double netSalary;

	public void calculateNetSalary(int pfPercentage) {
		double s = (this.salary/100*pfPercentage);
		this.netSalary=(this.salary-s);
	}

}



