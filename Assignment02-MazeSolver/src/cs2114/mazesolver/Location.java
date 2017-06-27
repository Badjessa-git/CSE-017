package cs2114.mazesolver;

/**
 * @author Romeo
 * @version 3/31/2017
 *
 *
 */
public class Location implements ILocation {
    private int x;
    private int y;

    @Override
    public int x() {
        return this.x;
    }

    @Override
    public int y() {
        return this.y;
    }

    /**
     * @param x
     * @param y
     */
    public Location(int x, int y) {
        this.x = x;
        this.y = y;

    }

    @Override
    public ILocation north() {
        return new Location(x, y - 1);

    }

    @Override
    public ILocation south() {
        return new Location(x, y + 1);
    }

    @Override
    public ILocation west() {
        return new Location(x - 1, y);
    }

    @Override
    public ILocation east() {
        return new Location(x + 1, y);
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Location) {
            if (this.x() == (((Location) o).x()) && this.y() == (((Location) o).y())) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }

    }

    @Override
    public String toString() {
        String Location;
        Location = "(" + this.x() + ", " + this.y() + ")";
        return Location;

    }

}
