//Decimal to Binary
import java.util.Scanner;

public class JavaLoopsPracticeq4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();

        String binary = "";
        int num = decimal;

        while (num > 0) {
            int remainder = num % 2;
            binary = remainder + binary;  // prepend remainder
            num = num / 2;
        }

        System.out.println("Binary representation of " + decimal + " is: " + binary);

        scanner.close();
    }
}

