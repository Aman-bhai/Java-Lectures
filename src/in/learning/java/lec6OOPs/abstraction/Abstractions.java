// File: Abstractions.java
// Package
package in.learning.java.lec6OOPs.abstraction;

// ============================
// Abstract Class (Partial Abstraction)
// ============================
abstract class Vehicle {

    // Concrete method (non-abstract)
    public void fuel() {
        System.out.println("Vehicle needs fuel");
    }

    // Abstract method (no body)
    public abstract void start();

    public abstract void stop();
}

// Concrete class (implements abstract methods)
class Car extends Vehicle {

    @Override
    public void start() {
        System.out.println("Car starts with key");
    }

    @Override
    public void stop() {
        System.out.println("Car stops with brake");
    }
}

// ============================
// Interface (Full Abstraction)
// ============================
interface Flyable {

    // All methods are public abstract by default
    void fly();

    // Static method in interface (Java 8+)
    static void info() {
        System.out.println("Flyable interface can be implemented by any flying object");
    }

    // Default method (Java 8+)
    default void land() {
        System.out.println("Landing using default method");
    }
}

class Drone implements Flyable {

    @Override
    public void fly() {
        System.out.println("Drone is flying with rotors");
    }

    // Optional: override default method
    @Override
    public void land() {
        System.out.println("Drone is landing slowly");
    }
}

// ============================
// Main Class to Run Everything
// ============================
public class Abstractions {

    public static void main(String[] args) {
        // Using abstract class
        Vehicle myVehicle = new Car();
        myVehicle.fuel();      // Concrete method
        myVehicle.start();     // Abstract method overridden
        myVehicle.stop();      // Abstract method overridden

        System.out.println("------------------------");

        // Using interface
        Flyable myFlyable = new Drone();
        myFlyable.fly();       // Abstract method implemented
        myFlyable.land();      // Default method (or overridden)

        // Static method (interface)
        Flyable.info();        // Called directly from interface
    }
}

/*
===========================
🔍 Explanation:
===========================

1. What is Abstraction?
   - Hiding internal details and showing only the **essential features**.
   - In Java, abstraction is achieved using:
     ✅ Abstract classes (partial abstraction)
     ✅ Interfaces (full abstraction)

2. Abstract Class:
   - Can have both **abstract** and **concrete** methods.
   - Cannot be instantiated.
   - Can have constructors and instance variables.
   - Supports multiple levels of abstraction.
   - Used when some common functionality should be shared across subclasses.

3. Interface:
   - Achieves **100% abstraction** (before Java 8).
   - Only abstract methods (Java 7 or earlier).
   - Since Java 8, supports `default` and `static` methods.
   - Since Java 9, supports `private` methods too.
   - A class can implement **multiple interfaces** (unlike abstract class).

4. Key Differences:
   - ✅ Abstract Class: "is-a" relationship; supports partial abstraction.
   - ✅ Interface: "can-do" relationship; supports multiple inheritance.
*/

