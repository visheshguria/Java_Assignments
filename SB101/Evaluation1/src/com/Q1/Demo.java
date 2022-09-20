package com.Q1;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<Employee, String> tr= new TreeMap<>(new EmployeeComparison());
		
		tr.put(new Employee(4,"A1",6599),"A1");
		tr.put(new Employee(5,"A5",6700),"A5");
		tr.put(new Employee(2,"A3",6362),"A3");
		tr.put(new Employee(7,"A2",7099),"A2");
		tr.put(new Employee(1,"A7",6199),"A7");
		
	
	for(Entry <Employee, String> ent:tr.entrySet()) {
		System.out.println(ent.getKey()+"--"+ ent.getValue());
	}

 }
}
