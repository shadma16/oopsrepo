package polymorphism;

public class Offseason extends Purchase{

	    public Offseason(double amount) {
	        super(amount);
	    }

	    @Override
	    public double discount() {
	        return amount * 0.15; // 15% discount
	    }
	    
	    public static void main(String[] args) {
	        Purchase onseason = new Onseason(2000);
	        Purchase offseason = new Offseason(2000);

	        System.out.println("Onseason Discount: " + onseason.discount());
	        System.out.println("Offseason Discount: " + offseason.discount());
	    }
	}

/* package polymorphism;

public class OffSeason {
	
	
	public void discount()
	
	{  float totpurchase=6000f;
		if (totpurchase>5000f)
		{
			float discount=totpurchase*(15/100f);
			System.out.println("discount on Off season is "+discount);
		}
	}

}*/