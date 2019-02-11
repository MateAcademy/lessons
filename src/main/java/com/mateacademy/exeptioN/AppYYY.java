package com.mateacademy.exeptioN;

public class AppYYY {
    public static void main(String[] args) {
        System.err.println(0);
        try {
            throw new RuntimeException();
        } catch (Error e) {
            System.err.println("Test");
        } catch (RuntimeException e) {
            System.err.println("B");
        } catch (Exception e) {
            System.err.println("C");
        }
        System.err.println("1");
    }
}
