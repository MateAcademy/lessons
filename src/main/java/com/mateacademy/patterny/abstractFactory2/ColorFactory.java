package com.mateacademy.patterny.abstractFactory2;

import java.awt.*;

public class ColorFactory implements AbstractFactory<Color> {
    @Override
    public Color create(String animalType) {
        if ("Red".equalsIgnoreCase(animalType)) {
            return new Red();
        } else if ("Yellow".equalsIgnoreCase(animalType)) {
            return new Yellow();
        }
        return null;
    }
}
