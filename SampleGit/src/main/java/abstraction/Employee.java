package abstraction;

public abstract class Employee {
	// Abstract superclass

	    String name;

	    public Employee(String name) {
	        this.name = name;
	    }

	    // Abstract method to be implemented in subclasses
	    public abstract void calculateSalary();
	}



