package mate.academy.hw10.robot;

//За установку соединения отвечает RobotConnectionManager:
public interface RobotConnectionManager {
    RobotConnection getConnection();
}