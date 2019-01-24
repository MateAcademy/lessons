package com.mateacademy.lambda.ekz1;

public class Lamp implements ElectricityConsumer{

    public void  lighton() {
        System.out.println("Лампа зажглась");
    }

    @Override
    public void electricityOn(Object sender) {
        lighton();
    }
}
