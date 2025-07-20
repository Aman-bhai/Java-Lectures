package in.learning.java.lec4conditionalStatements;

import java.util.Scanner;

public class ConditionalStatements {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. if Statement
        System.out.println("=== if Statement ===");
        System.out.print("Enter a number: ");
        int num1 = scanner.nextInt();
        if (num1 > 0) {
            System.out.println("The number is positive.");
        }

        // 2. if-else Statement
        System.out.println("\n=== if-else Statement ===");
        System.out.print("Enter a number: ");
        int num2 = scanner.nextInt();
        if (num2 % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }

        // 3. if-else-if Ladder
        System.out.println("\n=== if-else-if Ladder ===");
        System.out.print("Enter your percentage: ");
        int percentage = scanner.nextInt();

        if (percentage >= 90) {
            System.out.println("Grade: A+");
        } else if (percentage >= 80) {
            System.out.println("Grade: A");
        } else if (percentage >= 70) {
            System.out.println("Grade: B");
        } else if (percentage >= 60) {
            System.out.println("Grade: C");
        } else if (percentage >= 50) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F (Fail)");
        }

        // 4. Nested if Statement
        System.out.println("\n=== Nested if Statement ===");
        System.out.print("Enter username: ");
        String username = scanner.next();
        System.out.print("Enter password: ");
        String password = scanner.next();

        if (username.equals("admin")) {
            if (password.equals("1234")) {
                System.out.println("Login successful!");
            } else {
                System.out.println("Incorrect password.");
            }
        } else {
            System.out.println("Username not found.");
        }

        // 5. switch Statement
        System.out.println("\n=== switch Statement ===");
        System.out.print("Enter a number (1-7) for a day: ");
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day number.");
        }

        // 6. Ternary Operator (Short-hand if-else)
        System.out.println("\n=== Ternary Operator ===");
        System.out.print("Enter two numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int max = (a > b) ? a : b;
        System.out.println("Maximum value is: " + max);

        scanner.close();
    }
}
