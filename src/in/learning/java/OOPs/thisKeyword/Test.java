package in.learning.java.OOPs.thisKeyword;

// Class to demonstrate uses of 'this' keyword
class Student {
    int id;
    String name;

    // 1. 'this' is used to refer to current class instance variables
    Student(int id, String name) {
        this.id = id;        // this.id refers to instance variable
        this.name = name;    // this.name refers to instance variable
    }

    // 2. 'this' can be used to call current class methods
    void display() {
        this.showDetails();  // same as calling showDetails() directly
    }

    void showDetails() {
        System.out.println("ID   : " + id);
        System.out.println("Name : " + name);
    }

    // 3. 'this()' can be used to call another constructor in the same class
    Student() {
        this(0, "Unknown");  // Calls the parameterized constructor
        System.out.println("Default constructor called.");
    }

    // 4. 'this' can be used to return current class instance
    Student getStudent() {
        return this;  // returns current object
    }

    // 5. 'this' can be passed as an argument to methods
    void print(Student s) {
        System.out.println("Received object with name: " + s.name);
    }

    void callPrint() {
        print(this); // passing current object
    }
}

public class Test {
    public static void main(String[] args) {
        // Using default constructor (calls this())
        Student s1 = new Student();
        s1.display();

        System.out.println();

        // Using parameterized constructor
        Student s2 = new Student(101, "raj");
        s2.display();

        System.out.println();

        // Using this to return object
        Student temp = s2.getStudent();
        System.out.println("Returned from getStudent(): " + temp.name);

        System.out.println();

        // Using this as method argument
        s2.callPrint();
    }
}
