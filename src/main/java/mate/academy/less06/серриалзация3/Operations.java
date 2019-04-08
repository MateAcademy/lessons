package mate.academy.less06.серриалзация3;

import java.io.*;

public class Operations {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        DataObject obj = new DataObject();

        NonSerializable nonSerializable = new NonSerializable();
        nonSerializable.setMyData("Hello World");

        File file = new File("store.bin");
        FileOutputStream fo = new FileOutputStream(file);
        ObjectOutputStream so = new ObjectOutputStream(fo);
        so.writeObject(obj);
        so.flush();
        so.close();



        FileInputStream fi = new FileInputStream(file);
        ObjectInputStream si = new ObjectInputStream(fi);
        DataObject objNew = (DataObject)si.readObject();
        si.close();

        System.out.println(obj);
        System.out.println(objNew);

        System.out.println(obj.equals(objNew));


    }
}
