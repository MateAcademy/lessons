package mate.academy.less02.collections.linkedList.demo;

import java.util.LinkedList;
import java.util.List;

public class DemoLinkedList {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        String s = list.get(1);
        System.out.println(s);
        System.out.println("-----------------------------");

        System.out.println(list.size());
        System.out.println("-----------------------------");

        for (String string : list)
        {System.out.println(string);}
        System.out.println("-----------------------------");

        list.remove(0);
        System.out.println(list.get(0));
        System.out.println("------------------------------");

        list.remove("b");
        System.out.println(list.get(0));
        System.out.println("--------------------------------");

        System.out.println(list.size());
    }
}
