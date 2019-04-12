package mate.academy.less06.tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

class K {
    public static void main(String[] args) {
       StringBuilder str = new StringBuilder();
        System.out.println(str.capacity());
        str.append("Hello"
);
        System.out.println(str.capacity());
        str.ensureCapacity(20);
        System.out.println(str.capacity());
     //   ArrayList<List> list = new ArrayList<ArrayList>();


        BiConsumer<Integer, Integer> consumer = new BiConsumer<Integer, Integer>() {
            @Override
            public void accept(Integer a, Integer b) {
                System.out.println(a + b);
            }
        };



    }
}
