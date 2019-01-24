package com.mateacademy.lambda.collectorsStream;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class App1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("one", "two", "three","one"));

        list.stream().filter(x->!x.equals("three")).collect(Collectors.toSet()).forEach(System.out::println);
        Set<String> set = list.stream().collect(Collectors.toSet());
    }
}
