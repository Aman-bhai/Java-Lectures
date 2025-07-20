package in.learning.java.lec8Collections.Maps;

import java.util.Hashtable;

public class HashTable
{
    public static void main(String[] args) {
        Hashtable<Integer,String>ht=new Hashtable<>();
        // in hashmap atmost one key is null but in hashtable neither key nor value is null
        // hashtable is synhronized
        // legacy class
        // only uses linked list in case of collision
        // ek baar mein ek hi thread use kr sakta hai hashtable ko

        ht.put(1,"aman");
        ht.put(2,"raman");
        ht.put(3,"kuar");

        System.out.println(ht);
        System.out.println(ht.get(2));
        System.out.println(ht.containsKey(3));

    }
}
