package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    private List<Horse> horses;
    static Hippodrome game;

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return horses;
    }

    public void run() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            move();
            print();
            Thread.sleep(200);
        }
    }

    public void move() {
        for (Horse horse : horses) {
            horse.move();
        }
    }

    public void print() {
        for (Horse horse : horses) {
            horse.print();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }

    public Horse getWinner(){
        Double maxDistance = horses.stream()
                .map(horse -> horse.getDistance())
                .max(Double::compareTo)
                .get();

        for (Horse horse : horses) {
            if(horse.getDistance()==maxDistance)return horse;
        }
        return null;
    }
    public void printWinner(){

        System.out.printf("Winner is %s!", getWinner().getName());
    }

    public static void main(String[] args) throws InterruptedException {
        ArrayList<Horse> list = new ArrayList<>();
        list.add(new Horse("Серая", 3, 0));
        list.add(new Horse("Белая", 3, 0));
        list.add(new Horse("Черная", 3, 0));
        game = new Hippodrome(list);
        game.run();
        game.printWinner();
    }
}
