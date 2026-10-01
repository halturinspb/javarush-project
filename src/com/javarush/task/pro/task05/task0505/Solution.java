package com.javarush.task.pro.task05.task0505;

import java.util.Scanner;

/* 
Reverse
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n > 0) {
            int[] pull = new int[n];
            for (int i = 0; i < n; i++) {
                pull[i] = scanner.nextInt();
            }

            if (n % 2 == 0) {
                for (int i = pull.length - 1; i >= 0; i--) {
                    System.out.println(pull[i]);
                }

            } else {
                for (int i = 0; i < pull.length; i++) {
                    System.out.println(pull[i]);
                }
            }
        }
    }
}

