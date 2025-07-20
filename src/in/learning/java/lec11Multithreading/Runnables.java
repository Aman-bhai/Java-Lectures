/**
 * ======================================================================
 * 📘 Java Multithreading - Runnable Interface (Lecture 11)
 * ======================================================================
 * 🎯 Topics Covered:
 * - What is multithreading?
 * - How to create threads using the Runnable interface
 * - Advantages of Runnable over Thread class
 * - Anonymous Runnable and Lambda expressions
 * - Using Thread.sleep and naming threads
 * 
 * 🧠 Key Concepts:
 * - Thread: a unit of execution
 * - Runnable: defines a task to be run by a thread
 * - start(): begins the thread
 * - run(): contains the code that executes in the new thread
 * 
 * ✅ Benefits of using Runnable:
 * - You can extend other classes (Java allows only single inheritance)
 * - Promotes separation of logic (task vs thread control)
 */

package in.learning.java.lec11Multithreading;

public class Runnables {

    public static void main(String[] args) {

        // ================================================================
        // ✅ 1. Creating a thread using a class that implements Runnable
        // ================================================================
        MyRunnable myTask = new MyRunnable();     // Step 1: Create Runnable
        Thread t1 = new Thread(myTask);           // Step 2: Pass Runnable to Thread
        t1.setName("MyRunnable-Thread");          // Optional: Set thread name
        t1.start();                               // Step 3: Start the thread

        // ================================================================
        // ✅ 2. Creating a thread using an anonymous Runnable class
        // ================================================================
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Thread.currentThread().setName("Anonymous-Runnable");
                for (int i = 1; i <= 5; i++) {
                    System.out.println(Thread.currentThread().getName() + " ➡️ Counting: " + i);
                    sleep(500);
                }
            }
        });
        t2.start();

        // ================================================================
        // ✅ 3. Creating a thread using a Lambda expression (Java 8+)
        // ================================================================
        Thread t3 = new Thread(() -> {
            Thread.currentThread().setName("Lambda-Runnable");
            for (int i = 5; i >= 1; i--) {
                System.out.println(Thread.currentThread().getName() + " ⏬ Counting down: " + i);
                sleep(500);
            }
        });
        t3.start();

        // ================================================================
        // ✅ 4. Work done by the main thread
        // ================================================================
        Thread.currentThread().setName("Main-Thread");
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName() + " 💡 Main doing work...");
            sleep(400);
        }
    }

    /**
     * ✅ Utility method to handle Thread.sleep() with exception handling
     */
    public static void sleep(int ms) {
        try {
            Thread.sleep(ms); // Pauses current thread for given milliseconds
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted!");
        }
    }
}

/**
 * ================================================================
 * 🎯 Class that implements the Runnable interface
 * ================================================================
 * Implements the run() method which defines the thread's task
 */
class MyRunnable implements Runnable {

    @Override
    public void run() {
        Thread.currentThread().setName("MyRunnable");
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " 🔁 Iteration: " + i);
            Runnables.sleep(500); // Use static method from main class
        }
    }
}
