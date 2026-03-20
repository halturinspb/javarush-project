package com.javarush.task.pro.task09.task0907;

import java.util.regex.Pattern;

/* 
Шестнадцатеричный конвертер
*/

public class Solution {
    private static final String HEX = "0123456789abcdef";

    public static void main(String[] args) {
        int decimalNumber = 1256;
        System.out.println("Десятичное число " + decimalNumber + " равно шестнадцатеричному числу " + toHex(decimalNumber));
        String hexNumber = "4e8";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно десятичному числу " + toDecimal(hexNumber));
    }

    public static String toHex(int decimalNumber) {
        String hexNum = "";
        if (decimalNumber <= 0) return hexNum;
        char[] hexLine = HEX.toCharArray();

        while (decimalNumber != 0) {
            int indexHexLine = decimalNumber % 16;
            hexNum = String.valueOf(hexLine[indexHexLine]) + hexNum;
            decimalNumber = decimalNumber / 16;
        }
        return hexNum;
    }

    public static int toDecimal(String hexNumber) {
        if (hexNumber == null || hexNumber.isEmpty()) return 0;
        int dec = 0;
        char[] hexNumber1 = hexNumber.toCharArray();
        char[] hexLine = HEX.toCharArray();


        for (int i = 0; i < hexNumber.length(); i++) {
            int hexIndex = 0;
            for (int j = 0; j < hexLine.length; j++) {
                if(hexLine[j] == hexNumber1[i]) hexIndex = j;
            }
        dec = 16 * dec + hexIndex;
        }
        return dec;
    }
}
