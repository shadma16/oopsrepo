package exceptionExample;

public class InvalidEmailException extends Exception {

	public InvalidEmailException(String userEmail) {
		// TODO Auto-generated constructor stub
		super(userEmail);
}

}