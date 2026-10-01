package com.javarush.task.pro.task03.task0302;

import java.util.Scanner;

/* 
Призывная кампания
*/

public class Solution {
    public static void main(String[] args) {
        String militaryCommissar = ", явитесь в военкомат";
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Введите имя..");
        String name = scanner.next();
        //System.out.println("Введите возраст..");
        int age = scanner.nextInt();
        if (age >= 18 && age <= 28)
            System.out.println(name + militaryCommissar);//напишите тут ваш код
    }
}
