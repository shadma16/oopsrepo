package string;

public class StringExample {
	
	
	    public static void main(String[] args) {
	        String a = "Java";
	        String b = "Java";
	        String c = new String("Java");
	        String d = new String("Java");

	        // Reference comparison
	        System.out.println(a == b); // true (same pool object)
	        System.out.println(a == c); // false (literal vs new)
	        System.out.println(c == d); // false (two new objects)

	        // Value comparison
	        System.out.println(a.equals(b)); // true
	        System.out.println(a.equals(c)); // true
	        System.out.println(c.equals(d)); // true
	    }
	}



