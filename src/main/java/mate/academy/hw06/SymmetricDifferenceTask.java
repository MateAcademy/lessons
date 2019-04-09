package mate.academy.hw06;

import java.util.HashSet;
import java.util.Set;

public class SymmetricDifferenceTask {
    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);

        set2.add(0);
        set2.add(1);
        set2.add(2);

        Set<Integer> symmetricDifference = symmetricDifference(set1, set2);
        System.out.println("Symmetric difference set:");
        System.out.println(symmetricDifference);

    }

    private static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set<T> symmetricDifference = new HashSet<>();
        Set<T> firstDifference = new HashSet<>(set1);
        firstDifference.removeAll(set2);
        set2.removeAll(set1);
        symmetricDifference.addAll(firstDifference);
        symmetricDifference.addAll(set2);
        return symmetricDifference;
    }
    
}
