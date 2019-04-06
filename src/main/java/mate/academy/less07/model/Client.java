package mate.academy.less07.model;

import java.io.Serializable;

public class Client implements Serializable {

    private String name;
    private String phoneNumber;

    public Client(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
