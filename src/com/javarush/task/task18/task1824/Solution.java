package com.javarush.task.task18.task1824;

import java.io.*;
import java.util.Scanner;

/* 
Файлы и исключения
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            String path = scanner.nextLine();
            try(BufferedReader reader = new BufferedReader(new FileReader(path))){
                while (reader.ready()){
                    reader.readLine();
                }

            } catch (FileNotFoundException e) {
                System.out.println(path);
                return;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
