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
