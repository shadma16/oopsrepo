package aggregation;

public class AggregationChild {

	String city;
	String state;
	AggregationSample ref;
	public AggregationChild (String city, String state,AggregationSample ref)
	{
		this.ref=ref;
		this.city=city;
		this.state=state;
	}
   public void Display()
   {
	   System.out.println(ref.name+" " +ref.rollno+" " +ref.address);
	   System.out.println(city+" "+state);
	   
   }
	
	public static void main(String[] args) {
		AggregationSample obj = new AggregationSample("Joe",2,"28 villa");
		AggregationChild obj1 = new AggregationChild("Texas","USA", obj);
		obj1.Display();
		obj.print();

	}

}
