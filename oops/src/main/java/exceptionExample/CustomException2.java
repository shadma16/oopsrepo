package exceptionExample;

public class CustomException2 {
	
	

	public static void main(String[] args) throws InvalidEmailException {
		// TODO Auto-generated method stub

		String userEmail="invalidemail.com";
		
	
		if(userEmail==null || !((String) userEmail).contains("@"))
		{
			throw new InvalidEmailException("Invalid Email");
		}
		else
		{
			System.out.println("Email is valid");
		}
	}

}