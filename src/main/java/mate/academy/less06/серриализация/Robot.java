package mate.academy.less06.серриализация;

import java.io.Serializable;

public class Robot implements Serializable {

    private transient String model;
    private static int year;
    private int version;

    public Robot(String model, int version, int year) {
        this.model = model;
        this.version = version;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "model='" + model + '\'' +
                ", version=" + version +
                ", yaer=" + year +
                '}';
    }


}
