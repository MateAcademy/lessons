package mate.academy.less03.дженерики2;

public class Main {
    public static void main(String[] args) {
        Student3<Long, String> student3 = new Student3<>();
        student3.myThing = "веревка";
        student3.id = 22L;
        student3.phoneNumber = "911";

    }
}

class Bag { }

class Human {}

class GenHuman<T> extends Human {
        T myThing;
}

class Student extends GenHuman<Bag> {}
class Student2<T> extends GenHuman<T> {}
class Student3<T, K> extends GenHuman<K> {
    T id;
    K phoneNumber;
}
