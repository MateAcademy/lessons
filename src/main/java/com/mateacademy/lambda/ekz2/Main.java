package com.mateacademy.lambda.ekz2;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(1);
                System.out.println("-------------------------------");
            }
        }).run();


        new Thread(() -> System.out.println(1)).run();
        System.out.println("-------------------------------");


        System.out.println((Incrementer) x -> x + 1);
        System.out.println("-------------------------------");

        Incrementer incrementer = new Incrementer() {
            @Override
            public int increment(int x) {
                return x + 1;
            }
        };
        System.out.println(incrementer.increment(1));

        System.out.println("-------------------------------");
        Incrementer incrementer2 = x -> x + 1;
        System.out.println(incrementer2.increment(1));


        ArrayList<Integer> ints  = new ArrayList<>(); ints.add(1); ints.add(2); ints.add(3);

    ints.forEach(integer -> System.out.println(integer +1));
    }


}
