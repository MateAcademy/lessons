package com.mateacademy.lessons2;

import java.io.File;
import java.util.Scanner;

public class App3 {
    private static Scanner file;

    public static void main(String[] args) {
        openfile();
        readfile();
    }

    public static void openfile() {
        try {
            file = new Scanner(new File("src\\Main\\resources\\input.txt"));

        } catch (Exception e) {
            System.out.println("Файл не найден");
        }
    }

    private static void readfile() {
        while (file.hasNextLine()) {
            String id = file.nextLine();

            System.out.println(id.toUpperCase().replaceAll("J", "---"));
        }
    }


}
