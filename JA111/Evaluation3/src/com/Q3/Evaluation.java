package com.Q3;

public abstract class Evaluation {
	private final int numberOfQuestions = 3;
	
	@Override
	public String toString() {
		return "Evaluation numberOfQuestions=" + numberOfQuestions  ;
	}
	
	
	abstract void evaluationTiming();
	
	void printNoOfQuestions() {
		System.out.println("No. of questions in evaluation is" + numberOfQuestions);
	}
	
	
}
