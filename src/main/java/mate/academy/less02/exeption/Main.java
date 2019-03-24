package mate.academy.less02.exeption;

public class Main{
    public static void main(String[] args) {

        try {
            System.out.println("!!!!");
            throw new IllegalArgumentException();

        }
            catch (IllegalArgumentException e) {
                    e.printStackTrace();
                }
            finally {
            System.out.println("Выведем сообщение");
        }

    }
}
