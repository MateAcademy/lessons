package mate.academy.less02.collections.arrayListTutorial.iterator;

import java.util.Iterator;

public class IteratorTutorial {
}

class SimpleIterator<T> implements Iterator{

    private T[] objects;
    private int index = 0;

    SimpleIterator(T[] objects) {
        this.objects = objects;
    }

    //Этот метод проверяет, есть ли в коллекции следующий элемент. Если есть, то метод возвращает true, если нет – false.
    @Override
    public boolean hasNext() {
        return index<objects.length;
    }

    //Этот метод возвращает следующий элемент коллекции. Если элемент не обнаружен, то метод “бросает” NoSuchElementException.
    @Override
    public T next() {
        return objects[index++];
    }

    public static void main(String[] args) {
        Integer[] integers = new Integer[3];
        integers[0]  = 1;
        integers[1]  = 2;
        integers[2]  = 3;

        SimpleIterator<Integer> s = new SimpleIterator<>(integers);

        while (s.hasNext()) {
            Integer i  =  s.next();
            System.out.println(i);
        }
    }
}
