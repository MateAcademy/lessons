package com.mateacademy.lessons2;

import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        scanner.close();
        System.out.println(str.toUpperCase());



//        try {
//            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//            System.out.println(bufferedReader);
//        } catch (IOException e) {
//
//        }

    }

}
