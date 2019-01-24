package com.mateacademy.exeptioN;

public class Test2AutofMem {
    public static void main(String[] args) throws Exception{
        if (true) throw new RuntimeException();
        if (System.nanoTime()%2==0) throw new Exception();
        Long[] l = new Long[Integer.MAX_VALUE];
        long x;
        x=78L;
    }
}
