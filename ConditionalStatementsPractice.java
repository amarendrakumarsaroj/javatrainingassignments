// public 1. Extend the program to assign a grade (A, B, C, D, F) based on a user’s score input (0–100).

//     A: 90–100
//     B: 80–89
//     C: 70–79
//     D: 60–69
//     F: below 60


//   2. Write a Java program that takes a year as input from the user and checks whether it is a or not.

//     A year is a leap year if it is divisible by 4.
//     But if the year is divisible by 100, it must also be divisible by 400 to be a leap year. {
    
// }

import java.util.Scanner;

public class ConditionalStatementsPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your score (0-100): ");
        int score = scanner.nextInt();

        if (score >= 90 && score <= 100) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else if (score >= 60) {
            System.out.println("Grade: D");
        } else if (score >= 0) {
            System.out.println("Grade: F");
        } else {
            System.out.println("Invalid score! Please enter between 0 and 100.");
        }

        scanner.close();
    }
}

