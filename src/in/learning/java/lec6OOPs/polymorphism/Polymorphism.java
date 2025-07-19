package in.learning.java.lec6OOPs.polymorphism;

// ============================
// 1. Compile-time Polymorphism (Method Overloading)
// ============================
class Calculator {

    // Same method name, different parameter types or counts
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

// ============================
// 2. Runtime Polymorphism (Method Overriding)
// ============================

class Animal {
    public void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

// ============================
// Main Class
// ============================
public class Polymorphism {

    public static void main(String[] args) {

        // --------- Compile-time Polymorphism ---------
        Calculator calc = new Calculator();
        System.out.println("Sum of 2 ints: " + calc.add(5, 3));
        System.out.println("Sum of 2 doubles: " + calc.add(2.5, 3.5));
        System.out.println("Sum of 3 ints: " + calc.add(1, 2, 3));

        System.out.println("-------------------------");

        // --------- Runtime Polymorphism ---------
        Animal myAnimal;

        myAnimal = new Dog(); // upcasting
        myAnimal.sound();     // Output: Dog barks

        myAnimal = new Cat(); // upcasting
        myAnimal.sound();     // Output: Cat meows
    }
}

/*
===========================================
🔍 What is Polymorphism?
===========================================
Polymorphism means "many forms". It allows the same interface or method to behave differently based on the context.

Types:
1. Compile-time (Static) Polymorphism → Method Overloading
   - Resolved at compile time.
   - Same method name, different parameters.

2. Runtime (Dynamic) Polymorphism → Method Overriding
   - Resolved at runtime using inheritance and overriding.
   - Parent class reference can call child class methods.

===========================================
🧠 Real-life Example:
===========================================
A person (object) behaves differently:
- As a teacher in a classroom
- As a parent at home
- As a customer in a store

Same person, different behavior → Polymorphism!
*/
