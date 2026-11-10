package com.heliohugo.bin2dec;

public class BinaryConverter {

    public static boolean isValidBinary(String input) {
        if (input == null || input.isEmpty()) {
            return false;
        }
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c != '0' && c != '1') {
                return false;
            }
        }
        return true;
    }

    public static int convertToDecimal(String binary) {
        int decimalValue = 0;
        int exponent = 0;
        for (int i = binary.length() - 1; i >= 0; i--) {
            char currentChar = binary.charAt(i);
            int bit = currentChar - '0';
            int digitValue = bit * (int) Math.pow(2, exponent);
            decimalValue += digitValue;
            exponent++;
        }
        return decimalValue;
    }
}




