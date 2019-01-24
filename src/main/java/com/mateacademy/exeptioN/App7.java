package com.mateacademy.exeptioN;

public class App7 {
    public static void main(String[] args) {
        methThrowUnchekedException();
    }

    public static void methThrowUnchekedException() {
        try {
            throw null;
        } catch (NullPointerException e) {

        }finally {
            System.err.println("We are catch NullPointerException");
        }

    }
}
