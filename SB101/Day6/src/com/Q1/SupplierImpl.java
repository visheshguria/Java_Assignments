package com.Q1;

import java.util.function.Supplier;

public class SupplierImpl implements Supplier<Student>{

	@Override
	public Student get() {
		// TODO Auto-generated method stub
		return new Student(10,"vishesh");
	}

}
