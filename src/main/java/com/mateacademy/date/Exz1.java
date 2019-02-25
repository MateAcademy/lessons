package com.mateacademy.date;

import java.util.Date;

public class Exz1 {
    public static void main(String[] args) {
        Long data = System.currentTimeMillis();
        int t = 500 + 6000;
        System.out.println();
        Long data2 = System.currentTimeMillis();

        System.out.println(data);
        System.out.println(data2);

        System.out.println();


        Date date = new Date();
        System.out.println(date.getTime());
        System.out.println(date.toString());
    }
}
