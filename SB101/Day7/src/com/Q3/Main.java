package com.Q3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> num=Arrays.asList(2,5,9,95,552,48,265,78,12);
		List<Integer> nums=num.stream().map(x->x*x).collect(Collectors.toList());
		System.out.println(num);
		System.out.println(nums);
	}
}
