package mate.academy.less06.рефлекшин;

public class Robot {

    private  String model;
    private static int year;
    private int version;

    public Robot() {}

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
                '}';
    }
}
