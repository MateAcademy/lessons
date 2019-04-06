package mate.academy.less06.исключения;

public class Robot {

    boolean energyOff = true;

    void workHard() throws NoEnergyException {
        System.out.println("Работаю на заводе вместо людей");
        if (energyOff = true) {
            System.out.println("Получили исключение");
            new NoEnergyException().printStackTrace();
            throw new NoEnergyException();
        }
    }
}
