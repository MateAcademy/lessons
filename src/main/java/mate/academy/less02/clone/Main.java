package mate.academy.less02.clone;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Car car = new Car("777");
        Human pavlo = new Human("Pavlo", 45, car);
        pavlo.testClone();


    }
}
