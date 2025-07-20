package in.learning.java.lec11Multithreading;

/**
 * ===================================================================
 * 🔐 Java Multithreading - Synchronization & Thread.join() (Lecture 12)
 * ===================================================================
 * 🎯 Topics Covered:
 * - What is thread synchronization?
 * - Avoiding race conditions with synchronized keyword
 * - Using join() to wait for threads to finish
 */


public class ThreadSyncJoinDemo {

    public static void main(String[] args) {

        // ✅ Shared object between threads
        Counter counter = new Counter();

        // ✅ Two threads accessing the same object
        Thread t1 = new Thread(() -> {
            Thread.currentThread().setName("Thread-A");
            counter.increment(); // critical section
        });

        Thread t2 = new Thread(() -> {
            Thread.currentThread().setName("Thread-B");
            counter.increment(); // critical section
        });

        // ✅ Start threads
        t1.start();
        t2.start();

        // ✅ join(): Wait for both threads to finish
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }

        // ✅ Final result after both threads finish
        System.out.println("✅ Final Counter Value: " + counter.getCount());
    }
}

// ============================================================
// 🔁 Shared resource class with synchronized method
// ============================================================
class Counter {
    private int count = 0;

    // ✅ Synchronized block to avoid race conditions
    public synchronized void increment() {
        for (int i = 0; i < 5; i++) {
            count++;
            System.out.println(Thread.currentThread().getName() + " ➕ count = " + count);
            sleep(300);
        }
    }

    public int getCount() {
        return count;
    }

    // Utility sleep method
    public static void sleep(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            System.out.println("Sleep interrupted");
        }
    }
}
