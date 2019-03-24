package mate.academy.less02.Exz;

public class Exz2 {

    static final byte[] value = new byte[10];
    static  byte[] value2 = new byte[10];

    public static void main(String[] args) {
        byte[] value3  = new byte[10];
        value[0] = 3;
        value[0] = 6;

        System.out.println(value[0]);

        String s = "Hello";
        for (int i = 0; i < 100; i++) {
            s+=i;
            System.out.println(s);
        }


    }
}
