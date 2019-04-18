package mate.academy.hw10.robot;

public class Robot implements RobotConnection{
    int x;
    int y;
    Direction dir;
    boolean isthrowMove;
    boolean isthrowClose;
    boolean isthrowException;


    public void close(){
        if (isthrowClose) {
            throw new RobotConnectionException("CLOSE EXCEPTION");
        }
    }

    public Robot (int x, int y, Direction dir, boolean itm, boolean itc, boolean ite) {
        this.x = x;
        this.y = y;
        this.dir = dir;
        isthrowMove = itm;
        isthrowClose = itc;
        isthrowException = ite;
    }

    public Direction getDirection() {return dir;}

    public int getX() {return x;}

    public int getY() {return y;}

    public void turnLeft() {
        if      (dir == Direction.UP)    {dir = Direction.LEFT;}
        else if (dir == Direction.DOWN)  {dir = Direction.RIGHT;}
        else if (dir == Direction.LEFT)  {dir = Direction.DOWN;}
        else if (dir == Direction.RIGHT) {dir = Direction.UP;}
    }

    public void turnRight() {
        if      (dir == Direction.UP)    {dir = Direction.RIGHT;}
        else if (dir == Direction.DOWN)  {dir = Direction.LEFT;}
        else if (dir == Direction.LEFT)  {dir = Direction.UP;}
        else if (dir == Direction.RIGHT) {dir = Direction.DOWN;}
    }

    public void stepForward() {
        if (dir == Direction.UP)    {y++;}
        if (dir == Direction.DOWN)  {y--;}
        if (dir == Direction.LEFT)  {x--;}
        if (dir == Direction.RIGHT) {x++;}
    }

    public void moveRobotTo(int toX, int toY) {
        int dx = toX - getX();
        int dy = toY - getY();

        Direction needX = Direction.RIGHT;
        if (dx < 0){
            needX = Direction.LEFT;
        }
        while (getDirection() != needX) {
            turnRight();
        }

        for (dx = Math.abs(dx);dx > 0; dx--){
            stepForward();
        }

        Direction needY = Direction.UP;
        if (dy < 0){
            needY = Direction.DOWN;
        }
        while (getDirection() != needY) {
            turnRight();
        }

        for (dy = Math.abs(dy); dy > 0; dy--){
            stepForward();
        }

        if (isthrowException){
            throw new NullPointerException("ANOTHER EXCEPTION");
        }

        if (isthrowMove) {
            throw new RobotConnectionException("MOVE EXCEPTION");
        }
    }
}
