package cl.nisum.marsrover;

import java.util.Arrays;
import java.util.List;

public class Rover {

    private int x;
    private int y;
    private char orientation;
    private static final List<Character> CARDINAL_POINTS = Arrays.asList('N','S','E','W');

    public Rover(int x, int y, char orientation) {
        if (x <= 0) throw new InvalidCoordinateException();
        if (y <= 0) throw new InvalidCoordinateException();
        if (!CARDINAL_POINTS.contains(orientation)) throw new InvalidOrientationException();

        this.x = x;
        this.y = y;
        this.orientation = orientation;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public char getOrientation() {
        return orientation;
    }
}
