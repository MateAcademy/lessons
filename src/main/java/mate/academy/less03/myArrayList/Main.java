package mate.academy.less03.myArrayList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Simple<String> strings = new SimpleArray<>();
        strings.add("first");
        strings.add("second");
        strings.add("tree");

        System.out.println(strings.get(1));
        System.out.println(strings.size());

        strings.update(1, "update");
        System.out.println(strings.get(1));


        strings.delete(1);
        System.out.println(strings.get(1));


        for (String s : strings) {
            System.out.println(s);
        }

        List<String> list = new ArrayList<>();
        list.add("dd");
        list.add("dd");
        list.remove(0);
        System.out.println(list.size());

    }
}
