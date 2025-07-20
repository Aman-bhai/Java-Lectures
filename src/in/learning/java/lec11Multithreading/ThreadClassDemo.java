/**
 * ======================================================================
 * 🧵 Java Multithreading - Using the Thread Class (Lecture 11B)
 * ======================================================================
 * 🎯 Topics Covered:
 * - Creating threads by extending Thread class
 * - How Thread class works
 * - Thread lifecycle
 * - Thread naming, sleeping, and execution
 *
 * 📌 NOTE:
 * - You should prefer `Runnable` when possible.
 * - Use `Thread` class directly when you want to override behavior in thread itself.
 */


package in.learning.java.lec11Multithreading;

public class ThreadClassDemo {

    public static void main(String[] args) {
        // =====================================================
        // ✅ Create and start threads by extending Thread class
        // =====================================================
        MyThread t1 = new MyThread(); // Create object
        t1.setName("Thread-1");       // Optional: set a name
        t1.start();                   // Start thread — calls run()

        MyThread t2 = new MyThread();
        t2.setName("Thread-2");
        t2.start();

        // =====================================================
        // ✅ Main thread doing its own task
        // =====================================================
        Thread.currentThread().setName("Main-Thread");
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName() + " 🧠 Working...");
            sleep(400);
        }
    }

    // ✅ Sleep utility method with exception handling
    public static void sleep(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted");
        }
    }
}

// ===============================================================
// ✅ A thread class by extending java.lang.Thread
// ===============================================================
class MyThread extends Thread {
    @Override
    public void run() {
        // Set custom name (optional, already done in main)
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " 🔁 Count: " + i);
            ThreadClassDemo.sleep(500);
        }
    }
}
