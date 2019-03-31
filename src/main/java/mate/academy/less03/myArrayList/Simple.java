package mate.academy.less03.myArrayList;

public interface Simple<E> extends Iterable<E> {
    boolean add(E e);
    void delete(int index0);
    E get(int index);
    int size();
    void update(int index, E e);
}
