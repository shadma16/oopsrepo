package abstraction;

public class Contractor extends Employee {
    int paymentPerHour;
    int hoursWorked;

    public Contractor(String name, int paymentPerHour, int hoursWorked) {
        super(name);
        this.paymentPerHour = paymentPerHour;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public void calculateSalary() {
        int salary = paymentPerHour * hoursWorked;
        System.out.println(name + "'s Salary (Contractor): ₹" + salary);
    }
}
