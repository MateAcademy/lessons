package mate.academy.hw09;

public interface Sendable<T>{
    String getFrom();

    String getTo();

    T getContent();
}