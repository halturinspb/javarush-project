package com.javarush.task.pro.task10.task1010;

import java.util.Objects;

/* 
Два айфона
*/

public class Iphone {
    private String model;
    private String color;
    private int price;

    public Iphone(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (!(o instanceof Iphone)) return false;

        Iphone iphone = (Iphone) o;
        if (this.price != iphone.price) return false;
        if (this.color == null || iphone.color == null)
            if (this.color != iphone.color) return false;
        if (this.model == null || iphone.model == null)
            if (this.model != iphone.model) return false;

        return this.model.equals(iphone.model) && this.color.equals(iphone.color);
    }

    public static void main(String[] args) {
        Iphone iphone1 = new Iphone("X", "Black", 999);
        Iphone iphone2 = new Iphone("X", "Black", 999);

        System.out.println(iphone1.equals(iphone2));
    }

}
