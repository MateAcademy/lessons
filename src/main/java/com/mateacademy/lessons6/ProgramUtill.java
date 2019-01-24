package com.mateacademy.lessons6;

public class ProgramUtill {

    //multiply arguments:
    public static double multM(int a, int b) throws CheckExc {
        if (a == 0 || b == 0) throw new CheckExc("Error checked");
        if (a == b) throw new UnschExc("Error unchecked");
        double c = a * b;
        return c;
    }

    //division arguments:
    public static double divM(int a, int b) {

        if (b == 0) throw new UnschExc("Error unchecked");

        double k = (double) a / b;
        return k;
    }
}
