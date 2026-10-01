package com.javarush.task.task12.task1220;

/* 
Почти что Iron Man
*/

public class Solution {
    public static void main(String[] args) {

    }

    public abstract class Human implements CanSwim, CanRun{}

    public interface CanRun{
        public void run();
    }

    public interface CanSwim{
        public void swim();
    }
}
