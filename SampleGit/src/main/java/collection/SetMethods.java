package collection;

import java.util.HashSet;
import java.util.Set;

public class SetMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> s = new HashSet<String>();
		s.add("Apple");
		s.add("Orange");
		s.add("Watermelon");
		Set<String> s1 = new HashSet<String>();
		s1.add("banana");
		s1.add("Lemon");
		System.out.println(s);
	    s.addAll(s1);
	    System.out.println(s);
	    System.out.println(s1);
	    
	    System.out.println(s.contains("banana"));
	    System.out.println(s1.containsAll(s));
	    
	    System.out.println(s.isEmpty());
	    s.remove("Apple");
	    System.out.println(s);
	    s.removeAll(s1);
	    System.out.println(s);
	    
	    
	    System.out.println(s.size());
	}

}
