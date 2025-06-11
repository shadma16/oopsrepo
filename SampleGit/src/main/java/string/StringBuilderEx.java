package string;

public class StringBuilderEx {
	public static void main(String[] args) {
        // Creating a StringBuilder object
        StringBuilder sb = new StringBuilder("Hello");

        // 1. append(String s)
        sb.append(" World");
        System.out.println("After append: " + sb);  // Hello World

        // 2. insert(int offset, String s)
        sb.insert(5, ",");
        System.out.println("After insert: " + sb);  // Hello, World

        // 3. replace(int startIndex, int endIndex, String str)
        sb.replace(7, 12, "Java");
        System.out.println("After replace: " + sb);  // Hello, Java

        // 4. delete(int startIndex, int endIndex)
        sb.delete(5, 6);
        System.out.println("After delete: " + sb);  // Hello Java

        // 5. reverse()
        sb.reverse();
        System.out.println("After reverse: " + sb);  // avaJ olleH

        // 6. capacity()
        System.out.println("Capacity: " + sb.capacity());  // default or increased capacity

        // 7. charAt(int index)
        System.out.println("Character at index 3: " + sb.charAt(3));  // J

        // 8. length()
        System.out.println("Length: " + sb.length());  // total number of characters

        // 9. substring(int beginIndex)
        System.out.println("Substring from index 2: " + sb.substring(2));  // aJ olleH

        // 10. substring(int beginIndex, int endIndex)
        System.out.println("Substring from 2 to 5: " + sb.substring(2, 5));  // aJ 
    }

}
