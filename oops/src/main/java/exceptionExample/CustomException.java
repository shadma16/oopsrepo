package exceptionExample;

public class CustomException {

	public static void main(String[] args) throws VotingException {
		// TODO Auto-generated method stub
int age =16;
		
		if(age>18)
		{
			System.out.println("Age is valid");
		}
		else
		{
			throw new VotingException("Age under 18");
		}
	}

}