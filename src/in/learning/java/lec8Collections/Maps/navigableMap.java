package in.learning.java.lec8Collections.Maps;

import java.util.NavigableMap;
import java.util.TreeMap;

public class navigableMap {
    public static void main(String[] args) {
        NavigableMap<Integer,String>mp= new TreeMap <>();
        mp.put(1,"Raj");
        mp.put(3,"Amar");
        mp.put(2,"krishna");
        System.out.println(mp);
        System.out.println(mp.lowerEntry(3));
        System.out.println(mp.higherEntry(2));
        System.out.println(mp.lowerEntry(3));
        System.out.println(mp.ceilingKey(4));
        System.out.println(mp.descendingMap());
    }
}
