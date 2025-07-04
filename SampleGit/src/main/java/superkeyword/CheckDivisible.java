package superkeyword;

public class CheckDivisible extends Addition {
    void check(int a, int b) {
        int result = super.add(a, b); // calling parent method
        System.out.println("Addition Result: " + result);

        if (result % 10 == 0) {
            System.out.println("The result is divisible by 10.");
        } else {
            System.out.println("The result is NOT divisible by 10.");
        }
    }
    public static void main(String[] args) {
        CheckDivisible obj = new CheckDivisible();
        obj.check(40, 30); // You can change the numbers here
    }

}
