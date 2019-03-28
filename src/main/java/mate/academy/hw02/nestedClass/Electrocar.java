package mate.academy.hw02.nestedClass;

public class Electrocar {
    private int id;
    private static int test;

    //nested non-static class
    private class Motor {
        private void startMotor() {
            System.out.println("Motor " + id + " is starting..." + test);
        }
    }

    //вложенный статический класс
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

        class Bmw {
            public void run() {
                System.out.println(power);
                System.out.println(id);
            }
        }
        Bmw someObject = new Bmw();
        test(someObject);
        System.out.println("Electrocar " + id + " is starting...");
    }

    private void test(Object object) {
    }
}
