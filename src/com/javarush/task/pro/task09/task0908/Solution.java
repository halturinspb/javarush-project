package com.javarush.task.pro.task09.task0908;

import java.util.Arrays;
import java.util.regex.Pattern;

/* 
Двоично-шестнадцатеричный конвертер
*/

public class Solution {
    private static final String HEX = "0123456789abcdef";
    private static final String[] BINARY = {
            "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111",
            "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"
    };

    public static void main(String[] args) {

        String binaryNumber = "100111010000";
        System.out.println("Двоичное число " + binaryNumber + " равно шестнадцатеричному числу " + toHex(binaryNumber));
        String hexNumber = "9d0";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно двоичному числу " + toBinary(hexNumber));
    }

    public static String toHex(String binaryNumber) {
        if (binaryNumber == null || binaryNumber.isEmpty() || !binaryNumber.matches("[01]+")) {
            return "";
        }

        while (binaryNumber.length() % 4 != 0) {
            binaryNumber = "0" + binaryNumber;
        }

        StringBuilder hexNumber = new StringBuilder();
        for (int i = 0; i < binaryNumber.length(); i = i + 4) {
            String fourBit = binaryNumber.substring(i, i + 4);
            int index = Arrays.binarySearch(BINARY, fourBit);
            char oneHex = HEX.charAt(index);
            hexNumber.append(oneHex);
        }
        return hexNumber.toString();
    }

    public static String toBinary(String hexNumber) {
        if (hexNumber == null || hexNumber.isEmpty() || !hexNumber.matches("[0-9a-f]+")) {
            return "";
        }
        StringBuilder binaryNumber = new StringBuilder();
        for (char oneHex : hexNumber.toCharArray()) {
            int index = HEX.indexOf(oneHex);
            String fourBit = BINARY[index];
            binaryNumber.append(fourBit);
        }
        return binaryNumber.toString();
    }


    public static String toHex1(String binaryNumber) {
        String result = "";
        if (binaryNumber == null || binaryNumber.isEmpty()) return result;

        char[] binaryNumber1 = binaryNumber.toCharArray();
        for (int i = 0; i < binaryNumber.length(); i++) {
            if (!(binaryNumber1[i] == '0' || binaryNumber1[i] == '1')) return result;
        }

        while (!(binaryNumber.length() % 4 == 0)) {
            binaryNumber = "0" + binaryNumber;
        }
        int y = 0;
        String group = "";
        for (int i = 0; i < binaryNumber.length(); i++) {
            group = group + String.valueOf(binaryNumber.charAt(i));
            y++;

            if (y == 4) {
                if (group.equals("0000")) result = result + "0";
                else if (group.equals("0001")) result = result + "1";
                else if (group.equals("0010")) result = result + "2";
                else if (group.equals("0011")) result = result + "3";
                else if (group.equals("0100")) result = result + "4";
                else if (group.equals("0101")) result = result + "5";
                else if (group.equals("0110")) result = result + "6";
                else if (group.equals("0111")) result = result + "7";
                else if (group.equals("1000")) result = result + "8";
                else if (group.equals("1001")) result = result + "9";
                else if (group.equals("1010")) result = result + "a";
                else if (group.equals("1011")) result = result + "b";
                else if (group.equals("1100")) result = result + "c";
                else if (group.equals("1101")) result = result + "d";
                else if (group.equals("1110")) result = result + "e";
                else if (group.equals("1111")) result = result + "f";
                y = 0;
                group = "";
            }
        }

        return result;
    }

    public static String toBinary1(String hexNumber) {
        String result = "";
        if (hexNumber == null || hexNumber.isEmpty()) return result;

        char[] hexNumber1 = hexNumber.toCharArray();
        String hex = "0123456789abcdef";
        char[] hex1 = hex.toCharArray();
// проверка hexNumber на соответствие hex
        for (int i = 0; i < hexNumber.length(); i++) {
            int chekHex = 0;
            for (int j = 0; j < hex1.length; j++) {
                if (hexNumber1[i] == hex1[j]) chekHex = chekHex + 1;
            }
            if (chekHex != 1) return result;
        }

        for (int i = 0; i < hexNumber.length(); i++) {
            char c = hexNumber1[i];
            if (c == 'A' || c == 'a') {
                result = result + "1010";
            } else if (c == '1') {
                result = result + "0001";
            } else if (c == '2') {
                result = result + "0010";
            } else if (c == '3') {
                result = result + "0011";
            } else if (c == '4') {
                result = result + "0100";
            } else if (c == '5') {
                result = result + "0101";
            } else if (c == '6') {
                result = result + "0110";
            } else if (c == '7') {
                result = result + "0111";
            } else if (c == '8') {
                result = result + "1000";
            } else if (c == '9') {
                result = result + "1001";
            } else if (c == 'B' || c == 'b') {
                result = result + "1011";
            } else if (c == 'C' || c == 'c') {
                result = result + "1100";
            } else if (c == 'D' || c == 'd') {
                result = result + "1101";
            } else if (c == 'E' || c == 'e') {
                result = result + "1110";
            } else if (c == 'F' || c == 'f') {
                result = result + "1111";
            } else if (c == '0') {
                result = result + "0000";
            }
        }
        return result;
    }
}
