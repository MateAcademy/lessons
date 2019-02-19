package com.mateacademy.lessons7;

public class S5TheadSafeSingeltonEffective {
    private static S5TheadSafeSingeltonEffective instance;

    public S5TheadSafeSingeltonEffective() {
    }

    public static S5TheadSafeSingeltonEffective getInstance() {
        if (instance == null) {
            synchronized (S5TheadSafeSingeltonEffective.class) {
                if (instance == null) {
                    instance = new S5TheadSafeSingeltonEffective();
                }
            }
        }
    return instance;
}

}
