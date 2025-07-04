package interfaceExample;

import java.util.Scanner;

//HDFC class implements RBI
class HDFC implements RBI {
 public void recurringDeposit(double amount, int years) {
     // Formula for recurring deposit maturity:
     // M = P * n + P * n(n+1)/2 * r / (12*100)
     // where:
     // P = monthly deposit
     // n = number of months
     // r = annual interest rate

     int n = years * 12; // number of months
     double P = amount;
     double r = interestRate;

     double maturityAmount = P * n + (P * n * (n + 1) / 2.0) * (r / (12 * 100));

     System.out.printf("After %d years of monthly deposit ₹%.2f:\n", years, amount);
     System.out.printf("Maturity Amount = ₹%.2f\n", maturityAmount);
 }
 	
 	 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter monthly deposit amount: ₹");
     double amount = sc.nextDouble();

     System.out.print("Enter duration (in years): ");
     int years = sc.nextInt();

     HDFC customer = new HDFC();
     customer.recurringDeposit(amount, years);
 }
}
