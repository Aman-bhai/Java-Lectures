package in.learning.java.OOPs.constructor_and_chaining;

// Class name should be capitalized by convention
class Student {
    // Instance variables
    int id;
    String name;
    String course;

    // 1. Default Constructor
    Student() {
        // Constructor chaining: calls the 3-arg constructor
        this(0, "Not Assigned", "Unknown");
        System.out.println("Default constructor called.");
    }

    // 2. Parameterized Constructor (2 arguments)
    Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.course = "Not Assigned";
        System.out.println("2-arg constructor called.");
    }

    // 3. Parameterized Constructor (3 arguments)
    Student(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
        System.out.println("3-arg constructor called.");
    }

    // Method to display student details
    void displayDetails() {
        System.out.println("ID     : " + id);
        System.out.println("Name   : " + name);
        System.out.println("Course : " + course);
        System.out.println("------------------------");
    }
}

public class constructors {
    public static void main(String[] args) {
        // Object using default constructor
        Student s1 = new Student();
        s1.displayDetails();

        // Object using 2-argument constructor
        Student s2 = new Student(101, "raj");
        s2.displayDetails();

        // Object using 3-argument constructor
        Student s3 = new Student(102, "raghav", "Java");
        s3.displayDetails();
    }
}
