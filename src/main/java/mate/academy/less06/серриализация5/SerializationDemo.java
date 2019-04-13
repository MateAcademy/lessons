package mate.academy.less06.серриализация5;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;

/**
 * Created by vitaly on 03/10/16.
 */
public class SerializationDemo {
    public static void main(String[] args) throws Exception {
        Client originalClient = new Client();
        originalClient.setID(1);
        originalClient.setName("Chuck Norris");
        originalClient.setBirthDate(LocalDate.of(1940, 3, 10));

        Path path = Paths.get("object.bin");
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))) {
            oos.writeObject(originalClient);
        }

        Client deserializedClient;
        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))) {
            deserializedClient = (Client) ois.readObject();
        }

        System.out.printf("%-15s %-30s\n", "ID", deserializedClient.getID());
        System.out.printf("%-15s %-30s\n", "Name", deserializedClient.getName());
        System.out.printf("%-15s %-30s\n", "Date of Birth", deserializedClient.getBirthDate());
        System.out.printf("%-15s %-30s\n", "Age", deserializedClient.getAgeInYears());
    }}