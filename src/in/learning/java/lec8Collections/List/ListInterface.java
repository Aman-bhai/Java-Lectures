// Package declaration - matches the folder structure
package in.learning.java.lec8Collections.List;

// Importing the List interface and its implementations
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 * A demo class to explain the Java List interface and its implementations.
 */
public class ListInterface {

    // The main method - entry point of the program
    public static void main(String[] args) {

        // ✅ Creating a List using ArrayList implementation
        // List is an interface; ArrayList is a class that implements it.
        List<String> fruits = new ArrayList<>();

        // ✅ Adding elements to the list using .add()
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        // ✅ Adding duplicate elements
        fruits.add("Apple"); // List allows duplicates

        // ✅ Inserting element at specific index
        fruits.add(1, "Orange"); // Inserts "Orange" at index 1

        // ✅ Printing all elements using a for-each loop
        System.out.println("🍎 Fruits List (ArrayList):");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // ✅ Getting an element at a specific index
        String secondFruit = fruits.get(1); // Gets "Orange"
        System.out.println("\n📍 Element at index 1: " + secondFruit);

        // ✅ Removing an element by index
        fruits.remove(2); // Removes the fruit at index 2 ("Banana")

        // ✅ Removing an element by value
        fruits.remove("Apple"); // Removes first occurrence of "Apple"

        // ✅ Checking if an element exists
        boolean hasMango = fruits.contains("Mango");
        System.out.println("🔍 Does the list contain Mango? " + hasMango);

        // ✅ Getting the size of the list
        int size = fruits.size();
        System.out.println("📏 Size of the list: " + size);

        // ✅ Printing the updated list
        System.out.println("\n🆕 Updated Fruits List:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // ✅ Creating a List using LinkedList implementation
        List<Integer> numbers = new LinkedList<>();

        // ✅ Adding elements to the LinkedList
        numbers.add(100);
        numbers.add(200);
        numbers.add(300);

        // ✅ Iterating and printing elements
        System.out.println("\n🔢 Numbers List (LinkedList):");
        for (int number : numbers) {
            System.out.println(number);
        }

        // ✅ Access and modify elements (get and set)
        int first = numbers.get(0); // Get first element
        numbers.set(0, 999); // Change the first element to 999

        System.out.println("\n🔄 After modifying first element:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
