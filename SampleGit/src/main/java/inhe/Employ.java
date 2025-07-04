package inhe;

public class Employ extends Salary {
	double hra,pf;
	
	Employ(String args[])
	{
		super(args);
		calculate();
		
	}
	void calculate()
	{
		hra =0.05* basicpay;
		pf=0.2* basicpay;
	}

}
