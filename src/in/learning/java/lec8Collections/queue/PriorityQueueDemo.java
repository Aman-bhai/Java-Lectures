package in.learning.java.lec8Collections.queue;
import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        // part of queue interface
        // orders elements based on their natural ordering (for primitives lowest first)
        // custom comparator for custom ordering
        // does not allow null values


        PriorityQueue<Integer>pq=new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(15);
        pq.add(10);
        pq.add(30);
        pq.add(5);
        System.out.println(pq.peek());

        // internal working

        // priority queue is implemented as a  min-heap default

    }
}
