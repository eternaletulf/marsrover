package cl.nisum.marsrover;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class RoverTest {

    @Test
    public void newRoverShouldHaveCoordinatesAndOrientation() {
        Rover rover = new Rover(6,3,'N');

        assertThat(rover.getX(), is(6));
        assertThat(rover.getY(), is(3));
        assertThat(rover.getOrientation(), is('N'));
    }


}

