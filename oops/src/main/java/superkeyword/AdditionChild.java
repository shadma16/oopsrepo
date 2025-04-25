package superkeyword;

public class AdditionChild extends Addition{
	int res ;
	int x;
	public AdditionChild()
	{
		
		        if (res % 10 == 0)
		        {
		        	System.out.println("The result"   +res+  " is divisible by 10.");
		        }
		        else
		        {
		        	System.out.println("The result" +res+ "is NOT divisible by 10.");
		        }
		        

		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdditionChild obj = new AdditionChild();
		
		int x=obj.Addition(2, 3);
		System.out.println(x);
	}

}
