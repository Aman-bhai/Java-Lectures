package in.learning.java.lec6OOPs.abstraction;

// ===========================================
// 1. Interface Declaration
// ===========================================
interface Walkable {
    void walk(); // abstract method

    default void rest() {
        System.out.println("Taking a rest after walking"); // default method (Java 8+)
    }

    static void description() {
        System.out.println("Walkable describes things that can walk"); // static method
    }
}

// ===========================================
// 2. Another Interface
// ===========================================
interface Runnable {
    void run(); // abstract method
}

// ===========================================
// 3. Class implementing multiple interfaces
// ===========================================
class Human implements Walkable, Runnable {

    @Override
    public void walk() {
        System.out.println("Human walks upright");
    }

    @Override
    public void run() {
        System.out.println("Human runs on two legs");
    }
}

// ===========================================
// 4. Interface Inheritance
// ===========================================
interface SmartWalkable extends Walkable {
    void navigate(); // New abstract method
}

class Robot implements SmartWalkable {

    @Override
    public void walk() {
        System.out.println("Robot walks mechanically");
    }

    @Override
    public void navigate() {
        System.out.println("Robot navigates using sensors");
    }
}

// ===========================================
// 5. Main Class
// ===========================================
public class Interfaces {

    public static void main(String[] args) {
        // Human uses both Walkable and Runnable
        Human h = new Human();
        h.walk();
        h.run();
        h.rest();               // from default method
        Walkable.description(); // static method from interface

        System.out.println("------------------");

        // Robot implements SmartWalkable
        Robot r = new Robot();
        r.walk();
        r.navigate();
        r.rest(); // inherited default method from Walkable
    }
}

/*
===================================================
🧠 INTERFACE CONCEPTS SUMMARY
===================================================

✅ Interface:
- A contract for what a class can DO (not what it IS)
- Only method declarations (abstract) before Java 8

✅ From Java 8 Onward:
- Can contain:
  - abstract methods
  - default methods (with body)
  - static methods

✅ Interface vs Abstract Class:
- Interface = full abstraction (until Java 8)
- A class can implement **multiple interfaces**
- Used for **CAN-DO relationships**

✅ Multiple Inheritance:
- Java doesn’t allow multiple inheritance with classes
- But interfaces make it possible:
    class X implements A, B

✅ Interface Inheritance:
- One interface can extend another
  interface B extends A

*/
