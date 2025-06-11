package exception;

public class TestException {
	public static void main(String[] args) throws MyCustomException {
        int age = 15;

        if (age < 18) {
            throw new MyCustomException("You must be at least 18 years old.");
        } else {
            System.out.println("You are allowed!");
        }
    }

}
