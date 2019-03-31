package mate.academy.less03.arrayListTutorial;

import java.util.ArrayList;
import java.util.List;

public class ArrayListView {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();

        strings.add("abc");
        strings.add("abc");
        strings.add("aaa");                  //1

        for (String string : strings) {
            System.out.println(string);
        }

        strings.forEach(System.out::println);

        System.out.println(strings.get(2));   // 2
        System.out.println(strings.size());   // 3

        System.out.println(strings.remove(0));
        strings.clear();

    }
}
