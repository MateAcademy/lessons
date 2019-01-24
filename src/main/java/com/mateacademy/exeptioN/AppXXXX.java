package com.mateacademy.exeptioN;

public class AppXXXX {
    public static void main(String[] args) {
        System.err.print(0);
        try {
            f();
        } catch (Exception t) {
            System.err.print("Exception");
        }

        System.err.print(" " +1);
    }

    private static void f() {
        System.err.print("  " +2);
        g();
        System.err.print("   " +3);
    }

    private static void g() {
        System.err.print("  " +4);
        try {
            h();
        } catch (Error er) { }
        System.err.print("Error");
    }

    private static void h() {
        System.err.print("   " +6);
        throw new RuntimeException();
//        System.err.print("    " +7);
    }
}
