package in.learning.java.lec8Collections.Maps;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapDemo {
    public static void main(String[] args) {
        Map<String,Integer>map1=new HashMap<>();
        map1.put("A",1);
        map1.put("B",2);
       Map<String,Integer>map2= Collections.unmodifiableMap(map1);
        System.out.println(map2);

        Map<String,Integer>map3=Map.of("Shubham",20,"Akshit",30);  // only 10 records
        Map<String,Integer>map4=Map.ofEntries(Map.entry("Akshit",99),Map.entry("Rajesh",70));
    }
}
