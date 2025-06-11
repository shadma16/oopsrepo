package encapsulation;

public class Encap1 {
	private String name;
	private int rollno;

	public void set(String n, int roll)
	{
		this.name=n;
		this.rollno=roll;
	}
	
	public void get()
	{
		System.out.println(name+" " +rollno);
	}

}