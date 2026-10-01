package com.javarush.task.pro.task04.task0405;

/* 
Незаполненный прямоугольник
*/

public class Solution {
    public static void main(String[] args) {
        /*int i = 0;
        while (i < 1){
            System.out.println("ББББББББББББББББББББ");
            int ii = 0;
            while (ii < 8){
                System.out.println("Б                  Б");
                ii++;
            }
            System.out.println("ББББББББББББББББББББ");
        i++;}//напишите тут ваш код*/

        int i = 0;
        while(i < 10){
            int ii = 0;
            while ((ii < 20)){
                System.out.print("Б");
                ii++;
                while ((i >= 1 && i < 9) && (ii >= 1 && (ii < 19))){
                    System.out.print(" ");
                    ii++;
                }
            }
            System.out.println();
            i++;
        }

    }
}