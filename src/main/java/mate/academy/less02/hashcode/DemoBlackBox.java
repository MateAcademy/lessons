package mate.academy.less02.hashcode;

public class DemoBlackBox {
    public static void main(String[] args) {
        BlackBox object1 = new BlackBox(5, 10);
        BlackBox object2 = new BlackBox(5, 10);

        int hCodeObject1 = object1.hashCode();
        int hCodeObject2 = object2.hashCode();

        System.out.println("hCodeObject1 = " + hCodeObject1);
        System.out.println("hCodeObject2 = " + hCodeObject2);
        System.out.println(object1.equals(object2));

    }
}
