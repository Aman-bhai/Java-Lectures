package in.learning.java.lec11Multithreading;



/**
 * =========================================================================
 * 🌙 Java Multithreading - Daemon Threads (Lecture 14)
 * =========================================================================
 * 🎯 What is a Daemon Thread?
 * - A thread that runs in the background.
 * - JVM does not wait for it to finish if all user threads end.
 * - Often used for logging, cleanup, monitoring, GC, etc.
 */


public class DaemonThread {

    public static void main(String[] args) {

        System.out.println("🚀 Main Thread Started");

        // ✅ Create a daemon thread
        Thread daemon = new Thread(() -> {
            while (true) {
                System.out.println("🌙 Daemon thread is running in background...");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("Daemon thread interrupted");
                    break;
                }
            }
        });

        daemon.setDaemon(true); // Important: must be set before start()
        daemon.start();

        // ✅ User thread: performs some task then ends
        Thread userThread = new Thread(() -> {
            System.out.println("👤 User thread is doing important work...");
            try {
                Thread.sleep(2000); // simulate work
            } catch (InterruptedException e) {
                System.out.println("User thread interrupted");
            }
            System.out.println("✅ User thread finished its work.");
        });

        userThread.start();

        try {
            userThread.join(); // Wait for user thread to finish
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        System.out.println("🏁 Main Thread Exiting (Daemon will be killed if running)");
    }
}
