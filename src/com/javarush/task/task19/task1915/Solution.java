package com.javarush.task.task19.task1915;

import java.io.*;

/* 
Дублируем текст
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);
        testString.printSomething();
        System.setOut(consoleStream);


        try (BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
             FileOutputStream writer = new FileOutputStream(scanner.readLine())) {

            writer.write(outputStream.toByteArray());
        }
        System.out.println(outputStream.toString());

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

