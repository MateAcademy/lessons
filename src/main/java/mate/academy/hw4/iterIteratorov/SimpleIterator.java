package mate.academy.hw4.iterIteratorov;

import java.util.Iterator;

class IteratorOfIterators<I extends Number, T extends Iterator<I>> implements Iterator{
    private final T[] iterators;
    private int index = 0;

    public IteratorOfIterators(T[] iterators) {
        this.iterators = iterators;
    }

    @Override
    public boolean hasNext() {
        return iterators[index].hasNext() || !detectedLastIterator();
    }

    private boolean detectedLastIterator() {
        return !(index + 1 < iterators.length);
    }

    @Override
    public I next() {
        if (iterators[index].hasNext()) {
            return iterators[index].next();
        } else {
            return iterators[++index].next();
        }

    }
}


public class SimpleIterator<T extends Number> implements Iterator {
    private final T[] values;
    private int index = 0;

    public SimpleIterator(final T[] values) {
        this.values = values;
    }


    @Override                       //проверяет есть ли что еще возвращать
    public boolean hasNext() {
        return index < values.length;
    }

    @Override
    public T next() {        //будет каждый раз возвращать какой-то из элементов этого множества
        return values[index++];
    }
}

class Client4 {
    public static void main(String[] args) {
        SimpleIterator<Integer> i1 = new SimpleIterator<>(new Integer[]{1,2,3});
        SimpleIterator<Integer> i2 = new SimpleIterator<>(new Integer[]{1,2,3,4});

        IteratorOfIterators<Integer, Iterator<Integer>> iT = new IteratorOfIterators<>(new SimpleIterator[]{i1, i2});
        while (iT.hasNext()) {
            Integer i =iT.next();
            System.out.println(i);
        }
    }
}