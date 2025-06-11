package exception;

public class Example1 {

	public static void main(String[] args) {
		try {
            int a = 10;
            int b = 0;
            int result = a / b;  // Will throw ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } finally {
            System.out.println("This block always runs (finally block).");
        }

    }// TODO Auto-generated method stub

	}


