package inhe;

public class Salary {
	double basicpay;
	double bonus;
	double  deduction;
	
	 Salary(String[] args)
	{
		basicpay=Double.parseDouble(args[0]);
		bonus=Double.parseDouble(args[1]);
		deduction=Double.parseDouble(args[2]);
	}

}
