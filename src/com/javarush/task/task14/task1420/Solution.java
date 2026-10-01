package com.javarush.task.task14.task1420;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
НОД
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            int number1 = scanner.nextInt();
            int number2 = scanner.nextInt();
            System.out.println(Nod(number1, number2));
        }
    }

    public static int Nod(int i1, int i2) {
        int max = Math.max(i1, i2);
        int min = Math.min(i1, i2);

        if (max % min == 0) {return min;}
        else {
            int max1 = max % min;
            return Nod(max1, min);
        }
    }
}
