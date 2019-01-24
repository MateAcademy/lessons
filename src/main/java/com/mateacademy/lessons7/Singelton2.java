package com.mateacademy.lessons7;

public class Singelton2 {
    private static Singelton2 inst;

    private Singelton2() {
    }

//synchronized что бы не могли создать два обьекта одновременно
    public static Singelton2 getInst() {
        if (inst == null) {
            synchronized (Singelton2.class) {
                if (inst == null) {
                    inst = new Singelton2();
                }
            }
        }
        return inst;
    }
}
