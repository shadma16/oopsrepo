package inheritance;

import java.util.Scanner;

public class EmployeeDetails {
	double basicPay, deduction, bonus;

    void getInput() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Basic Pay: ");
        basicPay = sc.nextDouble();

        System.out.println("Enter Deduction: ");
        deduction = sc.nextDouble();

        System.out.println("Enter Bonus: ");
        bonus = sc.nextDouble();
    }
}
