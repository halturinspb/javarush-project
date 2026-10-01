package com.javarush.task.task18.task1807;

import java.io.*;

/* 
Подсчет запятых
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        InputStream inputStreamReader = new FileInputStream(bufferedReader.readLine())){
            int count = 0;
            while (inputStreamReader.available()>0){
                if(inputStreamReader.read() == 44)count++;
            }
            System.out.println(count);
        }
    }
}
