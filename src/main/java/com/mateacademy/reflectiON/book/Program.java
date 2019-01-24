package com.mateacademy.reflectiON.book;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
/*
        MyClass myClass = new MyClass();
        int number = myClass.getNumber();
        String name = null; //no getter =(
        System.out.println(number +" " + name + "\n");//output 0null

        System.out.println(Arrays.toString(myClass.getClass().getDeclaredFields()));
        System.out.println(Arrays.toString(myClass.getClass().getDeclaredMethods()) + "\n");

        try {
            Field field = myClass.getClass().getDeclaredField("name");
            field.setAccessible(true);
            myClass.setName("Sergey");
            name = (String) field.get(myClass);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println(number +" " + name);//output 0default

        printData(myClass);

        //get full name our class: MyClass
        System.out.println( MyClass.class.getName());
*/

/*
            MyClass myClass = null;
            try {
                Class clazz = Class.forName(MyClass.class.getName());
                myClass = (MyClass) clazz.newInstance();
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
                e.printStackTrace();
            }
            System.out.println(myClass);//output created object reflection.MyClass@60e53b93
*/

        MyClass myClass = null;

        try {
            Class clazz = Class.forName(MyClass.class.getName());
            Class[] params = {int.class, String.class};
            Class[] params2 =clazz.getConstructor().getParameterTypes();

            myClass = (MyClass) clazz.getConstructor(params).newInstance(1, "default2");
            System.out.println(myClass);//output created object reflection.MyClass@60e53b93

            Constructor[] constructors = clazz.getConstructors();
            for (Constructor constructor : constructors) {
                Class[] paramTypes = constructor.getParameterTypes();
                for (Class paramType : paramTypes) {
                    System.out.print(paramType.getName() + " ");
                }
                System.out.println();
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }


    }


    public static void printData(Object myClass){
        try {
            Method method = myClass.getClass().getDeclaredMethod("printData");
            method.setAccessible(true);
            method.invoke(myClass);
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }



}
