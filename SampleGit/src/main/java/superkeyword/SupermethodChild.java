package superkeyword;

public class SupermethodChild extends SuperMethod {
	
	public void display()
	{
		System.out.println("obsqura");
		super.print(10);
	}

	public static void main(String[] args) {
		SupermethodChild obj = new SupermethodChild();
		obj.display();

	}

}
