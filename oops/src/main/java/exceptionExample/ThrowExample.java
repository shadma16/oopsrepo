package exceptionExample;

public class ThrowExample {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age =16;
		
		if(age>18)
		{
			System.out.println("Age is valid");
		}
		else
		{
			throw new ArithmeticException("Age under 18");
		}
	}

}