package interfaceExample;

public class InterfaceChild implements Interface1{
	
	public void print()
	{
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		InterfaceChild obj = new InterfaceChild();
		//Interface1 obj = new InterfaceChild();
		obj.display();
		obj.sum();
		obj.print();

	}

	@Override
	public void sum() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("sum of two numbers");
	}

}
