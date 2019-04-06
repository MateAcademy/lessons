package mate.academy.less06;

/**
 * Пытаемся узнать кто вызвал метод:
 */
public class Main {
    public static void main(String[] args) {
        saySomething();
    }

    private static void saySomething() {
        saySomething3();
    }

    private static void saySomething3() {
        saySomething1();
    }

    private static void saySomething1() {
       StackTraceElement[] s = Thread.currentThread().getStackTrace();
        System.out.println("Hello");
    }
}
