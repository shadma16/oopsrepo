package exception;

public class MyCustomException extends Exception { //Exception is the class in Java's Exception Handling hierarchy.
    public MyCustomException(String message) {
        super(message);
    }

}
