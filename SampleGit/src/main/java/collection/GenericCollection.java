package collection;

import java.util.*;
import java.util.List;

public class GenericCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> fruits = new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Orange");
		fruits.add("Grapes");
		fruits.add("Lemon");
		System.out.println(fruits);
		System.out.println(fruits.get(2));
		fruits.set(2, "Watermelon");
		System.out.println(fruits);
		fruits.add("Lemon");
		System.out.println(fruits);
		System.out.println(fruits.indexOf("Lemon"));
		System.out.println(fruits.lastIndexOf("Lemon"));
		fruits.remove(5);
		System.out.println(fruits);
		System.out.println(fruits.contains("Grapes"));
		System.out.println(fruits.isEmpty());
		System.out.println(fruits.size());

		
	}

}