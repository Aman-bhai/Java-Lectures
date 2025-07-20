package in.learning.java.lec8Collections.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo
{
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer>list=new CopyOnWriteArrayList<>();
        // "Copy on Write" means that whenever a write operation
        // like adding or removing an element
        // instead of directly modifying the existing list
        // a new copy of the list is created, and the modification is applied to that copy
        // This ensures that other threads reading the list while it's being modified are unaffected

        //Read Operations: Fast and direct , since they happen on a stable list without interference from modifications.
        // Write Operations: A new copy of the list is created for every modification.
        //The reference of the list is then updated so that subsequent  reads use this new list.


        List<String>shoppingList=new CopyOnWriteArrayList<>(Arrays.asList("Apple","Banana","Eggs"));
        for (String i :shoppingList) {
            System.out.println("item : "+i);
            if(i.equals("Eggs")){
                shoppingList.add("Butter");
                System.out.println("Added Butter while reading ...");
            }
        }
        System.out.println("Shopping List Updated!");
        System.out.println("Updated List : "+shoppingList);
    }
}
