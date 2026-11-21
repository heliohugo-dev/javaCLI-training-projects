package com.heliohugo.calculator;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int options = -1;

        do {
            System.out.println("\n╔════════════════════════════════╗");
            System.out.println("║     CALCULATOR - MAIN MENU     ║");
            System.out.println("╚════════════════════════════════╝");
            System.out.println();
            System.out.println("  [1] Addition (+)");
            System.out.println("  [2] Subtraction (-)");
            System.out.println("  [3] Multiplication (×)");
            System.out.println("  [4] Division (÷)");
            System.out.println("  [5] Modulo (%)");
            System.out.println("  [6] Exit");
            System.out.println();
            System.out.print("➤ Choose an option: ");

            try {
                options = sc.nextInt();
                sc.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("\n✗ Invalid input! Please enter a number between 1-6.\n");
                sc.nextLine();
                continue;
            }

            if (options >= 1 && options <= 5) {
                System.out.print("\nEnter first number: ");
                double a = sc.nextDouble();
                System.out.print("Enter second number: ");
                double b = sc.nextDouble();

                if ((options == 4 || options == 5) && b == 0) {
                    System.out.println("\n✗ Error: Division/Modulo by zero is not allowed!");
                    continue;
                }

                double result = 0;

                switch (options) {
                    case 1:
                        result = Calculator.add(a, b);
                        break;
                    case 2:
                        result = Calculator.subtract(a, b);
                        break;
                    case 3:
                        result = Calculator.multiply(a, b);
                        break;
                    case 4:
                        result = Calculator.divide(a, b);
                        break;
                    case 5:
                        result = Calculator.module(a, b);
                        break;
                }

                System.out.printf("\n✓ Result: %.2f\n", result);

            } else if (options == 6) {
                System.out.println("\n╔════════════════════════════════╗");
                System.out.println("║ Thank you for using Calculator!║");
                System.out.println("╚════════════════════════════════╝");
            } else {
                System.out.println("\n✗ Invalid option! Please choose 1-6.");
            }

        } while (options != 6);

        sc.close();
    }
}