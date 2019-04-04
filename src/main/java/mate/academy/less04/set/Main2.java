package mate.academy.less04.set;

import java.util.Set;
import java.util.TreeSet;

public class Main2 {
    public static void main(String[] args) {
        Human man = new Human(35);
        Human wooman = new Human(20);

        Set<Human> s = new TreeSet<Human>();
        s.add(man);
        s.add(wooman);

        System.out.println(s);
    }
}

class Human implements Comparable<Human> {
    private int age;

    public Human(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                '}';
    }

    @Override
    public int compareTo(Human o) {
        return this.age - o.age ;
    }
}