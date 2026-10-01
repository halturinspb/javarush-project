package com.javarush.task.pro.task15.task1504;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

/* 
Перепутанные байты
*/

public class Solution {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);
             var inputStream = Files.newInputStream(Paths.get(scanner.nextLine()));
             var outputStream = Files.newOutputStream(Paths.get(scanner.nextLine()))
        ) {
            byte[] buffer = new byte[1024];
            while (inputStream.available() != 0) {
                buffer = inputStream.readNBytes(2);

                if (buffer.length == 1) {
                    outputStream.write(buffer[0]);
                } else {
                    outputStream.write(buffer[1]);
                    outputStream.write(buffer[0]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

