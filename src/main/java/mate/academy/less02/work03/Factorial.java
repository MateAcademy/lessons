package mate.academy.less02.work03;

public class Factorial {
    public static void main(String[] args) {

        System.out.println(factorial(1));
    }

    static int factorial(int x) {
        if (x == 1 || x == 0) {
            return 1;
        }

        return factorial(x-1)*x;
    }
}
