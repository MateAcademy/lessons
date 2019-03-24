package mate.academy.less02.hashcode;

public class Main
{
    public static void main(String[] args) {
        Object object = new Object();
        Integer hCode;
        hCode = object.hashCode();
        System.out.println(hCode);
    }
}
