package mate.academy.less06.рефлекшин;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class MainRobot {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, InstantiationException, InvocationTargetException {



        //        Robot robot = new Robot("t33", 15, 2000);
//        System.out.println(robot);
//
//
//
//        Class clazzRobot = robot.getClass();
//        System.out.println(clazzRobot);
//
////      Field fild = clazzRobot.getField("model");
//
//        //хотим получить значение поля
//        Field fild = clazzRobot.getDeclaredField("model");
//        fild.setAccessible(true);  //разрешаем доступ к приватным полям
//fild.set(robot, "t99");
//
//        System.out.println("\n" + robot);
//        System.out.println(fild);
//        System.out.println(fild.get(robot)); //мы получили доступ к приватным переменным нарушая всякую инкапсуляцию
//
//
//        Robot newRobot = (Robot) clazzRobot.newInstance();
//        System.out.println("\n" + newRobot);
//
//        Class clazzR = Robot.class;
//        System.out.println(clazzR);
//
//
//        Constructor constructors = clazzR.getDeclaredConstructors(parametrs);
//        constructors[1].newInstance("t66", 99, 56);
//        System.out.println(clazzR.toString());
}}
