package in.learning.java.lec7ExceptionHandling;

// ==========================
// 1. Custom Checked Exception
// ==========================
class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}

// ==========================
// 2. Main Class
// ==========================
public class ExceptionHandling {

    // A method that throws a checked exception
    public static void validateAge(int age) throws AgeException {
        if (age < 18) {
            throw new AgeException("Age must be at least 18.");
        } else {
            System.out.println("Age is valid!");
        }
    }

    public static void main(String[] args) {

        // ============ Try-Catch =============
        try {
            int a = 10, b = 0;
            int result = a / b;  // This will throw ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("❌ Arithmetic Exception caught: " + e.getMessage());
        }

        // ============ Try-Catch-Finally ============
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]); // ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("❌ Array Index Error: " + e);
        } finally {
            System.out.println("✅ Finally block always executes");
        }

        // ============ Throw vs Throws ============
        try {
            validateAge(15); // throws AgeException
        } catch (AgeException e) {
            System.out.println("❌ Custom Exception: " + e.getMessage());
        }

        // ============ Multiple Catch Blocks ============
        try {
            String str = null;
            System.out.println(str.length()); // NullPointerException
        } catch (NullPointerException e) {
            System.out.println("❌ Null Pointer Error");
        } catch (Exception e) {
            System.out.println("❌ General Exception: " + e);
        }

        System.out.println("✅ Program continues after exception handling");
    }
}

/*
===============================================
🧠 EXCEPTION HANDLING IN JAVA - SUMMARY
===============================================

✅ Exception:
  - An unwanted event that disrupts the normal flow of the program

✅ Types:
  1. **Checked Exceptions** (compile-time):
     - Must be handled using try-catch or throws
     - Example: IOException, SQLException

  2. **Unchecked Exceptions** (runtime):
     - Occur during execution
     - Example: NullPointerException, ArithmeticException

✅ Keywords:
  - try       → code that might throw exception
  - catch     → handle the exception
  - finally   → always executed (even if exception occurs)
  - throw     → manually throw an exception
  - throws    → declare an exception

✅ Best Practice:
  - Always handle specific exceptions before generic ones
  - Use `finally` for cleanup (closing files, DB, etc.)

*/
