package mate.academy.less04.свойArrayList;

public class Main {
    public static void main(String[] args) {
        Simple<String> s = new SimpleArray<>();
        s.add("1");
        s.add("2");
        s.add("3");


        s.delete(0);

        s.forEach(System.out::println);
//        System.out.println(s.get(0));
//        System.out.println(s.size());

    }
}
