package com.mateacademy.lambda.ekz1;

//этот интерфейс связь источника событий с потребителями,функциональный интерфейс

@FunctionalInterface
public interface ElectricityConsumer {
    void electricityOn(Object sender);
}
