package in.learning.java.lec8Collections.List;

import java.util.LinkedList;

public class linkedList {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList1=new LinkedList<>();
        linkedList1.add(7);
        linkedList1.add(14);
        linkedList1.add(5);
        linkedList1.add(9);
        linkedList1.add(4);
        linkedList1.add(1);

        System.out.println("Linked list Printing : "+linkedList1);
        System.out.println("First and Last element of Linked List are : "+linkedList1.getFirst()+" , "+linkedList1.getLast());
        System.out.println(linkedList1.removeIf(x->x%2==0));
        System.out.println(linkedList1);
    }
}
