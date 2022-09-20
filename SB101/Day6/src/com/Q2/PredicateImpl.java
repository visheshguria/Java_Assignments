package com.Q2;

import java.util.function.Predicate;

public class PredicateImpl {

	public static void main(String[] args) {
		Predicate<Student> vr= st-> st.id>15 ? true:false;
	}

}
