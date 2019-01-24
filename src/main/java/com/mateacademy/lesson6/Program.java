package com.mateacademy.lesson6;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Program {

    public static void main(String[] args) {

        MyClass myClass = new MyClass();
        int number = myClass.getNumber();
        String name = null; //no getter =(
        System.out.println(number + " " + name);//output 0null

//
        System.out.println(Arrays.toString(myClass.getClass().getDeclaredMethods()));

//        try {
//            Field field = myClass.getClass().getDeclaredField("name");
//            field.setAccessible(true);
//            name = (String) field.get(myClass);
//        } catch (NoSuchFieldException | IllegalAccessException e) {
//            e.printStackTrace();
//        }
//        System.out.println(number + name);//output 0default
    }
}
