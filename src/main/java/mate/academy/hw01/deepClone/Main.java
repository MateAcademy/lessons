package mate.academy.hw01.deepClone;

import java.util.Objects;

public class Main {
    public static void main(String[] args) throws Exception {
        Animals myAnimals = new Animals();
        myAnimals.name = "Cat";
        Dog newObject = new Dog();
        newObject.age = 3;
        myAnimals.newObject = newObject;

        Animals myObject2 = myAnimals.clone();
        System.out.println("myObject2.name = " + myObject2.name);
        System.out.println("myObject2.age = " + myObject2.newObject.age);
        System.out.println(myAnimals.hashCode() == myObject2.hashCode());

        System.out.println(myAnimals.name);

        myObject2.newObject.age = 3;
        System.out.println("myObject2.age = " + myObject2.newObject.age);
        System.out.println("myAnimals.age = " + myAnimals.newObject.age + "\n");

        System.out.println(myAnimals != myObject2);
        System.out.println(myAnimals.getClass() == myObject2.getClass());
        System.out.println(myAnimals.equals(myObject2));

    }
}

class Animals implements Cloneable {
    String name;
    Dog newObject;

    @Override
    protected Animals clone() {
        Animals animals = null;
        try {
            animals = (Animals) super.clone();
            animals.newObject = newObject.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return animals;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return Objects.equals(name, animals.name) &&
                Objects.equals(newObject, animals.newObject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, newObject);
    }

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", newObject=" + newObject +
                '}';
    }
}

class Dog implements Cloneable {
    int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return age == dog.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age);
    }

    @Override
    protected Dog clone() throws CloneNotSupportedException {
        return (Dog) super.clone();
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                '}';
    }
}