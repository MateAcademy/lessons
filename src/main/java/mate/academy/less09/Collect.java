package mate.academy.less09;

import java.util.ArrayList;
import java.util.List;

public class Collect {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");

        for (String s: list) {
            System.out.println(s);
list.removeAll(list);

        }

        System.out.println(list);
    }
}
