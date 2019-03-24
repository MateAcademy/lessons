package mate.academy.less02.bufferedReader.tryWithResource;

public class DbConnector implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("Уххх, пытаюсь закрыть!");
    }

}
