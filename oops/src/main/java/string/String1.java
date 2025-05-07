package string;

public class String1 {
    public static void main(String[] args) {
        String1 obj = new String1();
        obj.palindrome("Java");
        obj.palindrome("MallayalaM");
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

