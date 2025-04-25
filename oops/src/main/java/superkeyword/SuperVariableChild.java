package superkeyword;

public class SuperVariableChild extends SuperVariable{

	String color = "Black";
	
	public void print()
	{
		System.out.println(color);
		System.out.println(super.color);
	}
	public static void main(String[] args) {
		SuperVariableChild obj = new SuperVariableChild();
		obj.print();

	}

}