package com.mateacademy.lessons6;

public class CheckExc extends Exception {

    private String name = " !!! ";

    public CheckExc(String name) {
        this.name = name;
    }
}
