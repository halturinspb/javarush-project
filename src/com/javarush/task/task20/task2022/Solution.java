package com.javarush.task.task20.task2022;

import java.io.*;

/* 
Переопределение сериализации в потоке
*/

public class Solution implements Serializable, AutoCloseable {
    private transient FileOutputStream stream;
    private String fileName;

    public Solution(String fileName) throws FileNotFoundException {
        this.stream = new FileOutputStream(fileName);
        this.fileName = fileName;
    }

    public void writeObject(String string) throws IOException {
        stream.write(string.getBytes());
        stream.write("\n".getBytes());
        stream.flush();
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        stream = new FileOutputStream(fileName, true);
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing everything!");
        stream.close();
    }

    public static void main(String[] args) {
        String path = "C:\\Users\\ALEKSEY\\javarush\\1652910\\javarush-project\\src\\com\\javarush\\task\\task20\\task2022\\File";
        String path2 = "C:\\Users\\ALEKSEY\\javarush\\1652910\\javarush-project\\src\\com\\javarush\\task\\task20\\task2022\\File2";
        try (FileOutputStream fileOutputStream = new FileOutputStream(path2);
             ObjectOutputStream out = new ObjectOutputStream(fileOutputStream);
             FileInputStream fileInputStream = new FileInputStream(path2);
             ObjectInputStream in = new ObjectInputStream(fileInputStream)) {

            Solution solution = new Solution(path);
            solution.writeObject("Test string");
            out.writeObject(solution);

            Solution load = (Solution) in.readObject();
            load.writeObject("Test string 2");

        } catch (Exception ignore) {
            ignore.printStackTrace();
            System.out.println("Test");
        }
    }
}
