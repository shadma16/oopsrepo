package aggregation;

public class AggregationChild {

	String city;
	String State;
	AggregationSample ref;
	public AggregationChild (String city, String State,AggregationSample ref)
	{
		this.ref=ref;
		this.city=city;
		this.State=State;
	}
   public void Display()
   {
	   System.out.println(ref.name+" " +ref.rollno+" " +city+ " " +State);
   }
	
	public static void main(String[] args) {
		AggregationSample obj = new AggregationSample("Joe",2,"28 villa");
		AggregationChild obj1 = new AggregationChild("Texas","USA",obj);
		obj1.Display();

	}

}
