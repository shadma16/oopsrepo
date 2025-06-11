package encapsulation;

public class Bank {
    // Private data (encapsulation)
    private int pin;

    // Method to set pin from user input
    public void setPin(int pin) {
        this.pin = pin;
    }

    // Method to validate pin and allow withdrawal
    public void validateAndWithdraw() {
        if (pin == 1001 || pin == 1234 || pin == 1212) {
            System.out.println("✅ PIN Verified.");
            System.out.println("💵 Amount Withdrawn Successfully.");
        } else {
            System.out.println("❌ Invalid PIN. Access Denied.");
        }
    }
}
