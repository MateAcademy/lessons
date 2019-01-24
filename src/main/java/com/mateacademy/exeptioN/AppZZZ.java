package com.mateacademy.exeptioN;

public class AppZZZ {
    public static void main(String[] args) {
        System.err.println("0");
        try {
            throw new RuntimeException();
        } catch (Throwable t) {
            if (t instanceof RuntimeException)  {
            }else if (t instanceof Exception)   {
            }else if (t instanceof Error)       {
            }
        }
        System.out.println(1);
    }
}
