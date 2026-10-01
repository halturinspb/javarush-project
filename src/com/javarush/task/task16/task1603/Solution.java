package com.javarush.task.task16.task1603;

import java.util.ArrayList;
import java.util.List;

/* 
Список и нити
*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
        SpecialThread sf1 = new SpecialThread();
        SpecialThread sf2 = new SpecialThread();
        SpecialThread sf3 = new SpecialThread();
        SpecialThread sf4 = new SpecialThread();
        SpecialThread sf5 = new SpecialThread();

        Thread th1 = new Thread(sf1);
        Thread th2 = new Thread(sf2);
        Thread th3 = new Thread(sf3);
        Thread th4 = new Thread(sf4);
        Thread th5 = new Thread(sf5);

        list.add(th1);
        list.add(th2);
        list.add(th3);
        list.add(th4);
        list.add(th5);
    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's a run method inside SpecialThread");
        }
    }
}
