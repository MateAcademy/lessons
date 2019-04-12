package mate.academy.less06.серриализация2;

import com.mateacademy.date.A;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Animal cat = new Animal("Cat", 3);
        Animal dog = new Animal("dog", 3);

        FileOutputStream fl = new FileOutputStream("animals.txt");
        ObjectOutputStream out = new ObjectOutputStream(fl); //мы в OutputStream будем записывать обьект

        out.writeObject(cat);
        out.writeObject(dog);
        out.close();

        FileInputStream fl2 = new FileInputStream("animals.txt");
        ObjectInputStream in = new ObjectInputStream(fl2);
        Animal a1= (Animal)in.readObject();
        Animal a2= (Animal)in.readObject();
        System.out.println(a1);
        System.out.println(a2);
        in.close();

    }
}
