package mate.academy.less02.iterator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();

        set.add("Hello1");
        set.add("Hello2");
        set.add("Hello3");
        set.add("Hello4");
        set.add("Hello5");

        for (String element : set) {
            System.out.println(element);
        }
        System.out.println();

        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }



    }
}
