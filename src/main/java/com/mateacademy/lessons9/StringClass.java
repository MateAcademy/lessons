package com.mateacademy.lessons9;

public class StringClass {
    public static void main(String[] args) {
        String str = "Hello";
        String str2 = new String(str);
        String str3 = str;
        str3 = "hi";
        str2 =str2 + " RT";
        System.out.println(str);
        System.out.println(str2);

        String hello = "Hello";
        String habr = "habrahabr";
        String delimiter = ", ";

        System.out.println(String.join(delimiter, hello, habr));

        StringBuffer stringBuffer = new StringBuffer(50);
        System.out.println(stringBuffer);

        String s = new String(68 + "");
        System.out.println(s);
    }
}
