package string;

public class String1 {
    public static void main(String[] args) {
        String1 obj = new String1();
        obj.palindrome("Java");
        obj.palindrome("Malayalam");
    }

    public void palindrome(String str) {
        StringBuilder s = new StringBuilder(str);
        String s1= s.reverse().toString();
        boolean flag = s1.equalsIgnoreCase(str);

        if (flag) {
            System.out.println("The given string is a palindrome");
        } else {
            System.out.println("The given string is not a palindrome");
        }
    }
}


/*package string;

public class CheckPalindrome {

    public static void main(String[] args) {

        StringBuffer s1 = new StringBuffer("Java");
        StringBuffer s2 = new StringBuffer("Malayalam");

        // Store original values (before reversing)
        StringBuffer s3 = new StringBuffer(s1);
        StringBuffer s4 = new StringBuffer(s2);

        // Reverse s1 and s2
        s1.reverse();
        s2.reverse();

        // Print reversed and original values
        System.out.println("Reversed s1: " + s1);
        System.out.println("Reversed s2: " + s2);
        System.out.println("Original s3: " + s3);
        System.out.println("Original s4: " + s4);

        // Compare using equalsIgnoreCase by converting to String
        if (s1.toString().equalsIgnoreCase(s3.toString())) {
            System.out.println(s3 + " is a Palindrome (case ignored)");
        } else {
            System.out.println(s3 + " is Not a Palindrome");
        }

        if (s2.toString().equalsIgnoreCase(s4.toString())) {
            System.out.println(s4 + " is a Palindrome (case ignored)");
        } else {
            System.out.println(s4 + " is Not a Palindrome");
        }
    }
}
*/
