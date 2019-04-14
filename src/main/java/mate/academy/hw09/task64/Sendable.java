package mate.academy.hw09.task64;

public interface Sendable<T>{
    String getFrom();

    String getTo();

    T getContent();
}