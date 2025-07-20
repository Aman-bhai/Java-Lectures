package in.learning.java.lec12ExecutorService;

/**
 * ======================================================================================
 * 🚀 Java Multithreading - ExecutorService (Lecture 12)
 * ======================================================================================
 *
 * ✅ What is ExecutorService?
 * --------------------------------------------------------------------------------------
 * ExecutorService is a part of the java.util.concurrent package. It provides a powerful
 * and flexible framework for managing a pool of threads, executing tasks asynchronously,
 * and handling lifecycle management of threads.
 *
 * 🎯 Benefits:
 * - Avoids manual thread creation and management
 * - Supports thread pooling (reusing threads)
 * - Useful for running large numbers of short-lived tasks
 * - Provides cleaner API for task submission and shutdown
 *
 * ✅ Types of Executors:
 * --------------------------------------------------------------------------------------
 * - Executors.newSingleThreadExecutor() → One thread
 * - Executors.newFixedThreadPool(n)     → Fixed number of threads
 * - Executors.newCachedThreadPool()     → Dynamic threads (growable)
 * - Executors.newScheduledThreadPool(n) → Scheduled tasks with delay
 */


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceDemo {

    public static void main(String[] args) {

        System.out.println("🚦 Main Thread Started: " + Thread.currentThread().getName());

        // ===========================================================
        // ✅ Create a thread pool with 3 threads
        // ===========================================================
        ExecutorService executor = Executors.newFixedThreadPool(3);  // Pool of 3 threads

        // ✅ Submit 6 tasks to the executor (Runnable jobs)
        for (int i = 1; i <= 6; i++) {
            int taskId = i;
            executor.submit(() -> {
                String threadName = Thread.currentThread().getName();
                System.out.println("🔧 Task " + taskId + " is being executed by " + threadName);
                try {
                    Thread.sleep(1000); // simulate task
                } catch (InterruptedException e) {
                    System.out.println("❗ Task interrupted");
                }
                System.out.println("✅ Task " + taskId + " completed by " + threadName);
            });
        }

        // ===========================================================
        // ✅ Shut down the executor
        // ===========================================================
        executor.shutdown(); // Rejects new tasks, waits for existing tasks to complete

        try {
            if (!executor.awaitTermination(10, TimeUnit.SECONDS)) {
                executor.shutdownNow(); // Force shutdown if tasks not finished in time
            }
        } catch (InterruptedException e) {
            executor.shutdownNow();
        }

        System.out.println("🏁 Main Thread Finished: " + Thread.currentThread().getName());
    }
}
