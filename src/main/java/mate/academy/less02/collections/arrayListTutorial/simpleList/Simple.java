package mate.academy.less02.collections.arrayListTutorial.simpleList;

public interface  Simple<E> extends Iterable<E>{
    boolean add(E e);
    void delete(int index);
    E get(int index);
    int size();
    void update(int index, E e);
}
