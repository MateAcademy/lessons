package com.mateacademy.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainRegex {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("^[0-9]+$");
        Matcher m = p.matcher("12");
        if (m.matches()) {
            System.out.println("Строка соответствует шаблону");
        } else {
            System.out.println("Не соответствует");
        }
    }
}
//TODO: Не соответствует почему?
class A {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[0-9]");
        Matcher m = p.matcher("12");
        if (m.matches()) {
            System.out.println("Строка соответствует шаблону");
        } else {
            System.out.println("Не соответствует");
        }
    }
}

class B {
    public static void main(String[] args) {
        if (Pattern.matches("^[0-9]+$", "12")) {
            System.out.println("Строка соответствует шаблону");
        } else {
            System.out.println("Не соответствует");
        }
    }
}

class С {
    public static void main(String[] args) {
        if ("12".matches("^[0-9]+$")) {
            System.out.println("Строка соответствует шаблону");
        } else {
            System.out.println("Не соответствует");
        }
        }

}

class D {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("^[a-z]+$", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher("ABCDEF");
        System.out.println(m.matches());
    }
}