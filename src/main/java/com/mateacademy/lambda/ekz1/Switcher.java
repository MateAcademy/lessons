package com.mateacademy.lambda.ekz1;

import java.util.List;
import java.util.ArrayList;
/**
 * @class выключатель
 */

public class Switcher {

    private List<ElectricityConsumer> listeners = new ArrayList<>();

    public void addElectricityListener(ElectricityConsumer listener) {
        listeners.add(listener);
    }

    public void removeElectricityListener(ElectricityConsumer listener) {
        listeners.remove(listener);
    }


    public void switchon() {
        System.out.println("Выключатель включон");

//        if (consumer != null)
//            consumer.electricityOn();

        for (ElectricityConsumer c : listeners) {
            c.electricityOn(this);
        }
    }


}
