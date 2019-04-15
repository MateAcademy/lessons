package mate.academy.hw09.task1;

public interface Sendable<T>{
    String getFrom();

    String getTo();

    T getContent();
}