package com.mateacademy.lesson7mnogop;

public class MyClass {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i] + " ");
        }

        System.out.println();

//        System.exit(0);            // Преждевременное завершение программы!
        for (String s : args)
            System.out.print(s + " ");


        System.out.println();
        int [] arr = {5 ,5 ,7 ,8};
        for (int a : arr) System.out.print(a + " ");
    }
}
