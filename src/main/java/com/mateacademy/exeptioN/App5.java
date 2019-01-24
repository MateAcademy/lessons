package com.mateacademy.exeptioN;

public class App5 {
    public static void main(String[] args) throws Throwable{
//      throw new Error();
        Error[] err = {new Error(), new Error(), new Error() };
//      throw new Throwable();
        throw new RuntimeException();
    }
}
