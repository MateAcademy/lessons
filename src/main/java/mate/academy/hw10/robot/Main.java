package mate.academy.hw10.robot;

public class Main {

    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {

        boolean robotConnect = false;
        for (int i = 0; (i < 3) && (!robotConnect); i++) {
            try (RobotConnection robotConnection = robotConnectionManager.getConnection()) {
                robotConnection.moveRobotTo(toX, toY);
                robotConnect = true;
            } catch (RobotConnectionException e) {
                if (i == 2) {
                    throw new RobotConnectionException("Connection Error 3 times!");
                }
            }
            if (robotConnect) {
                break;
            }
        }



    }


    public static void main(String[] args) {
        try{
            RobotConnectionManagerImplementation rcm = new RobotConnectionManagerImplementation(3, 3, false, 1);
            moveRobot(rcm, 2, 2);
        } catch (Exception r){
            System.out.println("TEST #1 " + ((r.getMessage() == "MOVE EXCEPTION") ? "PASS" : "FAILED WITH " + r.getMessage()));
        }

        try{
            RobotConnectionManagerImplementation rcm = new RobotConnectionManagerImplementation(0, 0, false, 0);
            moveRobot(rcm, 2, 2);
            System.out.println("TEST #2 PASS");
        } catch (RobotConnectionException r){
            System.out.println("TEST #2 FAILED WITH " + r.getMessage());
        }

        try{
            RobotConnectionManagerImplementation rcm = new RobotConnectionManagerImplementation(2, 0, false, 0);
            moveRobot(rcm, 2, 2);
            System.out.println("TEST #3 PASS");
        } catch (Exception r){
            System.out.println("TEST #3 FAILED WITH " + r.getMessage());
        }

        try{
            RobotConnectionManagerImplementation rcm = new RobotConnectionManagerImplementation(3, 0, false, 0);
            moveRobot(rcm, 2, 2);
        } catch (Exception r){
            System.out.println("TEST #4 " + ((r.getMessage() == "MOVE EXCEPTION") ? "PASS" : "FAILED WITH " + r.getMessage()));
        }

        try{
            RobotConnectionManagerImplementation rcm = new RobotConnectionManagerImplementation(3, 0, true, 0);
            moveRobot(rcm, 2, 2);
        } catch (Exception r){
            System.out.println("TEST #5 " + ((r.getMessage() == "ANOTHER EXCEPTION") ? "PASS" : "FAILED WITH " + r.getMessage()));
        }

        try{
            RobotConnectionManagerImplementation rcm = new RobotConnectionManagerImplementation(2, 5, false, 0);
            moveRobot(rcm, 2, 2);
            System.out.println("TEST #6 PASS");
        } catch (Exception r){
            System.out.println("TEST #6 FAILED WITH " + r.getMessage());
        }

        try{
            RobotConnectionManagerImplementation rcm = new RobotConnectionManagerImplementation(0, 5, false, 2);
            moveRobot(rcm, 2, 2);
            System.out.println("TEST #7 PASS");
        } catch (Exception r){
            System.out.println("TEST #7 FAILED WITH " + r.getMessage());
        }

        try{
            RobotConnectionManagerImplementation rcm = new RobotConnectionManagerImplementation(1, 0, false, 2);
            moveRobot(rcm, 2, 2);
        } catch (Exception r){
            System.out.println("TEST #8 " + ((r.getMessage() == "MOVE EXCEPTION") ? "PASS" : "FAILED WITH " + r.getMessage()));
        }
    }

}
