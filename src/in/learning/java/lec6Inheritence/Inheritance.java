package in.learning.java.lec6Inheritence;

// ========== 1. SINGLE INHERITANCE ==========
class Animal {
    Animal() {
        System.out.println("Animal constructor called");
    }

    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    Dog() {
        super(); // calls Animal constructor
        System.out.println("Dog constructor called");
    }

    void bark() {
        System.out.println("Dog is barking");
    }

    // Method overriding
    @Override
    void eat() {
        super.eat(); // calls parent version
        System.out.println("Dog is eating biscuits");
    }
}

// ========== 2. MULTILEVEL INHERITANCE ==========
class Puppy extends Dog {
    Puppy() {
        super(); // calls Dog constructor
        System.out.println("Puppy constructor called");
    }

    void weep() {
        System.out.println("Puppy is weeping");
    }
}

// ========== 3. HIERARCHICAL INHERITANCE ==========
class Cat extends Animal {
    Cat() {
        super();
        System.out.println("Cat constructor called");
    }

    void meow() {
        System.out.println("Cat is meowing");
    }
}

class Cow extends Animal {
    Cow() {
        super();
        System.out.println("Cow constructor called");
    }

    void moo() {
        System.out.println("Cow is mooing");
    }
}

// ========== 4. HYBRID-LIKE INHERITANCE (with super) ==========
class Person {
    Person() {
        System.out.println("Person constructor called");
    }

    void sleep() {
        System.out.println("Person is sleeping");
    }
}

class Employee extends Person {
    Employee() {
        super(); // calls Person constructor
        System.out.println("Employee constructor called");
    }

    void work() {
        System.out.println("Employee is working");
    }
}

class Manager extends Employee {
    Manager() {
        super(); // calls Employee constructor
        System.out.println("Manager constructor called");
    }

    void manage() {
        System.out.println("Manager is managing team");
    }
}

// ========== MAIN CLASS ==========
public class Inheritance {
    public static void main(String[] args) {

        // SINGLE INHERITANCE
        System.out.println("=== Single Inheritance ===");
        Dog dog = new Dog();
        dog.eat(); // overridden
        dog.bark();

        // MULTILEVEL INHERITANCE
        System.out.println("\n=== Multilevel Inheritance ===");
        Puppy puppy = new Puppy();
        puppy.eat();
        puppy.bark();
        puppy.weep();

        // HIERARCHICAL INHERITANCE
        System.out.println("\n=== Hierarchical Inheritance ===");
        Cat cat = new Cat();
        cat.eat();
        cat.meow();

        Cow cow = new Cow();
        cow.eat();
        cow.moo();

        // HYBRID-LIKE INHERITANCE
        System.out.println("\n=== Hybrid-like Inheritance (class only) ===");
        Manager mgr = new Manager();
        mgr.sleep();  // from Person
        mgr.work();   // from Employee
        mgr.manage(); // from Manager
    }
}
