package mate.academy.hw09.task1;

public class Salary implements Sendable<Integer> {
    String firma;
    String name;
    int number;

    public Salary(String firma, String name, int number) {
        this.firma = firma;
        this.name = name;
        this.number = number;
    }
    @Override
    public String getFrom() {
        return firma;
    }

    @Override
    public String getTo() {
        return name;
    }

    @Override
    public Integer getContent() {
        return number;
    }
}
