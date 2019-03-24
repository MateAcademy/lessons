package mate.academy.less02.taskInteresting;

public class Resources implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("Уххх, пытаюсь закрыть!");
        throw new Exception("Exception after closed resources!");
    }

    void writeSomething() {
        System.out.println("we are in write somthing!");
    }

}
