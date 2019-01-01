package com.mateacademy.lesson5GIT.homework5;

public class Bank<T> implements GenericInterface<T> {
    String adress = "Mate academy, Tarasivska St, 16, office 28, Kyiv, Ukraine, 01033";
    T t;

    @Override
    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
