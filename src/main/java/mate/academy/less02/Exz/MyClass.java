package mate.academy.less02.Exz;

public class MyClass {
    public static void main(String[] args) {
        PrintChar obj = new PrintChar("Строка");
        for (Character ch : obj) {
            System.out.println(ch);
        }

        obj.forEach(ch-> System.out.println(ch));

        while (obj.hasNext()) {
            System.out.println(obj.next());
        }
    }
}
