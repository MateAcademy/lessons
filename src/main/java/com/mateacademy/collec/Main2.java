package com.mateacademy.collec;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main2 {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        queue.add("aa");
        queue.offer("ff");

        String str = queue.remove();
        String str2 = queue.poll();

        System.out.println(str);
        System.out.println(str2);


        for (String s : queue) {
            System.out.println(s);
        }

    }
}
