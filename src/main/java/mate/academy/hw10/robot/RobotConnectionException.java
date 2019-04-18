package mate.academy.hw10.robot;

public class RobotConnectionException extends RuntimeException{

    public RobotConnectionException(String message) {
    super(message);
    }

    public RobotConnectionException(String message, Throwable cause) {
        super(message, cause);
    }
}
