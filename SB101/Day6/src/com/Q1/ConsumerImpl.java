package com.Q1;

import java.util.function.Consumer;

public class ConsumerImpl implements Consumer<Student>{

	@Override
	public void accept(Student t) {
		// TODO Auto-generated method stub
		System.out.println(t.id);
		System.out.println(t.name);
	}

}
