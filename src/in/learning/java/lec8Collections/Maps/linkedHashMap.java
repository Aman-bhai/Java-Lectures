package in.learning.java.lec8Collections.Maps;

import java.util.*;

public class linkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> lhm=new LinkedHashMap<>();  // order maintained  (double linked list)
        HashMap<String,Integer>map=new HashMap<>();  // order not maintained
        lhm.put("Orange",10);
        lhm.put("Apple",15);
        lhm.put("Banana",5);

        Set<Map.Entry<String, Integer>> entries = lhm.entrySet();
        for(Map.Entry<String, Integer> entry : entries){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}
