package mate.academy.less06.рефлекшин;

import java.lang.reflect.Field;

public class MainRobot {
    public static void main(String[] args) throws NoSuchFieldException {
        Robot robot = new Robot("t33", 15, 2000);
        Class clazzRobot = robot.getClass();
        System.out.println(clazzRobot);

        //хотим получить значение поля
        Field fild = clazzRobot.getField("model");
        Field fild2 = clazzRobot.getDeclaredField("model");
        System.out.println(fild2);

}}
