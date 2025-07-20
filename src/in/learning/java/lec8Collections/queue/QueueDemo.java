package in.learning.java.lec8Collections.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueDemo
{
    public static void main(String[] args) {

        LinkedList<Integer>list=new LinkedList<>();
        list.addFirst( 3);
        list.add(2);  // enqueue
        list.add(1);
        System.out.println(list);
        list.removeFirst();
        System.out.println(list.getFirst());

        Queue<Integer>que=new LinkedList<>();
         que.add(5);
        que.add(4);
        que.add(3);
        System.out.println(que);

        Queue<Integer>q=new ArrayBlockingQueue<>(2);

    }
}
