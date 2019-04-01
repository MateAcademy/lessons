package mate.academy.hw4.linkedList;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        LinkedContainer<String> stringLinked = new LinkedContainer<>();
        stringLinked.addLast("a1");
        stringLinked.addLast("abc1");
        System.out.println(stringLinked.size());
        System.out.println(stringLinked.getElementByIndex(0));
        System.out.println(stringLinked.getElementByIndex(1));

        stringLinked.addFirst("a2");
        stringLinked.addFirst("abc2");
        stringLinked.addFirst("abc3");
        stringLinked.addFirst("abc4");
        stringLinked.addFirst("abc5");
        System.out.println(stringLinked.size());
        System.out.println();

        for (String s : stringLinked) {
            System.out.println(s);
        }

        System.out.println();
        Iterator iterator = stringLinked.descendingIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
