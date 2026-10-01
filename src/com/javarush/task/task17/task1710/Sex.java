package com.javarush.task.task17.task1710;

public enum Sex {
    MALE("м"),
    FEMALE("ж");

    private String sex;

    private Sex(String sex) {
        this.sex = sex;
    }

    public String getSex(){
        return sex;
    }
}
