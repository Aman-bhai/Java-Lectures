// File: OverridingExample.java
// Package structure
package in.learning.java.lec6OOPs.overriding;

// Base class (also called Superclass or Parent class)
class Animal {
    
    // Method to be overridden
    public Animal speak() {
        System.out.println("Animal speaks");
        return this;
    }

    public void eat() {
        System.out.println("Animal eats");
    }
}

// Subclass (Child class that overrides the method)
class Dog extends Animal {

    // Overriding the speak() method with covariant return type
    @Override
    public Dog speak() {
        System.out.println("Dog barks");
        return this; // Covariant return: returning a more specific type (Dog)
    }

    // Overriding eat method (same signature, same return type)
    @Override
    public void eat() {
        System.out.println("Dog eats bones");
    }

    // This method is unique to Dog
    public void wagTail() {
        System.out.println("Dog wags tail");
    }
}

public class overRiding {

    public static void main(String[] args) {
        // Superclass reference to subclass object (Polymorphism)
        Animal myAnimal = new Dog();

        // Calls overridden method in Dog
        myAnimal.speak(); // Output: Dog barks

        // Calls overridden eat() method in Dog
        myAnimal.eat(); // Output: Dog eats bones

        // Covariant return type allows calling Dog methods after casting
        Dog myDog = (Dog) myAnimal;
        myDog.wagTail(); // Output: Dog wags tail
    }
}

/*
===========================
🔍 Explanation:
===========================

1. Method Overriding:
   - When a subclass provides a specific implementation of a method that is already defined in its superclass.
   - Must have the **same method name**, **same parameters**, and **compatible return type**.

2. Overridden Method:
   - The method in the superclass that gets overridden in the subclass.

3. @Override Annotation:
   - Used for compile-time checking to ensure the method is indeed overriding a superclass method.
   - Helps avoid typo-related bugs.

4. Covariant Return Type:
   - In Java 5+, the return type of the overridden method can be a subclass of the return type declared in the superclass.
   - `Animal` class method returns `Animal`, `Dog` class method overrides it and returns `Dog`.

5. Rules of Overriding:
   - Cannot override static methods (they are class-level).
   - Cannot override private methods (they are not inherited).
   - The access modifier in subclass must be **same or more accessible**.
   - Exception types thrown must be same or **subtype** of superclass method.

*/
