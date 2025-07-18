package in.learning.java.loopingStatements;

import java.util.Scanner;

public class LoopingStatments {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. while loop
        System.out.println("=== while Loop ===");
        int i = 1;
        while (i <= 5) {
            System.out.println("i = " + i);
            i++;
        }

        // 2. do-while loop
        System.out.println("\n=== do-while Loop ===");
        int j = 1;
        do {
            System.out.println("j = " + j);
            j++;
        } while (j <= 5);

        // 3. for loop
        System.out.println("\n=== for Loop ===");
        for (int k = 1; k <= 5; k++) {
            System.out.println("k = " + k);
        }

        // 4. for-each loop (used with arrays/collections)
        System.out.println("\n=== for-each Loop ===");
        int[] numbers = {10, 20, 30, 40, 50};
        for (int num : numbers) {
            System.out.println("num = " + num);
        }

        // 5. Loop control statements: break and continue
        System.out.println("\n=== break and continue ===");
        for (int x = 1; x <= 10; x++) {
            if (x == 6) {
                System.out.println("Break at x = " + x);
                break; // exit loop
            }
            if (x % 2 == 0) {
                continue; // skip even numbers
            }
            System.out.println("x = " + x);
        }

        scanner.close();
    }
}
