package com.mateacademy.exeptioN;

import java.io.IOException;

public class App4 {
    public static void main(String[] args) throws IOException {
        while (true) {
            int str = System.in.read();
            System.out.println((char) str);
            System.out.println(str);
        }
    }

    public void fo() {
        RuntimeException ex = new RuntimeException();
        throw ex;

//        throw new RuntimeException();
    }
}
