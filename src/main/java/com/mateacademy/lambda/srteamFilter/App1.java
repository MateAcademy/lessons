package com.mateacademy.lambda.srteamFilter;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class App1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        for (Integer i : numbers) {
            if (i >5)
                System.out.println(i);
        }

        long count = numbers.stream().filter( x -> x>5).count();
        System.out.println(count);


        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("one");

        list.stream().map(x->x.toUpperCase()); //превращаем из одного обьекта в другой

//       Stream.of("one", "two").flatMap(x -> x.toString());
       Stream.of(Arrays.asList("one", "two"), Arrays.asList("one", "two")).flatMap(x -> x.stream());

//        list.stream().filter( x -> x.equals("one")).forEach(System.out::println);

        list.stream().filter( x -> {
            System.out.println("hello");
                return x.equals("one");
        }).count();  //lazy //eager - count
//count eager

        Set<String> st = Stream.of("one", "two").collect(Collectors.toSet()); //eager
        List<String> list1 = Stream.of("one", "two").map(x->x.toUpperCase()).collect(Collectors.toList());
        List<String> list2 = Stream.of("one", "two").filter(x -> x.equals("one")).collect(Collectors.toList());
 //       List<String> list3 = Stream.of(asList("one", "two"), asList("three", "four")).flatMap(x -> x.stream()).collect(Collectors.toList());
        //Optional это обьект у которого можно получать значение через get
        int value = Stream.of(1, 2).min(Comparator.comparing(x ->x)).get();
        int value2 = Stream.of(1, 2).max(Comparator.comparing(x ->x)).get();
        int count2 = Stream.of(1, 2, 3).reduce(0, (acc, element) ->acc + element);
    }
}
