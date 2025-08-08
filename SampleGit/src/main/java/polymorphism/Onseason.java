package polymorphism;

public class Onseason extends Purchase{
	public Onseason(double amount) {
        super(amount);
    }

    @Override
    public double discount() {
        return amount * 0.40; // 40% discount
    }

}
/*package polymorphism;

public class OnSeason extends OffSeason {

	public static void main(String[] args) {
		
		
		//OnSeason obj = new OnSeason();
		//obj.discount();
		//OffSeason obj1=new OffSeason();
		//obj1.discount();
		
		OffSeason obj;
		obj=new OnSeason();
		obj.discount();
		obj=new OffSeason();
		obj.discount();
		
		
	}
		
			
			public void discount()
			{
				float totpurchase=6000f;
				if (totpurchase>5000f)
				{
					float discount=totpurchase*(40/100f);
					System.out.println("discount on On season is "+discount);
				}
			}
			}
		


	*/