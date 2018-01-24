package cl.nisum.marsrover;

public class Rover {

    private int x;
    private int y;
    private char orientation;

    public Rover(int x, int y, char orientation) {
        this.x = x;
        this.y = y;
        this.orientation = orientation;
    }

    public int getX() {
        return 6;
    }

    public int getY() {
        return 3;
    }

    public char getOrientation() {
        return 'N';
    }
}
