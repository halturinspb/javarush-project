package com.javarush.task.task19.task1921;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();
    static SimpleDateFormat dateFormat = new SimpleDateFormat("dd MM yyyy");

    public static void main(String[] args) throws IOException, ParseException {
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            while (reader.ready()) {
                String line = reader.readLine();

                String name = line.replaceAll("\\d", "").trim();
                String date = line.replaceAll("\\D", " ").trim();
                PEOPLE.add(new Person(name, dateFormat.parse(date)));

//                Integer digitIndex = line.chars()
//                        .mapToObj(c -> (char) c)
//                        .filter(Character::isDigit)
//                        .findFirst()
//                        .map(c -> line.indexOf(c)).get();
//                String name = line.substring(0, digitIndex-1);
//                String dateStr = line.substring(digitIndex, line.length());
//                Date date = dateFormat.parse(dateStr);
//                PEOPLE.add(new Person(name, date));
            }
            PEOPLE.forEach(System.out::println);
        }
    }
}
