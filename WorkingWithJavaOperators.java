// WorkingWithJavaOperators.java
// This program demonstrates the use of:
// 1. Arithmetic operators: +, -, *, /, %
// 2. Relational operators: ==, !=, >, <, >=, <=
// 3. Logical operators: &&, ||, !
// 4. Increment/Decrement operators: ++, --

public class WorkingWithJavaOperators {
    public static void main(String[] args) {
        // Variables for arithmetic and relational operations
        int a = 10;
        int b = 5;

        // Arithmetic Operators
        System.out.println("=== Arithmetic Operators ===");
        System.out.println("a + b = " + (a + b)); // Addition
        System.out.println("a - b = " + (a - b)); // Subtraction
        System.out.println("a * b = " + (a * b)); // Multiplication
        System.out.println("a / b = " + (a / b)); // Division
        System.out.println("a % b = " + (a % b)); // Modulus

        // Relational Operators
        System.out.println("\n=== Relational Operators ===");
        System.out.println("a == b: " + (a == b));  // Equal to
        System.out.println("a != b: " + (a != b));  // Not equal to
        System.out.println("a > b: " + (a > b));    // Greater than
        System.out.println("a < b: " + (a < b));    // Less than
        System.out.println("a >= b: " + (a >= b));  // Greater than or equal to
        System.out.println("a <= b: " + (a <= b));  // Less than or equal to

        // Logical Operators
        boolean x = true;
        boolean y = false;

        System.out.println("\n=== Logical Operators ===");
        System.out.println("x && y: " + (x && y));  // Logical AND
        System.out.println("x || y: " + (x || y));  // Logical OR
        System.out.println("!x: " + (!x));          // Logical NOT
        System.out.println("!y: " + (!y));          // Logical NOT

        // Increment and Decrement Operators
        int c = 7;

        System.out.println("\n=== Increment / Decrement Operators ===");
        System.out.println("Initial value of c: " + c);
        System.out.println("Post-increment (c++): " + (c++));    // Use c, then increment
        System.out.println("After post-increment, c: " + c);
        System.out.println("Pre-increment (++c): " + (++c));     // Increment, then use
        System.out.println("Post-decrement (c--): " + (c--));    // Use c, then decrement
        System.out.println("After post-decrement, c: " + c);
        System.out.println("Pre-decrement (--c): " + (--c));     // Decrement, then use
    }
}
