package encapsulation;

import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Bank b = new Bank();

        System.out.print("Enter your PIN: ");
        int enteredPin = sc.nextInt();

        b.setPin(enteredPin);          // Pass pin to Bank class
        b.validateAndWithdraw();       // Validate and withdraw
    }
}
