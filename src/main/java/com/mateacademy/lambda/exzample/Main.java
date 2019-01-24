package com.mateacademy.lambda.exzample;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.function.*;

public class Main {
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            System.out.println("hello");
        }
    };

    ActionListener actionListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("hello");
        }
    };

//method without parametrs:
    Runnable runnable2 = () -> System.out.println("hello");

    final String s = "hello";
    ActionListener actionListener2 = event -> System.out.println("event");
    ActionListener actionListener3 = event -> System.out.println(s);

    public static void main(String[] args) {

        Predicate<Integer> predicate = x -> x>5;
        System.out.println(predicate.test(6));

        Predicate<Integer> predicate1 = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer>5 ;
            }
        };

//TODO Predicate and Consumer, Function, Supplier, UnaryOperator, BinaryOperator interfaces:
        Predicate<Integer> predicate2 = x -> x > 5;
        Consumer<Integer> consumer = x-> System.out.println(x);
        Function<Integer,String> function = x -> x.toString();
//        Supplier<Integer> supplier = () -> new Integer(5);
        UnaryOperator<Integer> unaryOperator = x -> x*x;
        BinaryOperator<Integer> binaryOperator = (x,y) -> x*y;

        Function<Integer,String> function2 = new Function<Integer, String>() {
            @Override
            public String apply(Integer integer) {
                return null;
            }
        };

        MyPredicte<Integer> myPredicte = x -> System.out.println(x);
       myPredicte.apply(5);
    }
}

interface MyPredicte<T> {
    void apply(T t);
}