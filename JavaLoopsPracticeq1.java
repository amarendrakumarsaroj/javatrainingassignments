import java.util.Scanner;

public class JavaLoopsPracticeq1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.print("Enter a number (negative to stop): ");
            number = scanner.nextInt();

            if (number >= 0) {
                System.out.println("You entered: " + number);
            }

        } while (number >= 0);

        System.out.println("Program ended. You entered a negative number.");
        scanner.close();
    }
    
}
