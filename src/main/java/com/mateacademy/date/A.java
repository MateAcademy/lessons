package com.mateacademy.date;

import java.time.LocalDate;

public class A {
    public static void main(String[] args) {
        LocalDate d =  LocalDate.of(2019, 03, 01);
        d = d.withYear(2020);
        System.out.println(d);
        d = d.withDayOfYear(62);
        System.out.println(d);
    }
}
