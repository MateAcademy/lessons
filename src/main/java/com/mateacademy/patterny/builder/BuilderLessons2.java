package com.mateacademy.patterny.builder;

public class BuilderLessons2 {
    public static void main(String[] args) {

    }
}

class Car {
    String name;
    int power;
    String coler;
    int doors;

    private Car() {
        this.name = name;
        this.power = power;
        this.coler =coler;
        this.doors = doors;

    }
    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public String getColer() {
        return coler;
    }

    public int getDoors() {
        return doors;
    }
}