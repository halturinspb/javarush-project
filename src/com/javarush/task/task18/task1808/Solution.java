package com.javarush.task.task18.task1808;

import java.io.*;

/* 
Разделение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
             InputStream inputStream = new FileInputStream(bufferedReader.readLine());
             OutputStream outputStream1 = new FileOutputStream(bufferedReader.readLine());
             OutputStream outputStream2 = new FileOutputStream(bufferedReader.readLine())) {

            if (inputStream.available() > 0) {
                byte[] data = new byte[inputStream.available() / 2 + inputStream.available() % 2];
                inputStream.read(data);
                outputStream1.write(data, 0, data.length);
                int read = inputStream.read(data);
                outputStream2.write(data, 0, read);
            }
        }
    }
}
