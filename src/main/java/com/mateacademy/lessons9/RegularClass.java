package com.mateacademy.lessons9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularClass {
    public static void main(String[] args) {
        //"\\b[Test-Za-z0-9._%+-]+@[Test-Za-z0-9.-]+\\.[Test-Za-z]{2,4}\\b"

        System.out.println("myemail@mail.ru".matches("\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}\\b"));

        Pattern p = Pattern.compile("a");
        Matcher m = p.matcher("Jack is a boy");
        while (m.find()) {
            System.out.print(m.start() + " " + m.group() + " ");
        }
        System.out.println("");

        Pattern p2 = Pattern.compile("\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}\\b");
        Matcher m2 = p2.matcher("my email is ava@mail.ru");
        while (m2.find()) {
            System.out.print(m2.start() + " " + m2.group() + " ");
        }
    }
}
