package com.Q1;

public class Student extends Person {
    int studentId;
    String courseEnrolled;
    int courseFee;
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", courseEnrolled=" + courseEnrolled + ", courseFee=" + courseFee
				+ ", name=" + name + ", gender=" + gender + ", city=" + city + ", state=" + state + ", pinCode="
				+ pinCode +"]";
	}

}
