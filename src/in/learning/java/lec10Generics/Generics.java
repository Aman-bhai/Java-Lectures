package in.learning.java.lec10Generics;

import java.util.ArrayList;
import java.util.List;

/**
 * ==============================================
 * 🧠 Java Generics - Basics and Use Cases
 * ==============================================
 * ✅ Type-safe classes and methods
 * ✅ Compile-time type checking
 * ✅ Reusable code with different data types
 * ✅ Avoids casting and runtime errors
 */
public class Generics {

    public static void main(String[] args) {

        // ✅ Without Generics (Type safety not guaranteed)
        List rawList = new ArrayList(); // raw type
        rawList.add("Hello");
        rawList.add(123); // mixes String and Integer — NOT safe

        System.out.println("⚠️ Raw List (no generics):");
        for (Object obj : rawList) {
            System.out.println(obj); // Could cause ClassCastException
        }

        // ✅ With Generics (Type-safe)
        List<String> stringList = new ArrayList<>();
        stringList.add("Java");
        stringList.add("Generics");
        // stringList.add(123); // ❌ Compile error: can't add Integer

        System.out.println("\n✅ String List (Generic):");
        for (String str : stringList) {
            System.out.println(str.toUpperCase());
        }

        // ✅ Using a Generic class
        Box<Integer> intBox = new Box<>();
        intBox.setItem(42);
        System.out.println("\n📦 Box holding Integer: " + intBox.getItem());

        Box<String> strBox = new Box<>();
        strBox.setItem("Generic Box");
        System.out.println("📦 Box holding String: " + strBox.getItem());

        // ✅ Using a Generic method
        System.out.println("\n🔁 Swapping values using generic method:");
        swap(10, 20);
        swap("Hello", "World");
    }

    /**
     * ✅ Generic method to swap two values (just prints them swapped)
     * <T> is the type parameter
     */
    public static <T> void swap(T a, T b) {
        System.out.println("Before: " + a + ", " + b);
        T temp = a;
        a = b;
        b = temp;
        System.out.println("After : " + a + ", " + b);
    }
}

/**
 * ✅ Generic class that can hold any type
 * @param <T> The type this Box will hold
 */
class Box<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}
