package mate.academy.less02.bufferedReader.tryWithResource;

public class Main {
    public static void main(String[] args) {

        try (DbConnector dbConnector = new DbConnector()){
            System.out.println("Тест работает!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
