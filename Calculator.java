package javabasic;

import java.util.Scanner;

public class Calculator {
	
	// Method for Addition
    public static double add(double a, double b) {
        return a + b;
    }

    // Method for Subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Method for Multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }
	
 // Method for Division
    public static double divide(double a, double b) {
        if (b == 0) {
            System.err.println("Error: Division by zero is not allowed!");
            return 0;
        }
        return a / b;
    }
    
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		boolean istrue = true;

        System.out.println("=== Java Calculator ===");

        while (istrue) {
            // Menu
            System.out.println("\nChoose an operation:\n1. Addition (+)\n2. Subtraction (-)\n3. Multiplication (*)\n4. Division (/)\n5. Exit");
            System.out.print("\nEnter your choice (1-5): ");
            int choice = sc.nextInt();

            if (choice == 5) {
                System.out.println("Exiting calculator...");
                break;
            }

            // Input numbers
            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            double result = 0;

            switch (choice) {
                case 1:
                    result = add(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case 2:
                    result = subtract(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case 3:
                    result = multiply(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case 4:
                    result = divide(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                default:
                    System.out.println("Invalid choice! Please enter between 1-5.");
            }
        }

        sc.close();
    }
}
