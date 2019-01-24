package com.mateacademy.collec;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.add("one");
        stack.push("two");


        System.out.println(stack.peek());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());


        System.out.println("--------------");
        for (String s : stack) {
            System.out.println(s);
        }
    }
}
