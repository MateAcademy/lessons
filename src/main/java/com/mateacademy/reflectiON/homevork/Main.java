package com.mateacademy.reflectiON.homevork;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException,  InvocationTargetException

    {
//        Animal animal = new Animal("Cat", 10);
//        System.out.println(Arrays.toString(animal.getClass().getDeclaredMethods()));
//это класскоторый описыват класс
//        Class c = Class.forName("com.mateacademy.reflectiON.homevork.Animal");

//        String nameCl = c.getName();
//        System.out.println("name - "+ nameCl);

//        Constructor[] constr = c.getConstructors();
//        for (int i = 0; i < constr.length; i++) System.out.println(constr[i]);
//
//
//        Class fooClazz = Class.forName("com.mateacademy.reflectiON.homevork.Animal");
//        Constructor<Animal> constructor = fooClazz.getDeclaredConstructor(Object.class);
//        constructor.setAccessible(true);
//        Animal obj = constructor.newInstance("foo");
//        System.out.println(obj);

        try {
            Class c = Class.forName("com.mateacademy.reflectiON.homevork.Animal");
            Constructor cons[] = c.getDeclaredConstructors();
            for (Constructor constructor : cons) System.out.println(constructor);
            cons[1].setAccessible(true);
//            cons[1].newInstance(null);

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}