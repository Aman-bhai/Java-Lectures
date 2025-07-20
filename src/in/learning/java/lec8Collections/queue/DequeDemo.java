package in.learning.java.lec8Collections.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeDemo {
    public static void main(String[] args) {
      // double-ended queue
      // allows insertion and removal of elements of both side
        // versatile than regular queues and stacks because they support all the operations of both
       /*
        Insertion
                addFirst(E e)
                addLast(E e)
                offerFirst(E e)
                offerLast(E e)  */
        Deque<Integer>de=new ArrayDeque<>();  // faster iteration, low memory , no null allowed
    // circular array, no need to shift elements
        de.addFirst(10);
        de.addLast(20);
        de.offerFirst(5);
        de.offerLast(25);

        // 5 10 20 25

        System.out.println("Get First Element : "+de.getFirst());
        System.out.println("Get Last Element : "+de.getLast());
        de.removeFirst();
        de.removeLast();
        Deque<Integer>de2=new LinkedList<>();  // insertion, deletion,somewhere
    }
}
