package com.mateacademy.test;

public class MuLink {
    public MuLink() {
        str = "New";
    }
    public String str;
}

 class Test {
    public static void main(String[] args) {
        MuLink b1 = new MuLink();
        MuLink b2 = b1;
        b2.str="My String";
        System.out.println(b1.str);

        String a1 = "Test";
        String a2 = a1;
        System.out.println(a2);
        a1 = "Not a Test";
        System.out.println(a2);
    }
}
