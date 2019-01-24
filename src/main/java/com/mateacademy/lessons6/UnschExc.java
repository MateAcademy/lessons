package com.mateacademy.lessons6;

public class UnschExc extends RuntimeException{
        private String name = " --- ";

    public UnschExc(String name) {
        this.name = name;
    }
}
