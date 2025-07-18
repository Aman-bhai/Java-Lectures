package in.learning.java.operator;

public class Operator {

    public static void main(String[] args) {
        // 1. Arithmetic Operators
        int a = 10, b = 3;
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b)); // Integer division
        System.out.println("a % b = " + (a % b));

        // 2. Relational (Comparison) Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));

        // 3. Logical Operators
        boolean x = true, y = false;
        System.out.println("\nLogical Operators:");
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));

        // 4. Bitwise Operators
        int p = 5, q = 3;
        System.out.println("\nBitwise Operators:");
        System.out.println("p & q: " + (p & q)); // 0101 & 0011 = 0001
        System.out.println("p | q: " + (p | q)); // 0101 | 0011 = 0111
        System.out.println("p ^ q: " + (p ^ q)); // 0101 ^ 0011 = 0110
        System.out.println("~p: " + (~p));       // Inverts bits
        System.out.println("p << 1: " + (p << 1)); // Left shift
        System.out.println("p >> 1: " + (p >> 1)); // Right shift

        // 5. Assignment Operators
        int z = 10;
        System.out.println("\nAssignment Operators:");
        z += 5;
        System.out.println("z += 5: " + z);
        z -= 2;
        System.out.println("z -= 2: " + z);
        z *= 2;
        System.out.println("z *= 2: " + z);
        z /= 2;
        System.out.println("z /= 2: " + z);
        z %= 3;
        System.out.println("z %= 3: " + z);

        // 6. Unary Operators
        int u = 5;
        System.out.println("\nUnary Operators:");
        System.out.println("u: " + u);
        System.out.println("++u: " + (++u)); // Pre-increment
        System.out.println("u++: " + (u++)); // Post-increment
        System.out.println("u after u++: " + u);
        System.out.println("--u: " + (--u)); // Pre-decrement
        System.out.println("u--: " + (u--)); // Post-decrement
        System.out.println("u after u--: " + u);

        // 7. Ternary Operator
        int max = (a > b) ? a : b;
        System.out.println("\nTernary Operator:");
        System.out.println("Max of a and b: " + max);
    }
}
