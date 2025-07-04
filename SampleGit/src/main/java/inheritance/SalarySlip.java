package inheritance;

public class SalarySlip extends SalaryDetails {
    public void calcTotalSalary()
    {
    	
            super.calc();   // Calculate hra and pf
       
  	  double totalSalary = basicPay + hra - pf - deduction + bonus;
  	  
  	  System.out.println("\nSalarySlip");
  	  System.out.println("BasicPay      :  " + basicPay);
  	  System.out.println("Deduction     :  " + deduction);
  	  System.out.println("HRA           :  " + hra);
  	  System.out.println("PF            :  " + pf);
  	  System.out.println("Bonus         :  " + bonus);
  	  System.out.println("Total Salary  :  " + totalSalary);
  	  
    }
    public static void main(String[] args) {
		SalarySlip emp = new SalarySlip();
		emp.calc();
		emp.calcTotalSalary();

	}
}