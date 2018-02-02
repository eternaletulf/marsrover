package cl.nisum.marsrover;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class RoverTest {

    public static final char ANY_ORIENTATION = 'W';
    public static final char NORTH = 'N';
    public static final char SOUTH = 'S';
    public static final int ANY_X = 10;
    public static final int ANY_Y = 7;

    @Test
    public void newRoverShouldHaveCoordinatesAndOrientation() {
        Rover rover = new Rover(6, 3, NORTH);

        assertThat(rover.getX(), is(6));
        assertThat(rover.getY(), is(3));
        assertThat(rover.getOrientation(), is(NORTH));
    }

    @Test
    public void newRoverShouldHaveTheXandYValuesAs4And5AndOrientationShouldBeSouth() {
        Rover rover = new Rover(4, 5, SOUTH);

        assertThat(rover.getX(), is(4));
        assertThat(rover.getY(), is(5));
        assertThat(rover.getOrientation(), is(SOUTH));
    }

    @Test(expected = InvalidCoordinateException.class)
    public void shouldFailWhenXAxisNegative() {
        new Rover(-4, 5, ANY_ORIENTATION);
    }

    @Test(expected = InvalidCoordinateException.class)
    public void shouldFailWhenYAxisNegative() {
        new Rover(4, -5, ANY_ORIENTATION);
    }

    @Test(expected = InvalidCoordinateException.class)
    public void shouldFailWhenBothAxisAreNegative() {
        new Rover(-9, -8, ANY_ORIENTATION);
    }

    @Test(expected = InvalidCoordinateException.class)
    public void shouldFailWhenXAxisZero() {
        new Rover(0, 2, ANY_ORIENTATION);
    }

    @Test(expected = InvalidCoordinateException.class)
    public void shouldFailWhenYAxisZero() {
        new Rover(3, 0, ANY_ORIENTATION);
    }

    @Test(expected = InvalidCoordinateException.class)
    public void shouldFailWhenBothAxisAreZero() {
        new Rover(0, 0, ANY_ORIENTATION);
    }

    @Test(expected = InvalidOrientationException.class)
    public void shouldFailIfOrientationIsInvalidCharL() {
        new Rover(ANY_X, ANY_Y, 'L');
    }

    @Test(expected = InvalidOrientationException.class)
    public void shouldFailIfOrientationIsInvalidCharH() {
        new Rover(ANY_X, ANY_Y, 'H');
    }

    @Test
    public void whenFacingNTurnLeftShouldEndFacingW() {
        Rover rover = new Rover(ANY_X, ANY_Y, 'N');

        rover.left();

        assertThat(rover.getOrientation(), is('W'));
    }
}

