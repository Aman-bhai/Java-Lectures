package in.learning.java.lec8Collections.queue;

public class BlockingQue {
    public static void main(String[] args) {
        // thread safe queue
        // wait for queue to become non-empty/ wait for space
        // simplify concurrency problems like producer-consumer
        // standard queue ---> immediately
            // empty --->remove(no waiting)
            // full --->add(no waiting)

        // blocking queue
            // put -->blocks if the queue is full until space becomes available
            // take --> blocks if the queue is empty until an element becomes available
            // offer-->wait for space to become available , up to the specified timeout

    }
}
