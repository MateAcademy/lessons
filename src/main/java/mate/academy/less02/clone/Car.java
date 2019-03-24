package mate.academy.less02.clone;

public class Car {
    String number;

    public Car(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Car{" +
                "number='" + number + '\'' +
                '}';
    }
}
