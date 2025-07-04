package abstraction;

public class FullTimeEmployee extends Employee {
    int paymentPerHour;

    public FullTimeEmployee(String name, int paymentPerHour) {
        super(name);
        this.paymentPerHour = paymentPerHour;
    }

    @Override
    public void calculateSalary() {
        int salary = paymentPerHour * 8; // Full time = 8 hours/day
        System.out.println(name + "'s Salary (Full Time): ₹" + salary);
    }
    
    public static void main(String[] args) {
        Employee contractor = new Contractor("Rahul", 500, 6);
        Employee fullTime = new FullTimeEmployee("Priya", 400);

        contractor.calculateSalary();
        fullTime.calculateSalary();
    }
}
