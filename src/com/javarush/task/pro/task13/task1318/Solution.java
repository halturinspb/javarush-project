package com.javarush.task.pro.task13.task1318;

/* 
Следующий месяц, пожалуйста
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getNextMonth(Month.JANUARY));
        System.out.println(getNextMonth(Month.JULY));
        System.out.println(getNextMonth(Month.DECEMBER));
    }

    public static Month getNextMonth(Month month) {
        Month nextMonth = null;
        if (month.ordinal() == Month.values().length - 1) {
            nextMonth = Month.values()[0];
        } else nextMonth = Month.values()[month.ordinal() + 1];
        return nextMonth;
    }
}
