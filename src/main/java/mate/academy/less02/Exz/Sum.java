package mate.academy.less02.Exz;

public class Sum {
    public static void main(String[] args) {
//        byte x = 100;
//        byte y = 100;
//
//        int i = x + y;
//        System.out.println(i);

        Integer a = new Integer(5);
        Integer b = new Integer(5);
        System.out.println(a<b);
        System.out.println(a>b);
        System.out.println(a==b);

        System.out.println();

        String a1 = "hi";
        String a2 = new String("hi");
        System.out.println(a1==a2);
        System.out.println(a1.equals(a2));

        StringBuilder hi = new StringBuilder();
        hi.append("Привет, мир");
        hi.append("!!!!!");
        hi.append("Как твои ддела");
        System.out.println(hi.toString());


    }
}
