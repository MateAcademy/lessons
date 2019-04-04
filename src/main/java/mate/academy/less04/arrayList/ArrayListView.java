package mate.academy.less04.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListView {
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();

        strings.add("0");
        strings.add("1");
        strings.add("2");

//        strings.forEach(System.out::println);

        Iterator i = strings.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        System.out.println(strings.size());
        strings.clear();
        strings.remove(0);
        strings.removeAll(strings);

        System.out.println(strings.size());

//        System.out.println(strings.get(0));
//
//        int a = 71;
//
//        strings.add(String.valueOf(a));
//
//        List<Integer> y = new ArrayList<>();
//        y.add(Integer.valueOf(a));
//        y.forEach(System.out::println);
//
//        y.remove(0);
//        y.forEach(System.out::println);
//        System.out.println(y.size());


    }

}
