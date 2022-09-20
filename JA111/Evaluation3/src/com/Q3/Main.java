package com.Q3;

public class Main {

		public void messageToStudents(Evaluation evaluation) {
			
			
			if(evaluation instanceof DsaEvaluation) {
				System.out.println("Its a DSA evaluation");
				 evaluation.evaluationTiming();
				evaluation.printNoOfQuestions();
			}
			else if(evaluation instanceof CodingEvaluation) {
				System.out.println("Its a coding Evaluation");
				 evaluation.evaluationTiming();
					evaluation.printNoOfQuestions();
			}
		}

public static void main(String[] args) {
		Main obj= new Main();
		Evaluation dsaobj= new DsaEvaluation ();
		
		Evaluation codingobj= new CodingEvaluation();
		
		obj.messageToStudents(codingobj);
 }

}
