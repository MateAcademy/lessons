package mate.academy.less02.collections.arrayListTutorial;

import java.util.ArrayList;
import java.util.List;

public class ArrayListView {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<String>();

        strings.add("abc");
        strings.add("aaa");

//        for (String s : strings) System.out.println(s);
//        strings.forEach(System.out::println);
//
//        System.out.println(strings.get(0));
//        System.out.println("size1 = " + strings.size());
//
//        strings.remove(1);
//        System.out.println("size2 = " + strings.size());
//        strings.forEach(System.out::println);

        strings.clear();
        System.out.println("size3 = " + strings.size());
    }
}
