package com.mateacademy.exeptioN;

public class App0 {
    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            f();
            System.err.println();
        }
    }

    public static void f() {
        for (int k = 0; k < 2; k++) {
            System.err.print(0);
//            if(true) continue;
            if(true) break;
//            if(true) return;
//            if(true) throw new Error();
            System.err.print(1);
        }
        System.err.print(2);
    }
}
