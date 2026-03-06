package com.javarush.task.task01.task0136;

/* 
Да хоть на Луну!
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getWeight(888));
    }

    public static double getWeight(int earthWeight) {
        double moonWeight;
        moonWeight = ((double)earthWeight/100)*17;
        return moonWeight;//напишите тут ваш код
    }
}