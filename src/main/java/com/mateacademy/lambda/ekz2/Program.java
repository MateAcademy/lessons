package com.mateacademy.lambda.ekz2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("two");

//        for (String s : list)
//            System.out.println(s);
//
//        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
//
//
//       Stream<String> stream = list.stream();
//        stream.forEach(x -> System.out.println(x));
//
//        list.stream().forEach(System.out::println);

        // Применяет функцию forEach к каждому объекту стрима
                list.stream().forEach(x -> System.out.println(x));

                list.stream().filter(x -> {
                    System.out.println("Hello!!!!!!!!!!!!!");
                    return x.equals("one");
                }).count(); //lazy  //eager


        System.out.println("------------");
      //  Set<String> set = list.stream().filter(x->x.equals("one")).collect(Collectors.toSet());
        Set<String> set = list.stream().collect(Collectors.toSet());
        set.stream().forEach(System.out::println);
    }
}
