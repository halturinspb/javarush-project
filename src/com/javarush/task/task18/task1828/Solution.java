package com.javarush.task.task18.task1828;

import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Прайсы 2
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String path = console.readLine();

        HashMap<String, String> map = new HashMap<>();
        String id = null;

        if (args.length != 0) {
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
                while (bufferedReader.ready()) {
                    String str = bufferedReader.readLine();
                    map.put(str.substring(0, 7).trim(), str);
                }
            }
        }

        if (args[0].equals("-u")) {
            id = args[1];
            String format = String.format("%-8.8s%-30.30s%-8.8s%-4.4s", id, args[2], args[3], args[4]);
            if (map.containsKey(id)) {
                map.put(id, format);
            }
        }

        if (args[0].equals("-d")) {
            id = args[1];
            if (map.containsKey(id)) {
                map.remove(id);
            }
        }

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path))) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                bufferedWriter.write(entry.getValue());
                bufferedWriter.newLine();
            }
        }
    }
}



