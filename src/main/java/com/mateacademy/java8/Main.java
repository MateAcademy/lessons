package com.mateacademy.java8;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {

            }
        };

        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        };

        Runnable runnable1 = ()-> System.out.println();
        ActionListener actionListener1 = event -> System.out.println(event.paramString());
    }
}
