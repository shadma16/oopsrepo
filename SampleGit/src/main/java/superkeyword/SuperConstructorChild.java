package superkeyword;

public class SuperConstructorChild extends SuperConstructor {
	
	public SuperConstructorChild(String s)
	{
		super(20,30);
		System.out.println(s);
	}

	public static void main(String[] args) {
		SuperConstructorChild obj = new SuperConstructorChild("hello");

	}

}