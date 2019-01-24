package com.mateacademy.lessons2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App4 {
    public static void main(String[] args) {

        try {
            BufferedReader reader = new BufferedReader(new FileReader("src\\Main\\resources\\input.txt"));
            String strings;
            while ((strings = reader.readLine()) != null) {
                System.out.println(strings.toUpperCase().replaceAll("J", "!!!!!"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
