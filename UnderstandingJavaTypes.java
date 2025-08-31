// 1. Write a Java program that declares variables of all the primitive data types (byte, short, int, long, float, double, char, boolean).
// 2. Print the value and size (in bits) of each data type.

public class UnderstandingJavaTypes{
    public static void main(String[] args) {
        // Declare and initialize variables of all primitive data types
        byte byteVar = 10;
        short shortVar = 1000;
        int intVar = 100000;
        long longVar = 10000000000L;
        float floatVar = 3.14f;
        double doubleVar = 3.14159265359;
        char charVar = 'A';
        boolean booleanVar = true;

        // Print values and sizes
        System.out.println("Primitive Data Types in Java:\n");

        System.out.println("byte:");
        System.out.println("  Value = " + byteVar);
        System.out.println("  Size = " + Byte.SIZE + " bits\n");

        System.out.println("short:");
        System.out.println("  Value = " + shortVar);
        System.out.println("  Size = " + Short.SIZE + " bits\n");

        System.out.println("int:");
        System.out.println("  Value = " + intVar);
        System.out.println("  Size = " + Integer.SIZE + " bits\n");

        System.out.println("long:");
        System.out.println("  Value = " + longVar);
        System.out.println("  Size = " + Long.SIZE + " bits\n");

        System.out.println("float:");
        System.out.println("  Value = " + floatVar);
        System.out.println("  Size = " + Float.SIZE + " bits\n");

        System.out.println("double:");
        System.out.println("  Value = " + doubleVar);
        System.out.println("  Size = " + Double.SIZE + " bits\n");

        System.out.println("char:");
        System.out.println("  Value = " + charVar);
        System.out.println("  Size = " + Character.SIZE + " bits\n");

        System.out.println("boolean:");
        System.out.println("  Value = " + booleanVar);
        System.out.println("  Size = " + "1 bit (not precisely defined in Java)\n");
    }
}