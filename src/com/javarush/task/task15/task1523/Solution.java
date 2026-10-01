package com.javarush.task.task15.task1523;

/* 
Перегрузка конструкторов
*/

public class Solution {

    public Solution() {
        System.out.println("public");
    }

    Solution(String s) {
        System.out.println("default");
    }

    protected Solution(String s, String ss) {
        System.out.println("protected");
    }

    private Solution(String s, String ss, String sss) {
        System.out.println("private");
    }

    public static void main(String[] args) {

    }
}

