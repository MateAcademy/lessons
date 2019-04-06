package mate.academy.less06.серриализация.hw06;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        Animal[] animals = new Animal[2];
        animals[0] = new Animal("Cat");
        animals[1] = new Animal("Dog");

        byte[] byteArrayAnimals = null;

        try (ByteArrayOutputStream outputArray = new ByteArrayOutputStream();
             ObjectOutputStream oos = new ObjectOutputStream(outputArray)) {
            oos.writeInt(animals.length);
            for (int i = 0; i < animals.length; i++) {
                oos.writeObject(animals[i]);
            }
            oos.flush();
            byteArrayAnimals = outputArray.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(Arrays.toString(animals));
        Animal[] deserializeAnimal = deserializeAnimalArray(byteArrayAnimals);
        System.out.println(Arrays.toString(deserializeAnimal));



    }

    public static Animal[] deserializeAnimalArray(byte[] data) {
        try (ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(data))) {
            int size = ois.readInt();
            Animal[] deserializeAnimal = new Animal[size];

            for (int i = 0; i < size; i++) {
                deserializeAnimal[i] = (Animal) ois.readObject();
            }
            return deserializeAnimal;
        } catch (ClassCastException | IOException | ClassNotFoundException e) {
            throw new IllegalArgumentException();
        }
    }
}
