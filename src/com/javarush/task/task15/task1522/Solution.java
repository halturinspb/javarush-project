package com.javarush.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Закрепляем знание Singleton pattern
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static Planet thePlanet;

    static {
        readKeyFromConsoleAndInitPlanet();
    }

    public static void readKeyFromConsoleAndInitPlanet() {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        if (Planet.SUN.equals(line)) {
            thePlanet = Sun.getInstance();
        } else if (Planet.MOON.equals(line)) {
            thePlanet = Moon.getInstance();
        } else if (Planet.EARTH.equals(line)) {
            thePlanet = Earth.getInstance();
        } else thePlanet = null;
    }
}
