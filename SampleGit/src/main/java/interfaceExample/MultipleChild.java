package interfaceExample;

public class MultipleChild implements MultipleParentA,MultipleParentB{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleChild obj = new MultipleChild();
		obj.display();
		obj.print();

	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("ParentB");
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("ParentC");
		
	}

}
