package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/* 
Самые частые байты
*/

public class Solution {

//    public static void main() throws IOException {
//        Files.readString(Path.of("")).chars().boxed().map(i-> Character.);
//    }

//    public static void main2(String[] arg) throws IOException {
//        byte[] bytes = Files.readAllBytes(Path.of(new Scanner(System.in).nextLine()));
//
//        Map<Byte, Integer> map = IntStream.range(0, bytes.length)
//                .boxed()
//                .collect(Collectors.toMap(i -> bytes[i], i -> 1, (oldValue, newValue) -> oldValue + newValue));
//
//        map.entrySet().stream()
//            .filter(pair -> pair.getValue().equals(Collections.max(map.values())))
//            .forEach(pair ->System.out.println(pair.getKey() + " "));
//    }




    public static void main(String[] args) throws Exception {
        Map<Integer, Integer> map = new HashMap<>();
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream inputStream = new FileInputStream(bufferedReader.readLine())) {
            while (inputStream.available() > 0) {
                int read = inputStream.read();
                if (!map.containsKey(read)) {
                    map.put(read, 1);
                } else {
                    map.put(read, map.get(read) + 1);
                }
            }
        }
        Integer max = Collections.max(map.values());
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue().equals(max)) {
                System.out.print(entry.getKey() + " ");
            }

        }
    }
}
