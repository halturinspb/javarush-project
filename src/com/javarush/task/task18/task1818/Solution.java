package com.javarush.task.task18.task1818;

import java.io.*;
import java.util.Scanner;

/* 
Два в одном
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String path1 = scanner.nextLine();
        String path2 = scanner.nextLine();
        String path3 = scanner.nextLine();

        try(BufferedReader bufferedReader2 = new BufferedReader(new FileReader(path2));
            BufferedReader bufferedReader3 = new BufferedReader(new FileReader(path3));
            BufferedWriter bufferedWriter1 = new BufferedWriter(new FileWriter(path1,true))){
        while (bufferedReader2.ready()){
            bufferedWriter1.write(bufferedReader2.readLine());
        }
        while (bufferedReader3.ready()){
            bufferedWriter1.write(bufferedReader3.readLine());
        }
        }
    }
}
