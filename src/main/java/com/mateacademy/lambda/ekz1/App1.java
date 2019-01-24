package com.mateacademy.lambda.ekz1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.function.*;

public class App1 {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello");
            }
        };

        Runnable runnable2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello");
            }
        };

        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("--");
            }
        };

        Runnable runnable1 = () -> System.out.println("&&");
        ActionListener actionListener1 = event -> System.out.println(event.paramString());

        Predicate<Integer> predicate = x -> x>5;

//TODO: **********************************************************************************
        System.out.println(predicate.test(3));
        Consumer<Integer> consumer = x-> System.out.println(x);
        Function<Integer,String> function = x -> x.toString();
//        Supplier<Integer> supplier = () ->new Integer(5);
        UnaryOperator<Integer> unaryOperator = x -> x*x;
        BinaryOperator<Integer> binaryOperator = (x,y) -> x*y;

        MyPredicate<Integer> myPredicate = x -> System.out.print(x);
        myPredicate.apply(5);
    }


    interface MyPredicate<T> {
        void apply(T t);
    }

}
