package com.mateacademy.lesson7mnogop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AppScanner {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            int x = 0, y = 0;
            System.err.print("x = ");
            x = in.nextInt();
            System.err.print("y = ");
            y = in.nextInt();
            System.out.println("Summ: " + (x + y));
        } catch (InputMismatchException e) {
            System.err.println("Вместо чисел Вы ввели строку и получили Exception: InputMismatchException (");
        } finally {
            System.out.println("Учись сынок!!!!!!!!!");
        }


    }
}
