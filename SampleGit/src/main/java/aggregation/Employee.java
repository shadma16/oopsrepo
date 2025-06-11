package aggregation; // second class

public class Employee {
    int id;
    String name;
    Address address;  // Aggregation (HAS-A)

    Employee(int i, String n, Address a) {
        id = i;
        name = n;
        address = a;
    }

    void showEmployee() {
        System.out.println("ID: " + id + ", Name: " + name);
        address.showAddress();
    }

    public static void main(String[] args) {
        Address addr = new Address("Mumbai", "Maharashtra");
        Employee emp = new Employee(101, "Anil", addr);
        emp.showEmployee();
    }
}
