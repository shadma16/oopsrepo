package inheritance;

public class SingleChild extends SingleParent{
	
	public void display1()
	{
		System.out.println("world");
	}

	public static void main(String[] args) {
		
		SingleChild obj=new SingleChild();
		obj.display();
		obj.display1();

	}

}
