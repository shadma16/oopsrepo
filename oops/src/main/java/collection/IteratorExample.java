package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Set<String> names = new HashSet<String>();
       
       names.add("Tom");
       names.add("Bob");
       names.add("Ram");
       names.add("Alice");
       System.out.println(names);
       
       Iterator i = names.iterator();
       
       while(i.hasNext())
       {
    	   System.out.println(i.next());
       }
       i.remove();
       System.out.println(names);
	}

}