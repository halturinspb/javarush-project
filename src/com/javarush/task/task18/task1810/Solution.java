package com.javarush.task.task18.task1810;

import java.io.*;
import java.util.Scanner;

/* 
DownloadException
*/

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        while (true) {
            if (new FileInputStream(new Scanner(System.in).nextLine()).available() < 1000) {
                throw new DownloadException();
            }
        }
    }

    public static class DownloadException extends Exception {

    }
}
