package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();
    static {
        labels.put(2.0, "первый");
        labels.put(4.6, "второй");
        labels.put(-2d, "первый");
        labels.put(123.123, "первый");
        labels.put(456789.2, "первый");

    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
