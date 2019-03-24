package mate.academy.less02.taskInteresting;

public class Test {
    public static void main(String[] args) {
        while (true) {
            System.out.println("we are in(while(true))");
            try (Resources resources = new Resources()) {
                System.out.println("We are in try block");
                if (true) {
                    System.out.println("We are in the if(true) now! Next step is break");
                    break;
                }
                System.out.println("Hm?");
                resources.writeSomething();
            } catch (Exception c) {
                System.out.println("Catched mate.academy.less02.exeption");
            }
        }
    }
}
