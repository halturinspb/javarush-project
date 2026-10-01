package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;


/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) throws IOException, ParseException {
//        PersonScannerAdapter personScannerAdapter = new PersonScannerAdapter(new Scanner(System.in));
//        Person person = personScannerAdapter.read();
//        System.out.println(person);
    }

    public static class PersonScannerAdapter implements PersonScanner {
        private Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException, ParseException {
            //SimpleDateFormat dateFormat = new SimpleDateFormat("dd MM yyyy");
            String line = fileScanner.nextLine();
            String[] lines = line.split(" ");
            String firstName = lines[1];
            String middleName = lines[2];
            String lastName = lines[0];

//            int firstDigit = 0;
//            for (int i = 0; i < line.length(); i++) {
//                char c = line.charAt(i);
//                if (Character.isDigit(c)) {
//                    firstDigit = i;
//                    break;
//                }
//            }
            int day = Integer.parseInt(lines[3]);
            int month = Integer.parseInt(lines[4]);
            int year = Integer.parseInt(lines[5]);

            Calendar calendar = new GregorianCalendar(year, month - 1, day);

            //Date birthDate = dateFormat.parse(line.substring(firstDigit));

            return new Person(firstName, middleName, lastName, calendar.getTime());
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
