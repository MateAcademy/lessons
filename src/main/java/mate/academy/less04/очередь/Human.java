package mate.academy.less04.очередь;

public class Human implements Comparable<Human>{
    private int age;

    public Human(int age) {
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                '}';
    }

    @Override
    public int compareTo(Human o) {
        return this.age - o.age;
    }
}
