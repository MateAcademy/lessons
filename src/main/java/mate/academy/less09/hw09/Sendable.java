package mate.academy.less09.hw09;

public interface Sendable<T>{
    String getFrom();

    String getTo();

    T getContent();
}