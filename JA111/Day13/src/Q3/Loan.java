package Q3;

public class Loan {
	 static double LoanAmount;
	 
	 public double calculateLoanAmount(Employee employeeObj){
	     
	     
		if(employeeObj instanceof PermanentEmployee) {
			PermanentEmployee NewPermanentEmployee = (PermanentEmployee)employeeObj;
			NewPermanentEmployee.calculateSalary();
		    LoanAmount = NewPermanentEmployee.salary*0.15;
		}
		
		if(employeeObj instanceof TemporaryEmployee) {
			TemporaryEmployee NewTemporaryEmployee = (TemporaryEmployee)employeeObj;
			NewTemporaryEmployee.calculateSalary();
		    LoanAmount = NewTemporaryEmployee.salary*0.10;
		}
		
		return LoanAmount;
	 }

	private Loan(double loanAmount) {
		super();
		LoanAmount = loanAmount;
	}

	
	public static  Loan getLoanObj() {
		return new Loan(LoanAmount);
	}

}
