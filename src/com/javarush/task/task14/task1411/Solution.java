package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

/* 
User, Loser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;
        List<String> list = Arrays.asList("user", "loser", "coder", "proger");

        while (true)
        {
            String string = reader.readLine();
            if(!list.contains(string)){
                break;
            }

            if(string.equals("user")){
                doWork(new Person.User());
            }

            else if(string.equals("loser")){
                doWork(new Person.Loser());
            }

            else if (string.equals("coder")){
                doWork(new Person.Coder());
            }

            else if (string.equals("proger")){
                doWork(new Person.Proger());
            }
        }
    }

    public static void doWork(Person person) {
        if(person instanceof Person.User){
            ((Person.User) person).live();
        }

        else if(person instanceof Person.Loser){
            ((Person.Loser) person).doNothing();
        }

        else if(person instanceof Person.Coder){
            ((Person.Coder) person).writeCode();
        }

        else if (person instanceof Person.Proger){
            ((Person.Proger) person).enjoy();
        }
    }
}
