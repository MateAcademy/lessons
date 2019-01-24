package com.mateacademy.lessons7;

public final class Singleton {
    private static final Singleton inst = new Singleton();

    public static synchronized Singleton getInstance() { return inst; }
}