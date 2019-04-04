package mate.academy.less04.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(3);
        set.add(5);
        set.add(-3);

        System.out.println(set);


        Set<Integer> set2 = new LinkedHashSet<>();
        set2.add(1);
        set2.add(3);
        set2.add(5);
        set2.add(-3);

        System.out.println(set2);

        Set<Integer> set3 = new TreeSet<>();
        set3.add(1);
        set3.add(3);
        set3.add(5);
        set3.add(-3);

        System.out.println(set3);
    }
}
