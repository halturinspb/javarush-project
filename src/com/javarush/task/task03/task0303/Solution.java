package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(convertEurToUsd(3, 1.1));
        System.out.println(convertEurToUsd(5,1.2));//напишите тут ваш код

    }

    public static double convertEurToUsd(int eur, double exchangeRate) {
       double totalUsd = eur * exchangeRate; //напишите тут ваш код
        return totalUsd;
    }
}
