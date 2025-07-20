package in.learning.java.lec8Collections.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;

public class setOverview {
    public static void main(String[] args) {
       // set is a collection that cannot contain duplicate elements
       // faster operations
        // Map -->Hashmap, LinkedHashMap, TreeMap, EnumMap
        // Set  ---> HashSet, LinkedHashSet, TreeSet, EnumSet

        Set<Integer>set1=new HashSet<>();
        set1.add(12);
        set1.add(1);
        set1.add(5);
        System.out.println(set1);

        Set<Integer>set2=new LinkedHashSet<>();
        set2.add(12);
        set2.add(1);
        set2.add(5);
        System.out.println(set2);
        System.out.println(set1.contains(12));
        System.out.println(set1.remove(12));

        // for thread safe
Set<Integer> integers= Collections.synchronizedSet(set2); // block (no concurrecy)
Set<Integer> sett=new ConcurrentSkipListSet<>();


    }
}
