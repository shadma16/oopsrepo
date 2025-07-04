package inhe;

public class TotalSal extends Employ{
	double total;

	public static void main(String[] args) {
		TotalSal obj = new TotalSal(args);
		obj.salaryslip();
		// TODO Auto-generated method stub
		}
	
	public TotalSal(String args[])
	{
	super(args);
	total = basicpay+hra+pf-deduction+bonus;
	
	}
	public void salaryslip()
	{
	
		System.out.println("basic pay :" +basicpay);
		System.out.println("deduction :" +deduction);
		System.out.println("bonus :" +bonus);
		System.out.println("hra :" +hra);
		System.out.println("pf :" +pf);
		System.out.println("total :" +total);
	}
}
