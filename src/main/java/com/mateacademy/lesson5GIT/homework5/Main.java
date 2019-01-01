package com.mateacademy.lesson5GIT.homework5;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Bank<String> stringSell = new Bank<>();
        stringSell.setT("currency");
        Bank<String> stringSell2 = new Bank<>();
        stringSell2.setT("dollar");
        stringSell.setT("gold");

        List<String> list = Arrays.asList(stringSell.getT(),stringSell2.getT());


        Main someType = new Main();
        someType.test(list);
    }

    public <E> void test(Collection<E> collection) {
        for (E e : collection) {
            System.out.println(e);
        }
    }

}
