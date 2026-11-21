package com.heliohugo.bin2dec;

import java.util.Scanner;

public class Bin2DecApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;

        do {
            // Menu formatado
            System.out.println("\n╔════════════════════════════════════════╗");
            System.out.println("║   BINARY TO DECIMAL CONVERTER          ║");
            System.out.println("╚════════════════════════════════════════╝");
            System.out.println();
            System.out.println("  [1] Convert a binary number");
            System.out.println("  [2] Exit");
            System.out.println();
            System.out.print("➤ Choose an option: ");

            option = sc.nextInt();
            sc.nextLine();

            if (option == 1) {
                System.out.println("\n─────────────────────────────────────────");
                System.out.print("➤ Enter a binary number: ");
                String binary = sc.nextLine();

                if (BinaryConverter.isValidBinary(binary)) {
                    int result = BinaryConverter.convertToDecimal(binary);
                    System.out.println("\n✓ Decimal value: " + result);
                } else {
                    System.out.println("\n✗ Error: Invalid binary number!");
                    System.out.println("  Only 0s and 1s are allowed.");
                }
                System.out.println("─────────────────────────────────────────");

            } else if (option == 2) {
                System.out.println("\n╔════════════════════════════════════════╗");
                System.out.println("║  Thank you for using the converter!    ║");
                System.out.println("╚════════════════════════════════════════╝\n");

            } else {
                System.out.println("\n✗ Invalid option! Please choose 1 or 2.\n");
            }

        } while (option != 2);

        sc.close();
    }
}