package inheritance;

public class SalaryDetails extends EmployeeDetails{
	double hra,pf;
	
	public void calc()
	{
		hra=0.05*basicPay;
		pf=0.20*basicPay;
		
	}
	
}
