package com.mateacademy.clone;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        MyClass myClass = new MyClass();
        myClass.i = 5;
        System.out.println(myClass.i);
        myClass.run();
        myClass.spead = 5;
        System.out.println(myClass.spead);



        MyClass m = myClass;
        m.i = 10;
        System.out.println(myClass.i);

        MyClass m2 = m.clone();
        m2.i=20;
        System.out.println(myClass.i);
    }
}

class MyClass implements Cloneable{
    int i;
    protected int spead = 2;

    @Override
    protected MyClass clone() throws CloneNotSupportedException {
        return (MyClass)super.clone();
    }

    protected void run() {
        System.out.println("I like run in the morning");
    }
}
