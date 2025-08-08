package encapsulation;

public class Encap1 {
	private String name;
	private int rollno;

	public void set(String name, int rollno)
	{
		this.name=name;
		this.rollno=rollno;
	}
	
	public void get()
	{
		System.out.println(name+" " +rollno);
	}

}