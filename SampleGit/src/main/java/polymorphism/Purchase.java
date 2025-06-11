package polymorphism;

public class Purchase {
	 double amount;

	    public Purchase(double amount) {
	        this.amount = amount;
	    }

	    // Method to override
	    public double discount() {
	        return 0;
	    }

}
