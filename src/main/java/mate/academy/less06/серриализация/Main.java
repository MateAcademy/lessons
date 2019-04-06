package mate.academy.less06.серриализация;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Robot r1 = new Robot("t34", 12, 1999);
        Robot r2 = new Robot("t35", 13, 2005);
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("objects.dat"));
        out.writeObject(r1);
        out.writeObject(r2);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("objects.dat"));
        Robot robot = (Robot)in.readObject();
        Robot robot2 = (Robot)in.readObject();
        System.out.println(robot);
        System.out.println(robot2);
      //  in.read();
        in.close();

    }
}
