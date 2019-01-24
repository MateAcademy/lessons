package com.mateacademy.exeptioN;

public class App8 {
    public static void main(String[] args) throws Throwable  {

        try {
            throw new Throwable();
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
}
