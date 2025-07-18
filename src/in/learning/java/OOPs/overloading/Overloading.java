package in.learning.java.OOPs.overloading;

// Class to demonstrate constructor and method overloading
class Calculator {
    int a, b;

    // ===== Constructor Overloading =====

    // Default constructor
    Calculator() {
        this.a = 0;
        this.b = 0;
        System.out.println("Default constructor called.");
    }

    // Constructor with one parameter
    Calculator(int x) {
        this.a = x;
        this.b = 0;
        System.out.println("1-parameter constructor called.");
    }

    // Constructor with two parameters
    Calculator(int x, int y) {
        this.a = x;
        this.b = y;
        System.out.println("2-parameter constructor called.");
    }

    // Method to display the values
    void displayValues() {
        System.out.println("a = " + a + ", b = " + b);
    }

    // ===== Function (Method) Overloading =====

    // add() with no parameters
    int add() {
        return a + b;
    }

    // add() with one parameter
    int add(int x) {
        return x + b;
    }

    // add() with two parameters
    int add(int x, int y) {
        return x + y;
    }

    // add() with double parameters
    double add(double x, double y) {
        return x + y;
    }
}

public class Overloading {
    public static void main(String[] args) {

        // ===== Constructor Overloading in Action =====

        Calculator calc1 = new Calculator();             // Calls default constructor
        calc1.displayValues();

        Calculator calc2 = new Calculator(10);           // Calls 1-arg constructor
        calc2.displayValues();

        Calculator calc3 = new Calculator(10, 20);       // Calls 2-arg constructor
        calc3.displayValues();

        // ===== Function Overloading in Action =====

        System.out.println("\n=== Method Overloading Results ===");
        System.out.println("calc3.add() = " + calc3.add());             // Uses instance a + b
        System.out.println("calc3.add(5) = " + calc3.add(5));           // Adds 5 + b
        System.out.println("calc3.add(3, 7) = " + calc3.add(3, 7));     // Adds 3 + 7
        System.out.println("calc3.add(2.5, 4.5) = " + calc3.add(2.5, 4.5)); // Adds double values
    }
}
