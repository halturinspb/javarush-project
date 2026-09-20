package com.javarush.task.jdk13.task38.task3803;

/* 
Обработка аннотаций
*/

public class Solution {
    public static void main(String[] args) {
        printFullyQualifiedNames(Solution.class);
        printFullyQualifiedNames(SomeTest.class);

        printValues(Solution.class);
        printValues(SomeTest.class);
    }

    public static <T> boolean printFullyQualifiedNames(Class<T> c) {
        if (c.isAnnotationPresent(PrepareMyTest.class)) {
            PrepareMyTest annotation = c.getAnnotation(PrepareMyTest.class);
            for (String string : annotation.fullyQualifiedNames()) {
                System.out.println(string);
            }
            return true;
        }
        return false;
    }

    public static <T> boolean printValues(Class<T> c) {
        if (c.isAnnotationPresent(PrepareMyTest.class)) {
            PrepareMyTest annotation = c.getAnnotation(PrepareMyTest.class);
            for (Class<?> aClass : annotation.value()) {
                System.out.println(aClass.getSimpleName());
            }
            return true;
        }
        return false;
    }
}
