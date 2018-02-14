package cl.nisum.marsrover;

public class World {

    private int boundaryNorth = 1;
    private int boundaryWest = 1;
    private int boundarySouth;
    private int boundaryEast;

    public World(int boundarySouth, int boundaryEast) {
        this.boundarySouth = boundarySouth;
        this.boundaryEast = boundaryEast;
    }

    public int getBoundarySouth() {
        return boundarySouth;
    }

    public int getBoundaryEast() {
        return boundaryEast;
    }

    public boolean addRover(Rover rover) {
        boolean result = true;
        if (rover.getX() < boundaryNorth) {
            result = false;
        } else
        if(rover.getX() > boundarySouth){
            result = false;
        }else
        if (rover.getY() < boundaryWest) {
            result = false;
        }else
        if(rover.getY() > boundaryEast){
            result = false;
        }
        return result;
    }
}
