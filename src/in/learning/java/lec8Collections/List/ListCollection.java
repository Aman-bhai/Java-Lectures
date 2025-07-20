package in.learning.java.lec8Collections.List;

import java.util.*;

class myComparator implements Comparator<Integer>{
    @Override
    public int compare(Integer a,Integer b) {
        return b-a;
    }
}

public class ListCollection {
    public static void main(String[] args) {
        ArrayList<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();

        list1.add(4);
        list1.add(8);
        list1.add(9);

        System.out.println("\nValue at index1 in list1 : "+list1.get(1));
        System.out.println("List1 contain element 5 or not : "+list1.contains(5));
        System.out.println("List1 contains element 9 or not : "+list1.contains(9));
        list1.remove(2);
        list1.set(1,50);
        list1.add(2,55);
        System.out.println("List1 Printing : "+list1);
        System.out.println("Size of ArrayList1 : "+list1.size());
        System.out.println("First element of ArrayList1 : "+list1.getFirst());
        System.out.println("Last element of ArrayList1 : "+list1.getLast());


        list2.add(44);
        list2.add(88);
        list2.add(99);
        list2.add(9);
        list2.remove(Integer.valueOf(99));
        System.out.println("Element at index 1 of list2 : "+list2.get(1));
        System.out.println("Displaying List2 before sorting : "+list2);
        Collections.sort(list2);
        System.out.println("Displaying List2 after sorting in ascending order : "+list2);
//      list2.sort(new myComparator());
        list2.sort((a,b)->b-a);
        System.out.println("Displaying List2 after sorting in descending order : "+list2);

        System.out.println("Size of ArrayList2 : "+list2.size());


       List<String>arr= Arrays.asList("Good","Monring","Raj"); // can modify
        System.out.println(arr);

        List<Integer> arr2=List.of(1,2,3,4);  // cannot modify (immutable)
        System.out.println(arr2);


    }

}
