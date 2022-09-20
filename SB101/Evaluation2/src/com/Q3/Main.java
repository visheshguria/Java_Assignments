package com.Q3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
//import java.util.*;

public class Main {

	public static void main(String[] args) {

		List<Student> list= new ArrayList<>();

		list.add(new Student (2,"N1",550,"PB"));
		list.add(new Student (4,"N2",600,"HR"));
		list.add(new Student (0,"N3",350,"CH"));
		list.add(new Student (5,"N4",760,"DL"));
		list.add(new Student (6,"N5",240,"MH"));


		List<Employee> filteredList = list.stream().filter((s)-> s.getMarks()>500)
				.map((e)-> new Employee(e.getRoll(), e.getName(),e.getMarks()*10000,e.getAddress()))
				.collect(Collectors.toList());

		filteredList.forEach((i)-> System.out.println(i));
	}

}
