package com.mateacademy.collec;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class MainDeque {
    public static void main(String[] args) {

        Deque<String> deque = new ArrayDeque<>();
        Deque<String> deque1 = new LinkedList<>();

        deque.add("one");
        deque.offer("two");
        deque.addLast("three");
        deque.offerLast("four");

    }
}
