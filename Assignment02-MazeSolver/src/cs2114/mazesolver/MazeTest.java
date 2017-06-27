package cs2114.mazesolver;

import student.TestCase;

/**
 * 
 * @author Romeo
 *
 */
public class MazeTest extends TestCase {
    private Maze test;

    public void setUp() {
        test = new Maze(5);
    }

    /**
     * test method for {@link Maze#getStartLocation()}
     */
    public void testGetStartLocation() {
        assertEquals("(0, 0)", (test.getStartLocation()).toString());
    }

    /**
     * testing get cell
     */
    public void testGetCell() {
        Location l = new Location(0, 1);
        Location l1 = new Location(-1, -1);
        assertEquals(MazeCell.UNEXPLORED, test.getCell(l));
        assertEquals(MazeCell.INVALID_CELL, test.getCell(l1));
    }

    /**
     * test method for {@link Maze#setCell(ILocation, MazeCell)}
     */
    public void testSetCell() {
        Location t = new Location(1, 1);
        Location t2 = new Location(0, 0);
        Location t3 = new Location(-1, -1);
        Location t1 = new Location(4, 4);
        test.setCell(t, MazeCell.WALL);
        assertEquals(MazeCell.WALL, test.getCell(t));

        test.setStartLocation(t2);
        ;
        test.setCell(t2, MazeCell.WALL);
        assertEquals(MazeCell.UNEXPLORED, test.getCell(t2));

        test.setCell(t1, MazeCell.WALL);
        assertEquals(MazeCell.UNEXPLORED, test.getCell(t));

        test.setCell(t3, MazeCell.INVALID_CELL);
        assertEquals(MazeCell.INVALID_CELL, test.getCell(t));

    }

    /**
     * test method for {@link Maze#getStartLocation()}
     */
    public void testGetStartLocation1() {
        Location st = new Location(0, 0);
        Location st2 = new Location(1, 1);
        assertEquals(st, test.getStartLocation());
        test.setStartLocation(st2);
        assertEquals(st2, test.getStartLocation());
    }

    /**
     * test set goal location.
     */
    public void testSetGoalLocation() {
        Location t = new Location(4, 4);
        Location t1 = new Location(6, 6);
        test.setGoalLocation(t);
        assertEquals(t, test.getGoalLocation());

        test.setCell(t, MazeCell.WALL);
        test.setGoalLocation(t);
        assertEquals(t, test.getGoalLocation());
        assertEquals(MazeCell.UNEXPLORED, test.getCell(t));

        test.setGoalLocation(t1);
        assertEquals(t, test.getGoalLocation());
    }

    /**
     * testing for size
     */
    public void testSize() {
        assertEquals(5, test.size());
    }

    /**
     * test set start location.
     */
    public void testSetStartLocation() {
        Location t = new Location(2, 3);
        Location t1 = new Location(0, 0);
        Location t2 = new Location(6, 6);
        test.setStartLocation(t);
        assertEquals(t, test.getStartLocation());

        test.setCell(t2, MazeCell.WALL);
        test.setStartLocation(t2);
        assertEquals(t, test.getStartLocation());
        assertEquals(MazeCell.UNEXPLORED, test.getCell(t));

        test.setStartLocation(t1);
        assertEquals(t1, test.getStartLocation());
    }

    /**
     * test get goal location.
     */
    public void testGetGoalLocation() {
        Location t = new Location(4, 4);
        test.setGoalLocation(t);
        assertEquals(t, test.getGoalLocation());
    }

    /**
     * testing solve
     */
    public void testSolve() {
        String string = "";
        Maze test1 = new Maze(5);
        test1.setCell(new Location(0, 1), MazeCell.WALL);
        test1.setCell(new Location(2, 3), MazeCell.WALL);
        test1.setCell(new Location(2, 4), MazeCell.WALL);
        string = "(0, 0)(1, 0)(1, 1)(1, 2)(2, 2)(3, 2)(3, 3)(3, 4)(4, 4)";
        assertEquals(string, test1.solve());

        Maze test2 = new Maze(5);
        test2.setCell(new Location(0, 1), MazeCell.WALL);
        test2.setCell(new Location(1, 2), MazeCell.WALL);
        test2.setCell(new Location(2, 3), MazeCell.WALL);
        test2.setCell(new Location(3, 3), MazeCell.WALL);
        string = "(0, 0)(1, 0)(1, 1)(2, 1)(2, 2)(3, 2)(4, 2)(4, 3)(4, 4)";
        assertEquals(string, test2.solve());

        Maze test3 = new Maze(5);
        test3.setStartLocation(new Location(2, 2));
        test3.setGoalLocation(new Location(2, 3));
        string = "(2, 2)(2, 3)";
        assertEquals(string, test3.solve());
    }
}
