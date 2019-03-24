package mate.academy.less02.Exz;

public class PanseInt {
    public static void main(String[] args) {
        String a = "11";
        int b = Integer.parseInt(a);
        System.out.println(b);

        Integer io =100;
        Integer io2 =100;
        System.out.println(io == io2);

        Integer io3 =new Integer(100);
        Integer io4 =new Integer(100);
        System.out.println(io3 == io4);

        Integer io5 =128;
        Integer io6 =128;
        System.out.println(io5 == io6);
        System.out.println(5/0);

    }
}
