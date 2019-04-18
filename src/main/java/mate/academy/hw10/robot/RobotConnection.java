package mate.academy.hw10.robot;

//Подключение к роботу представляется в программе интерфейсом RobotConnection:
public interface RobotConnection extends  AutoCloseable {
    void moveRobotTo(int x, int y);
    @Override
    void close();
}