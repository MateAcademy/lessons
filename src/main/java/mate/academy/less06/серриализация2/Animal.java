package mate.academy.less06.серриализация2;

import java.io.Serializable;

public class Animal implements Serializable {
    private String name;
    private int year;

    public Animal(String name, int year) {
        this.name = name;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }

}
