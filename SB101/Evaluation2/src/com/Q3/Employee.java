package com.Q3;

public class Employee {
	

	private int empid;
	private String name;
	private double salary;
	private String address;
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Employee(int empid, String name, double salary, String address) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}
	
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + ", address=" + address + "]";
	}
	
	
	
	
	
}
