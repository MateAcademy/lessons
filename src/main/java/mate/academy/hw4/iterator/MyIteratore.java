package mate.academy.hw4.iterator;

import java.util.Iterator;

public class MyIteratore<T> implements Iterator {
    private T[] objects;
    private int elem = 0;

    public MyIteratore(T[] objects) {
        this.objects = objects;
    }

    @Override
    public boolean hasNext() {
        return elem < objects.length;
    }

    @Override
    public T next() {
        return objects[elem++];
    }

    public static void main(String[] args) {
        Integer arr[] = new Integer[3];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;

        MyIteratore m = new MyIteratore(arr);
        while (m.hasNext()) {
            System.out.println(m.next());
        }

    }
}
