package com.javarush.task.pro.task13.task1302;

import java.util.Arrays;
import java.util.HashSet;

import static java.util.Arrays.asList;

/* 
Проверка присутствия
*/

public class Solution {
    public static HashSet<String> words = new HashSet<>(asList("Если бы меня попросили выбрать язык на замену Java я бы не выбирал".split(" ")));

    public static void checkWords(String word) {
        int i = 0;
        for (String s : words) {
            if (word.equals(s)) i++;
        }
        if (i > 0) System.out.println("Слово " + word + " есть в множестве");
        if (i == 0) System.out.println("Слова " + word + " нет в множестве");
    }

    public static void main(String[] args) {
        checkWords("JavaScript");
        checkWords("Java");
    }
}
