package com.javarush.task.task19.task1914;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Решаем пример
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);
        testString.printSomething();
        System.setOut(consoleStream);
        String[] split = outputStream.toString().split(" ");

        int firstNum = Integer.parseInt(split[0]);
        int secondNum = Integer.parseInt(split[2]);
        int arithmeticResult;

        if (split[1].equals("+")) arithmeticResult = firstNum + secondNum;
        else if (split[1].equals("-")) {
            arithmeticResult = firstNum - secondNum;
        } else arithmeticResult = firstNum * secondNum;

        System.out.println(firstNum + " " + split[1] + " " + secondNum + " = " + arithmeticResult);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

