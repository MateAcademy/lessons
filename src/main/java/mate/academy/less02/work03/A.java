package mate.academy.less02.work03;

public class A {
    public static void main(String[] args) {
        short a = 22;
        int b = 100000;  //10000
        a = (short) b;
        System.out.println(a);
        b = a;
    }
}
