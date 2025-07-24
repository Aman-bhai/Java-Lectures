package in.learning.java.lec13Java8.MethodReferences;

import java.util.Arrays;
import java.util.List;

public class MethodReferences{

    // Custom functional interface: takes one input, returns one output
    @FunctionalInterface
    interface MyFunction<A, B> {
        B apply(A input);
    }

    // Custom functional interface: no input, returns something
    @FunctionalInterface
    interface MyCreator<T> {
        T create();
    }

    // Helper class with methods
    static class Helper {

        // Static method
        public static String makeUpper(String text) {
            return text.toUpperCase();
        }

        // Instance method
        public String addHello(String name) {
            return "Hello, " + name;
        }
    }

    // Simple Person class
    static class Person {
        String name;

        Person() {
            this.name = "No Name";
        }

        Person(String name) {
            this.name = name;
        }

        public void show() {
            System.out.println("Person name: " + name);
        }
    }

    public static void main(String[] args) {

        // 1️⃣ Static method reference
        MyFunction<String, String> upper = Helper::makeUpper;
        System.out.println("Upper: " + upper.apply("java")); // Output: JAVA

        // 2️⃣ Instance method reference
        Helper helper = new Helper();
        MyFunction<String, String> greet = helper::addHello;
        System.out.println("Greeting: " + greet.apply("Tom")); // Output: Hello, Tom

        // 3️⃣ Method reference on object list
        List<Person> list = Arrays.asList(
            new Person("Asha"),
            new Person("Raj"),
            new Person("Mira")
        );
        System.out.println("People list:");
        list.forEach(Person::show); // Calls show() on each person

        // 4️⃣ Constructor reference
        MyCreator<Person> personMaker = Person::new;
        Person p = personMaker.create();
        p.show(); // Output: Person name: No Name
    }
}
