package abstraction;

public class AbstractChild  extends AbstractParent{

	@Override
	public void sum() {
		// TODO Auto-generated method stub
		int a=5;
		int b=10;
		int c=a+b;
		System.out.println(c);
		
		
	}
	
	public void print()
	{
		System.out.println("hello");
	}
	
	public static void main(String args[])
	{
		AbstractChild obj=new AbstractChild();
		//AbstractParent obj=new AbstractChild(); //ref for parent class
		obj.display();
		obj.sum();
		obj.print();
	}
	
	

}