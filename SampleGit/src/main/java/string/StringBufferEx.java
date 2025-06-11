package string;

public class StringBufferEx {
	public static void main(String[] args) {
        // Creating StringBuffer object
        StringBuffer sb = new StringBuffer("Hello");

        // 1. append(String s)
        sb.append(" World");
        System.out.println("After append: " + sb);  // Hello World

        // 2. insert(int offset, String s)
        sb.insert(5, ",");
        System.out.println("After insert: " + sb);  // Hello, World

        // 3. replace(int startIndex, int endIndex, String str)
        sb.replace(6, 11, "Java");
        System.out.println("After replace: " + sb);  // Hello,Java

        // 4. delete(int startIndex, int endIndex)
        sb.delete(5, 6);
        System.out.println("After delete: " + sb);  // HelloJava

        // 5. reverse()
        sb.reverse();
        System.out.println("After reverse: " + sb);  // avaJolleH

        // 6. capacity
        System.out.println("Buffer capacity: " + sb.capacity());  // Default capacity or more
    }

}
