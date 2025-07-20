package in.learning.java.lec8Collections.Maps;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class identityHashMap {
    public static void main(String[] args) {
        String key1=new String("key");
        String key2=new String("key");
        Map<String,Integer>map=new HashMap<>(); // String ka own hash code use ho jata h
        Map<String,Integer>map1=new IdentityHashMap<>(); // IdentityHashcode and ==
        map.put(key1,1);
        map.put(key2,2);
        map1.put(key1,1);
        map1.put(key2,2);
        System.out.println(map);
        System.out.println(map1);
        System.out.println(key1.hashCode());
        System.out.println(key2.hashCode());
        System.out.println(System.identityHashCode(key1));
        System.out.println(System.identityHashCode(key2));
    }
}
