package com.mateacademy.lambda.streamJava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Man {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("two");
        list.add("three");
        list.add("four");
//TODO  Мы хотим вывести list 1 способ:
//        list.forEach((x)-> System.out.println(x));
//TODO  Мы хотим вывести list 6 способ:
//        list.forEach(System.out::println);

//TODO Мы хотим вывести list 2 способ:
//    for (String s: list)
//        System.out.println(s);

//TODO Мы хотим вывести list 3 способ:
//        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

// STREAM превращает поток всех значений что есть у меня в коллекции в поток значений:
//TODO Мы хотим вывести list 4 способ:
//        Stream<String> stream = list.stream();
//        stream.forEach(x-> System.out.println(x));

//TODO Мы хотим вывести list 5 способ, в одну строчку:
//        list.stream().forEach((x)-> System.out.println(x));

        Stream<String> stream = list.stream();
        stream = list.stream().filter(x->x.equals("two"));
        stream.forEach(x-> System.out.println(x));

//        stream = list.stream();
        list.stream().filter(x->x.equals("two")).forEach(System.out::println);

//        list.stream().filter()
    }

}
