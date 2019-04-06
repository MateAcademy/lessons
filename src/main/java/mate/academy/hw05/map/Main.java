package mate.academy.hw05.map;

public class Main {
    public static void main(String[] args) {
        MyHashMap<String,String> strings = new MyHashMap<>();
        strings.insert("a", "b");
        System.out.println(strings.get("a"));
        strings.insert("a", "c");
        System.out.println(strings.get("a"));
        System.out.println(strings.size());

    }
}
