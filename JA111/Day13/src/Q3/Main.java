package Q3;

public class Main {

	public static void main(String[] args) {
		
			Loan loan = Loan.getLoanObj();	
			double permanentEmployeeLoan=loan.calculateLoanAmount(new PermanentEmployee(1,"Name1",1000));
			double temporaryEmployeeLoan=loan.calculateLoanAmount(new TemporaryEmployee(2,"Name2",20,100));
			System.out.println("Loan Amount for Permanent Employee => "+permanentEmployeeLoan);
			System.out.println("Loan Amount for Temporary Employee => "+temporaryEmployeeLoan);

	}

}
