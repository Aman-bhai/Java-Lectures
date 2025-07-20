package in.learning.java.lec9.ComparablesAndComparators;

/**
 * ============================================================
 * 📝 Java List Interface - Advanced Concepts & Implementations
 * ============================================================
 *
 * This file demonstrates:
 * ✅ Comparable interface (natural sorting)
 * ✅ Comparator interface (custom sorting)
 * ✅ Iterator (forward traversal)
 * ✅ ListIterator (forward & backward traversal)
 * ✅ Sorting lists using Collections.sort()
 * ✅ Working with custom objects inside lists
 *
 * Implemented using a Student class as an example.
 */

import java.util.*;

// ============================================================
// 🎓 Student class that implements Comparable for natural order
// ============================================================
class Student implements Comparable<Student> {
    int id;
    String name;
    int marks;

    // Constructor
    public Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    // For printing student details
    public String toString() {
        return "[" + id + ", " + name + ", " + marks + "]";
    }

    /**
     * ✅ Comparable: defines natural ordering by marks (ascending)
     * Called automatically by Collections.sort(list)
     */
    @Override
    public int compareTo(Student other) {
        return this.marks - other.marks;
    }
}

// ============================================================
// 🔤 Comparator to sort students by name (alphabetically)
// ============================================================
class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}

// ============================================================
// 🔢 Comparator to sort students by ID in descending order
// ============================================================
class IdDescendingComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s2.id - s1.id;
    }
}

// ============================================================
// 🧪 Main Class: Demonstrates List interface usage in depth
// ============================================================
public class ListAdvancedDemo {

    public static void main(String[] args) {

        // ✅ Create a list of students
        List<Student> students = new ArrayList<>();
        students.add(new Student(103, "Alice", 88));
        students.add(new Student(101, "Charlie", 70));
        students.add(new Student(102, "Bob", 95));

        // Original unsorted list
        System.out.println("🎓 Original List:");
        printList(students);

        // ✅ Sorting using Comparable (marks)
        Collections.sort(students); // uses compareTo()
        System.out.println("\n📊 Sorted by Marks (Comparable):");
        printList(students);

        // ✅ Sorting using Comparator (name)
        Collections.sort(students, new NameComparator());
        System.out.println("\n🔤 Sorted by Name (Comparator):");
        printList(students);

        // ✅ Sorting using another Comparator (ID descending)
        Collections.sort(students, new IdDescendingComparator());
        System.out.println("\n🔢 Sorted by ID Descending (Comparator):");
        printList(students);

        // ✅ Iterator: Forward-only traversal
        System.out.println("\n➡️ Traversing using Iterator:");
        Iterator<Student> it = students.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // ✅ ListIterator: Forward traversal
        System.out.println("\n↔️ Forward Traversing using ListIterator:");
        ListIterator<Student> listIt = students.listIterator();
        while (listIt.hasNext()) {
            System.out.println(listIt.next());
        }

        // ✅ ListIterator: Backward traversal
        System.out.println("\n↩️ Backward Traversing using ListIterator:");
        while (listIt.hasPrevious()) {
            System.out.println(listIt.previous());
        }
    }

    // Helper method to print any student list
    public static void printList(List<Student> list) {
        for (Student s : list) {
            System.out.println(s);
        }
    }
}
