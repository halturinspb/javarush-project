package com.javarush.task.task20.task2002;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
Читаем и пишем в файл: JavaRush
*/

public class Solution {
    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MM yyyy");
        //you can find your_file_name.tmp in your TMP directory or adjust outputStream/inputStream according to your file's actual location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File yourFile = new File("C:\\Users\\ALEKSEY\\javarush\\1652910\\javarush-project\\src\\com\\javarush\\task\\task20\\task2002\\File");
            // File yourFile = File.createTempFile("your_file_name", null);
            OutputStream outputStream = new FileOutputStream(yourFile);
            InputStream inputStream = new FileInputStream(yourFile);

            JavaRush javaRush = new JavaRush();
            //initialize users field for the javaRush object here - инициализируйте поле users для объекта javaRush тут
            User user1 = new User();
            user1.setFirstName("Alex");
            user1.setLastName("Ivanov");
            Date date = dateFormat.parse("19 12 1986");
            long time = date.getTime();
            user1.setBirthDate(new Date(time));
            user1.setMale(true);
            String rus = "RUSSIA";
            user1.setCountry(User.Country.valueOf(rus));
            javaRush.users.add(user1);
            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            //here check that the javaRush object is equal to the loadedObject object - проверьте тут, что javaRush и loadedObject равны

            System.out.println(javaRush);
            System.out.println(loadedObject);
            System.out.println(javaRush.equals(loadedObject));
            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Oops, something is wrong with my file");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Oops, something is wrong with the save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            //implement this method - реализуйте этот метод
            try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream))) {
                writer.write(String.valueOf(users.size()));
                if (users.size() != 0) {
                    writer.newLine();
                    for (User user : users) {
                        String string = user.getFirstName() + " " + user.getLastName() + " " + user.getBirthDate().getTime() + " "
                                + user.isMale() + " " + user.getCountry().getDisplayName();
                        System.out.println(string);
                        writer.write(string);
                        writer.newLine();
                    }
                }
            }
        }

        public void load(InputStream inputStream) throws Exception {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
                while (reader.ready()) {
                    int usersSize = Integer.parseInt(reader.readLine());
                    users = new ArrayList<>();
                    if (usersSize != 0) {
                        for (int i = 0; i < usersSize; i++) {
                            String[] userLine = reader.readLine().split(" ");
                            users.add(new User(userLine[0], userLine[1], new Date(Long.parseLong(userLine[2])),
                                    Boolean.parseBoolean(userLine[3]), User.Country.valueOf(userLine[4].toUpperCase())));
                        }
                    }
                }
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JavaRush javaRush = (JavaRush) o;

            return users != null ? users.equals(javaRush.users) : javaRush.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }

        @Override
        public String toString() {
            return "JavaRush{" +
                    "users=" + users +
                    '}';
        }
    }


}
