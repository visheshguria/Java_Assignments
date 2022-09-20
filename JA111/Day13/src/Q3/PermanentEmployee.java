package Q3;

public class PermanentEmployee extends Employee {
private double basicPay;
	
	public PermanentEmployee(int employeeId, String employeeName, double basicPay) {
		super(employeeId, employeeName);
		this.basicPay = basicPay;
	}

	@Override
	void calculateSalary() {
		
		double PFAmount = basicPay * 0.12;
		salary = basicPay - PFAmount;
				
	}

}
