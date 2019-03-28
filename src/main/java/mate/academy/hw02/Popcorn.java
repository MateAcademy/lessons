package mate.academy.hw02;

public class Popcorn {
    void doSomthing() {
        System.out.println("popcorn");
    }
    void friedPopcorn() {
        System.out.println("second");
    }
}

class Main {
    private int id;
    public static void main(String[] args) {

        Popcorn popcorn = new Popcorn(){
            @Override
            void doSomthing() {
                System.out.println("This is anonimniy class");
            }

            @Override
            void friedPopcorn() {
                System.out.println("I like fried popcorn");
            }
        };
        popcorn.doSomthing();
        popcorn.friedPopcorn();
    }


    private void doSomthing() {
        class Book {
            public void reed() {
                System.out.println("This is lokal class");
            }
        }

    }

    private class Coppybook {
        private void write() {
            System.out.println("This is inner class " + id);
        }
    }

}
