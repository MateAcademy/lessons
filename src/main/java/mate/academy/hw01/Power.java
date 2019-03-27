package mate.academy.hw01;

public class Power {
    public static void main(String[] args) {
        Power power = new Power();
        Integer number = 6;
        Integer power2 = 2;
        Integer power3 = 3;

        System.out.println(power.getPower(number, power2));
        System.out.println(power.getPower(number, power3));

    }

    private Integer getPower(Integer number, Integer power) {
        Integer result = 1;
        for (int i = 1; i <= power; i++) {
            result = result * number;
        }
        return result;
    }
}
