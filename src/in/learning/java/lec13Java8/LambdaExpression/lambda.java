package in.learning.java.lec13Java8.LambdaExpression;

import java.util.Arrays;
import java.util.List;

public class lambda {

    // Functional interface with a single method
    @FunctionalInterface
    interface MathOperation {
        int operate(int a, int b);
    }

    public static void main(String[] args) {
        // Lambda expression for addition
        MathOperation addition = (a, b) -> a + b;

        // Lambda expression for multiplication
        MathOperation multiplication = (a, b) -> a * b;

        // Using lambdas
        int addResult = addition.operate(10, 5);
        int mulResult = multiplication.operate(10, 5);

        System.out.println("Addition Result: " + addResult);         // Output: 15
        System.out.println("Multiplication Result: " + mulResult);   // Output: 50

        // Creating a thread using lambda expression (Runnable)
        Runnable threadTask = () -> {
            System.out.println("Thread started: " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000); // Simulate some task
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
            System.out.println("Thread ended: " + Thread.currentThread().getName());
        };

        Thread thread = new Thread(threadTask);
        thread.start();

        // Using lambda with List.forEach
        List<String> names = Arrays.asList("raj", "sagar", "shivani", "rohan");

        System.out.println("List of names:");
        names.forEach(name -> System.out.println("Hello, " + name));

        // Wait for the thread to finish before ending main
        try {
            thread.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Main method finished.");
    }
}
