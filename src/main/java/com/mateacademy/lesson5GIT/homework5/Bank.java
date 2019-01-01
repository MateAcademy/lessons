package com.mateacademy.lesson5GIT.homework5;

public class Bank<T> implements GenericInterface<T> {
    
    T t;

    @Override
    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
