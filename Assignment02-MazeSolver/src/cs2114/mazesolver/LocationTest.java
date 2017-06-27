package cs2114.mazesolver;

import student.TestCase;

/**
 * @author Romeo
 * @version 2017/30/3 test for class {@link Location}
 */
public class LocationTest extends TestCase {
    private Location test;

    @Override
    public void setUp() {
        test = new Location(0, 0);
    }

    /**
     * test method for {@link Location#x()}
     */
    public void testX() {
        assertEquals(0, test.x());
    }

    /**
     * test method for {@link Location#y()}
     */
    public void testY() {
        assertEquals(0, test.y());
    }

    /**
     * test method for {@link Location#north()}
     */
    public void testNorth() {
        assertEquals("(0, -1)", (test.north()).toString());
    }

    /**
     * test method for {@link Location#south()}
     */
    public void testSouth() {
        assertEquals("(0, 1)", (test.south()).toString());
    }

    /**
     * test method for {@link Location#west()}
     */
    public void testWest() {
        assertEquals("(-1, 0)", (test.west()).toString());
    }

    /**
     * test method for {@link Location#east()}
     */
    public void testEast() {
        assertEquals("(1, 0)", (test.east()).toString());
    }

    /**
     * test method for {@link Location#equals(Object)}
     */
    public void testEquals() {
        Location test2;
        test2 = new Location(0, 0);
        assertTrue(test.equals(test2));
        assertFalse(test.equals(test2.north()));
    }
}
