package collection;


import java.util.*;
import java.util.List;

public class NonGenericCollection {
    public static void main(String[] args) {
        // Non-generic ArrayList (can hold any type of object)
        Set list = new TreeSet();

        list.add("Hello");
        list.add(123);
        list.add(45.67);
        list.add(true);
        System.out.println(list);
        }
    }

