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

