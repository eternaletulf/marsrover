package cl.nisum.marsrover;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class RoverTest {

    public static final char NOT_USE_ORIENTATION = 'W';
    public static final char NORTH = 'N';
    public static final char SOUTH = 'S';

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
        new Rover(-4, 5, NOT_USE_ORIENTATION);
    }

    @Test(expected = InvalidCoordinateException.class)
    public void shouldFailWhenYAxisNegative() {
        new Rover(4, -5, NOT_USE_ORIENTATION);
    }

    @Test(expected = InvalidCoordinateException.class)
    public void shouldFailWhenBothAxisAreNegative() {
        new Rover(-9, -8, NOT_USE_ORIENTATION);
    }

    @Test(expected = InvalidCoordinateException.class)
    public void shouldFailWhenXAxisZero() {
        new Rover(0, 2, NOT_USE_ORIENTATION);
    }

    @Test(expected = InvalidCoordinateException.class)
    public void shouldFailWhenYAxisZero() {
        new Rover(3, 0, NOT_USE_ORIENTATION);
    }

    @Test(expected = InvalidCoordinateException.class)
    public void shouldFailWhenBothAxisAreZero() {
        new Rover(0, 0, NOT_USE_ORIENTATION);
    }

    @Test(expected = InvalidOrientationException.class)
    public void shouldFailIfOrientationIsInvalidCharL() {
        new Rover(10, 7, 'L');
    }

    @Test(expected = InvalidOrientationException.class)
    public void shouldFailIfOrientationIsInvalidCharH() {
        new Rover(9, 7, 'H');
    }

}

