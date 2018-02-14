package cl.nisum.marsrover;

import java.util.Arrays;
import java.util.List;

public class Rover {

    private int x;
    private int y;
    private char orientation;
    private static final List<Character> CARDINAL_POINTS = Arrays.asList('N', 'W', 'S', 'E');

    public Rover(int x, int y, char orientation) {
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

    public void left() {
        int current = CARDINAL_POINTS.indexOf(orientation);
        int next = (current + 1) % 4;
        orientation = CARDINAL_POINTS.get(next);
    }

    public void right() {
        int current = CARDINAL_POINTS.indexOf(orientation) + 4;
        int next = (current - 1) % 4;
        orientation = CARDINAL_POINTS.get(next);
    }
}
