package in.learning.java.lec8Collections.Maps;

import java.util.SortedMap;
import java.util.TreeMap;

public class sortedMap
{
// sortmap interface and treemap is its implementation
    // red black tree->self balancing binary search tree
    public static void main(String[] args) {
        SortedMap<String,Integer>sm=new TreeMap<>((a,b)->b.length()-a.length());
        sm.put("Vivek",91);
        sm.put("Shubham",99);
        sm.put("Mohit",90);
        sm.put("Raj",70);
        sm.put("Amar",99);

        System.out.println(sm);
        System.out.println(sm.firstKey());
        System.out.println(sm.lastKey());
        System.out.println(sm.headMap("Raj"));  //exclude
        System.out.println(sm.tailMap("Raj"));


    }
}
