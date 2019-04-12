package mate.academy.hw06;

import java.util.*;

public class Difference {
    public static void main(String[] args) {
    Set<Integer> set1 = new HashSet<>();
    Set<Integer> set2 = new HashSet<>();

        set1.add(5);
        set1.add(15);
        set1.add(17);
        set1.add(40);

        set2.add(4);
        set2.add(15);
        set2.add(19);
        set2.add(40);

    Set<Integer> set3 = symmetricDifference(set1, set2);

        System.out.println(set1);
        System.out.println(set2);
        System.out.println(set3);
}

    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set set = new HashSet();
        Set temporarySet1 = new HashSet(set1);
        Set temporarySet2 = new HashSet(set2);
        temporarySet1.removeAll(set2);
        temporarySet2.removeAll(set1);
        set.addAll(temporarySet1);
        set.addAll(temporarySet2);
        return set;
    }
}