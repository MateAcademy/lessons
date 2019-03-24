package mate.academy.less02.clone;

public class Human implements Cloneable {

    String name;
    int age;
    Car car;

    public Human(String name, int age, Car car) {
        this.name = name;
        this.age = age;
        this.car = car;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", car=" + car +
                '}';
    }

    @Override
    protected Human clone() throws CloneNotSupportedException {
        return (Human)super.clone();
    }

    void testClone() throws CloneNotSupportedException {
        Human h = (Human) this.clone();
        System.out.println(this.clone()); //это ссылка на обьект который вызвал метод mate.academy.less02.clone
    }
}
