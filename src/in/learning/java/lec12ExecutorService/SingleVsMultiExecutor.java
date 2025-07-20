package in.learning.java.lec12ExecutorService;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleVsMultiExecutor {

    public static void main(String[] args) {
        System.out.println("🔰 Main Thread: " + Thread.currentThread().getName());

        // ======================================================
        // ✅ Single-threaded executor (sequential execution)
        // ======================================================
        System.out.println("\n🔄 Running tasks using SINGLE-threaded executor");
        ExecutorService singleExecutor = Executors.newSingleThreadExecutor();

        for (int i = 1; i <= 3; i++) {
            final int taskId = i;
            singleExecutor.submit(() -> {
                String threadName = Thread.currentThread().getName();
                System.out.println("🟢 Task " + taskId + " STARTED by " + threadName);
                sleep(1000); // Simulate work
                System.out.println("✅ Task " + taskId + " FINISHED by " + threadName);
            });
        }

        singleExecutor.shutdown();

        // ======================================================
        // ✅ Multi-threaded executor (parallel execution)
        // ======================================================
        System.out.println("\n🚀 Running tasks using MULTI-threaded executor");
        ExecutorService multiExecutor = Executors.newFixedThreadPool(3); // 3 threads

        for (int i = 1; i <= 3; i++) {
            final int taskId = i;
            multiExecutor.submit(() -> {
                String threadName = Thread.currentThread().getName();
                System.out.println("🧵 Task " + taskId + " STARTED by " + threadName);
                sleep(1000);
                System.out.println("🏁 Task " + taskId + " FINISHED by " + threadName);
            });
        }

        multiExecutor.shutdown();

        System.out.println("\n🔚 Main thread ends.");
    }

    // Utility method to simulate work
    private static void sleep(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            System.out.println("Interrupted!");
        }
    }
}
