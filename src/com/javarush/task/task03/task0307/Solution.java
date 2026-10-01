package com.javarush.task.task03.task0307;

/* 
Привет StarCraft!
*/

public class Solution {
    public static void main(String[] args) {
       Zerg zerg1 = new Zerg();
       zerg1.name = "Tom";
        Zerg zerg2 = new Zerg();
        zerg2.name = "Jerry";
        Zerg zerg3 = new Zerg();
        zerg3.name = "Alan";
        Zerg zerg4 = new Zerg();
        zerg4.name = "Piter";
        Zerg zerg5 = new Zerg();
        zerg5.name = "Alex";

        Protoss protoss1 = new Protoss();
        protoss1.name = "Krab";
        Protoss protoss2 = new Protoss();
        protoss2.name = "Scorpion";
        Protoss protoss3 = new Protoss();
        protoss3.name = "Nill";

        Terran terran1 = new Terran();
        terran1.name = "Vika";
        Terran terran2 = new Terran();
        terran2.name = "Oleg";
        Terran terran3 = new Terran();
        terran3.name = "Procop";
        Terran terran4 = new Terran();
        terran4.name = "Lena";

       //напишите тут ваш код

    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
