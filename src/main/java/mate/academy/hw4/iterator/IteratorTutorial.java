package mate.academy.hw4.iterator;

import java.util.Iterator;

public class IteratorTutorial {
}


//итератор это паттерн для обхода какогото множества
class SimpleIterator implements Iterator {

    private Object[] objects;
    private int index = 0;

    public SimpleIterator(Object[] objects) {
        this.objects = objects;
    }


    @Override                       //проверяет есть ли что еще возвращать
    public boolean hasNext() {
        return index < objects.length;
    }

    @Override
    public Object next() {        //будет каждый раз возвращать какой-то из элементов этого множества
        return objects[index++];
    }

    public static void main(String[] args) {
        Integer arr[] = new Integer[3];
        arr[0] = 5;
        arr[1] = 55;
        arr[2] = 555;
        SimpleIterator s= new SimpleIterator(arr);

        while (s.hasNext()) {
            System.out.println(s.next());
        }
    }

}