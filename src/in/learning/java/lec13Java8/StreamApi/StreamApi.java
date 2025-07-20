package in.learning.java.lec13Java8.StreamApi;

import java.util.*;
import java.util.stream.Collectors;

public class StreamApi {

    // ✅ Step 1: Create a simple Employee class
    static class Employee {
        String name;
        double salary;

        // Constructor to initialize Employee fields
        Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }

        // toString() for readable output
        @Override
        public String toString() {
            return name + " - $" + salary;
        }
    }

    public static void main(String[] args) {
        // ✅ Step 2: Create a list of Employee objects
        List<Employee> employees = Arrays.asList(
            new Employee("rajesh", 70000),
            new Employee("kiran", 50000),
            new Employee("mamta", 90000),
            new Employee("rohan", 45000)
        );

        // ✅ Step 3: Process the list using Stream API
        List<String> highPaidEmployeeNames = employees.stream()

            // 🔹 filter() – Keep employees with salary > 60000
            .filter(emp -> emp.salary > 60000)

            // 🔹 sorted() – Sort remaining employees by name (ascending)
            .sorted(Comparator.comparing(emp -> emp.name))

            // 🔹 map() – Convert Employee object to just their name (String)
            .map(emp -> emp.name)

            // 🔹 collect() – Gather results into a new List
            .collect(Collectors.toList());

        // ✅ Step 4: Output the result
        System.out.println("High Paid Employees: " + highPaidEmployeeNames);
    }
}
