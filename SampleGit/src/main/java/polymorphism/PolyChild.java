package polymorphism;

public class PolyChild extends PolyParent{
	public void sum(int a, int b)
	{
		int res=a-b;
		System.out.println("child sum is"  +res);
		super.sum(4, 5);
	}	

		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PolyChild obj=new PolyChild();
				obj.sum(3,8);
		
	}

}


