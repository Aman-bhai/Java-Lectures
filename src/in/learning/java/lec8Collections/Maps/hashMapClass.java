package in.learning.java.lec8Collections.Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hashMapClass {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"Raj");
        map.put(2,"Shubham");
        map.put(3,"Mahesh");
        map.put(4,"Tony");



        System.out.println("Display Map : "+map);
        System.out.println("Access element of map using key : "+map.get(3));
        System.out.println("Access element of map using key : "+map.get(6));
        System.out.println("Check element in map exists or not using key : "+map.containsKey(3));
        System.out.println("Check element in map exists or not using value : "+map.containsValue("Tony"));

        Set<Integer>keys=map.keySet();
        for(int i :keys){
            System.out.println("item : "+map.get(i));
        }
        Set<Map.Entry<Integer, String>> entries = map.entrySet();

        for (Map.Entry<Integer, String> entry:entries){
            System.out.println(entry.getKey()+" "+entry.getValue());
            entry.setValue(entry.getValue().toUpperCase());
        }

        System.out.println(map);
        map.remove(4);
        System.out.println(map);

    }
}
