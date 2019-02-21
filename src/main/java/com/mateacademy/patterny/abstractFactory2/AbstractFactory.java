package com.mateacademy.patterny.abstractFactory2;

public interface AbstractFactory<T> {
    T create(String animalType) ;
}