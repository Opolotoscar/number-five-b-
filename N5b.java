
package com.mycompany.n5b;

/**
 *
 * @author NYARUP
 */

 import java.util.Scanner;
 public class N5b {

    public static void main(String[] args) {
        // Prompt user to enter three numbers
        try (Scanner scanner = new Scanner(System.in)) {
            // Prompt user to enter three numbers
            System.out.print("Enter the first number: ");
            int number1 = scanner.nextInt();
            
            System.out.print("Enter the second number: ");
            int number2 = scanner.nextInt();
            
            System.out.print("Enter the third number: ");
            int number3 = scanner.nextInt();
            
            // Calculate the product of the three numbers
            int product = number1 * number2 * number3;
            
            // Calculate the sum of the three numbers
            int sum = number1 + number2 + number3;
            
            // Determine the maximum of the three numbers
            int max = number1;
            if (number2 > max) {
                max = number2;
            }
            if (number3 > max) {
                max = number3;
            }
            
            // Display the results in tabular format
            System.out.println("\nProduct\tSum\tMaximum");
            System.out.printf("%d\t%d\t%d%n", product, sum, max);
        }
    }
}

