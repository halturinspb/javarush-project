package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String path = bufferedReader.readLine();

        ArrayList<Integer> list = new ArrayList<>();
        try(InputStream inputStream = new FileInputStream(path)){
            while (inputStream.available()>0){
                list.add(inputStream.read());
            }
        }
        Collections.sort(list);
        System.out.println(list.get(0));
    }
}
