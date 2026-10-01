package com.javarush.task.task19.task1927;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Контекстная реклама
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream defaultPrintStream = System.out;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        String advertisment = "JavaRush - курсы Java онлайн";

        System.setOut(new PrintStream(byteArrayOutputStream));
        testString.printSomething();
        System.setOut(defaultPrintStream);

        String[] split = byteArrayOutputStream.toString().split("\\n");

        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
            if (i % 2 != 0) {
                System.out.println(advertisment);
            }
        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}
