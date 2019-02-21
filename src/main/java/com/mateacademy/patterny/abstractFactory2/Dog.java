package com.mateacademy.patterny.abstractFactory2;

public class Dog implements Animal {
    @Override
    public String getAnimal() {
        return "Dog";
    }

    @Override
    public String makeSound() {
        return "Guv-guv";
    }
}
