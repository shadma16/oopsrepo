package collection;

import java.util.ArrayList;

public class ColorList {
	
	public static void main(String[] args) {
	        // Create ArrayList
	        ArrayList<String> colors = new ArrayList<>();

	        // Add colors
	        colors.add("Red");
	        colors.add("Blue");
	        colors.add("Green");
	        colors.add("Yellow");
	        colors.add("Purple");

	        // Print the collection
	        System.out.println("Color List: " + colors);
	        
	     // Get element at index 2
	        String colorAt2 = colors.get(2);
	        System.out.println("Element at index 2: " + colorAt2);
	        
	        System.out.println("Iterating through list:");
	        for (String color : colors) {
	            System.out.println(color);
	        }
	        
	        colors.remove(2); // removes "Green"
	        System.out.println("After removing third element: " + colors);
	        
	        String searchColor = "Blue";
	        if (colors.contains(searchColor)) {
	            System.out.println(searchColor + " is found in the list.");
	        } else {
	            System.out.println(searchColor + " is not found in the list.");
	        }
	}
}



/*import java.util.ArrayList;

public class ListMethodsExample {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        // 1. add() – Add elements to the list
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Apple"); // duplicate element
        System.out.println("Fruits List: " + fruits);

        // 2. get() – Get element at index 2
        System.out.println("Element at index 2: " + fruits.get(2));

        // 3. set() – Replace element at index 1
        fruits.set(1, "Orange");
        System.out.println("After set(): " + fruits);

        // 4. indexOf() – Index of first occurrence of "Apple"
        System.out.println("First index of 'Apple': " + fruits.indexOf("Apple"));

        // 5. lastIndexOf() – Index of last occurrence of "Apple"
        System.out.println("Last index of 'Apple': " + fruits.lastIndexOf("Apple"));

        // 6. remove() – Remove element at index 0
        fruits.remove(0);
        System.out.println("After remove(): " + fruits);

        // 7. contains() – Check if list contains "Mango"
        System.out.println("Contains 'Mango'? " + fruits.contains("Mango"));

        // 8. isEmpty() – Check if list is empty
        System.out.println("Is list empty? " + fruits.isEmpty());

        // 9. size() – Number of elements in the list
        System.out.println("List size: " + fruits.size());
    }
}
*/

