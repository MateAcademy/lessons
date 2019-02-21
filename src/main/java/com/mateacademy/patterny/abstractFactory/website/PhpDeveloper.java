package com.mateacademy.patterny.abstractFactory.website;

import com.mateacademy.patterny.abstractFactory.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php developer writes php code...");
    }
}
