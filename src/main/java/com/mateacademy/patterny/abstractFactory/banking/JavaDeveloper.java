package com.mateacademy.patterny.abstractFactory.banking;

import com.mateacademy.patterny.abstractFactory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer writes Java code...");
    }
}
