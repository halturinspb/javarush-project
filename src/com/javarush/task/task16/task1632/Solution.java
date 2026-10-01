package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Клубок
*/

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new Thread1());
        threads.add(new Thread2());
        threads.add(new Thread3());
        threads.add(new Thread4());
        threads.add(new Thread5());
    }

    public static void main(String[] args) {

    }


    static class Thread1 extends Thread {
        @Override
        public void run() {
            while (true) ;
        }
    }

    static class Thread2 extends Thread {
        @Override
        public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("InterruptedException");
                }
        }
    }

    static class Thread3 extends Thread {
        @Override
        public void run() {
            while (!isInterrupted()) {
                try {
                    System.out.println("Ура");
                    sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    static class Thread4 extends Thread implements Message {

        @Override
        public void showWarning() {
            this.interrupt();
        }

        @Override
        public void run() {
            while (!isInterrupted()) {
            }
        }
    }

    static class Thread5 extends Thread {


        @Override
        public void run() {
            int sum = 0;
            try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
                while (bufferedReader.ready()) {
                    String string = bufferedReader.readLine();
                    if (string.equals("N")) {
                        System.out.println(sum);
                        break;
                    }
                    else {
                        sum += Integer.parseInt(string);
                    }
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

}