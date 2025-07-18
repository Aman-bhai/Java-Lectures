package in.learning.java.OOPs.class_and_object;

class Student {
    // Instance Variables (Data Members)
    int id;
    String name;
    String course;
    double marks;

    // Member Function (Method)
    void displayDetails() {
        System.out.println("ID     : " + id);
        System.out.println("Name   : " + name);
        System.out.println("Course : " + course);
        System.out.println("Marks  : " + marks);
        System.out.println("------------------------");
    }

    // Another method to set details
    void setDetails(int sid, String sname, String scourse, double smarks) {
        id = sid;
        name = sname;
        course = scourse;
        marks = smarks;
    }
}

public class ClassesAndObject {
    public static void main(String[] args) {
        // Creating first object of Student
        Student student1 = new Student();
        student1.setDetails(101, "Raj", "Java", 85.5);
        student1.displayDetails();

        // Creating second object of Student
        Student student2 = new Student();
        student2.setDetails(102, "Kumar", "Python", 90.0);
        student2.displayDetails();

        // Creating third object with direct assignment
        Student student3 = new Student();
        student3.id = 103;
        student3.name = "Charu";
        student3.course = "C++";
        student3.marks = 78.0;
        student3.displayDetails();
    }
}
