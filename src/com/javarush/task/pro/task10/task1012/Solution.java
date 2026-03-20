package com.javarush.task.pro.task10.task1012;

import java.util.Arrays;

/* 
Дефрагментация памяти
*/

public class Solution {

    public static void main(String[] args) {
        String[] memory = {"object15", null, null, "object2", null, null, null, "object32", null, "object4"};
        executeDefragmentation(memory);
        System.out.println(Arrays.toString(memory));
    }

    public static void executeDefragmentation(String[] array) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                for (int j = 0; j < array.length; j++) {
                    if (array[j] == null && j < i) {
                        array[j] = array[i];
                        array[i] = null;
                    }
                }
            }
        }
    }
}
