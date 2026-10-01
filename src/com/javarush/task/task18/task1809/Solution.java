package com.javarush.task.task18.task1809;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* 
Реверс файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
             InputStream inputStream = new FileInputStream(bufferedReader.readLine());
             OutputStream outputStream = new FileOutputStream(bufferedReader.readLine())) {

            while (inputStream.available() > 0) {
                byte[] data = new byte[inputStream.available()];
                inputStream.read(data);
                for (int i = data.length - 1; i >= 0; i--) {
                    outputStream.write(data[i]);
                }
            }
        }
    }
}
