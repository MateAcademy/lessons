package mate.academy.less06.tasks;

public class Go extends A{
    public static void main(String[] args) {
        new Go().start();
    }

    private void start() {
        check(new A(), new Go());
        check((Go)new A(), new Go());

    }

    private void check(A a, A a1) {
        Go go = (Go) a;
        A a2 = (A)a1;

    }
}
