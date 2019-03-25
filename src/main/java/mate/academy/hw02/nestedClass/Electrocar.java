package mate.academy.hw02.nestedClass;

public class Electrocar {
    private int id;
    private static int test;

    //вложенный нестатический класс
    private class Motor {
        private void startMotor() {
            System.out.println("Motor " + id + " is starting..." + test);
        }
    }

    //статический вложенный класс
    public static class Battery {
        public void charde() {
            System.out.println("Battery is charging..." + test);
        }
    }



    public Electrocar(int id) {
        this.id = id;
    }
    public void start() {
        Motor motor = new Motor();
        motor.startMotor();
        final int power = 1;

        class SomeClass {
            public void someMethod() {
                System.out.println(power);
                System.out.println(id);
            }
        }
        SomeClass someObject = new SomeClass();
        test(someObject);
        System.out.println("Electrocar " + id + " is starting...");
    }

    private void test(Object object) {

    }
}
