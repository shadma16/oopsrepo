package string;

public class StringClass {

	public static void main(String[] args) {
		
	
		        String text = "Java Programming";
		        

		        // 1. length()
		        System.out.println("Length: " + text.length());

		        // 2. charAt()
		        System.out.println("Character at index 5: " + text.charAt(5));

		        // 3. valueOf()
		        int number = 2025;
		        String numberStr = String.valueOf(number);
		        
		        System.out.println("Value of number: " + numberStr);

		        // 4. equals()
		        System.out.println("Equals 'java programming'? " + text.equals("java programming"));

		        // 5. equalsIgnoreCase()
		        System.out.println("EqualsIgnoreCase 'java programming'? " + text.equalsIgnoreCase("java programming"));

		        // 6. isEmpty()
		        String emptyStr = "";
		        System.out.println("Is empty string empty? " + emptyStr.isEmpty());

		        // 7. concat()
		        String greeting = "Hello, ";
		        String name = "Alice";
		        System.out.println("Concatenated: " + greeting.concat(name));

		        // 8. toUpperCase()
		        System.out.println("Uppercase: " + text.toUpperCase());

		        // 9. toLowerCase()
		        System.out.println("Lowercase: " + text.toLowerCase());

		        // 10. contains()
		        System.out.println("Contains 'Program'? " + text.contains("Program"));

		          }

		// TODO Auto-generated method stub

	}

