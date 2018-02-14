package cl.nisum.marsrover;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class WorldTest {

    @Test
    public void newWorldShouldHaveWorldSize() {
        World world = new World(10, 10);

        assertThat(world.getBoundarySouth(), is(10));
        assertThat(world.getBoundaryEast(), is(10));

    }

    @Test
    public void aWorldShouldBeAbleToReceiveARover() {
        World world = new World(10, 10);

        Rover rover = new Rover(4, 4, 'N');

        boolean result = world.addRover(rover);

        assertTrue(result);
    }

    @Test
    public void aWorldShouldRejectRoverIfOutOfBoundsSouth() {
        World world = new World(10, 10);

        Rover rover = new Rover(11, 4, 'N');

        boolean result = world.addRover(rover);

        assertFalse(result);
    }

    @Test
    public void aWorldShouldRejectRoverIfOutOfBoundsEast() {
        World world = new World(10, 10);

        Rover rover = new Rover(4, 11, 'N');

        boolean result = world.addRover(rover);

        assertFalse(result);
    }

    @Test
    public void aWorldShouldRejectRoverIfOutOfBoundsNorth() {
        World world = new World(15,12);

        Rover rover = new Rover(-5, 10, 'W');

        boolean result = world.addRover(rover);

        assertFalse(result);
    }

    @Test
    public void aWorldShouldRejectRoverIfOutOfBoundsWest() {
        World world = new World(15,12);

        Rover rover = new Rover(8, -6, 'W');

        boolean result = world.addRover(rover);

        assertFalse(result);
    }
}
