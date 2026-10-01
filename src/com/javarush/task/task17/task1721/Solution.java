package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException, CorruptedDataException {
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))){
            String path1 = bufferedReader.readLine();
            String path2 = bufferedReader.readLine();
            try(BufferedReader bufferedReader1 = new BufferedReader(new FileReader(path1));
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(path2))){
                while (bufferedReader1.ready()){
                    allLines.add(bufferedReader1.readLine());
                }
                while (bufferedReader2.ready()){
                    forRemoveLines.add(bufferedReader2.readLine());
                }
                System.out.println(allLines);
                System.out.println(forRemoveLines);
                new Solution().joinData();
                System.out.println(allLines);
                System.out.println(forRemoveLines);
            }
        }
    }

    public void joinData() throws CorruptedDataException {
       if(allLines.containsAll(forRemoveLines)){
           allLines.removeAll(forRemoveLines);
       }
       else{
           allLines.clear();
           throw new CorruptedDataException();
       }
    }
}
