import student.TestCase;

//-------------------------------------------------------------------------
/**
 * Tests for the {@link HistoricEvent} class.
 *
 * @author Romeo Bahoumda
 * @version 2017.02.20
 */
public class HistoricEventTest extends TestCase {
    // ~ Instance/static variables .............................................

    private HistoricEvent event;
    private HistoricEvent event1;
    private HistoricEvent event3;

    private static final String TITLE = "CS 2114 Lab";
    private static final String MESSAGE = "I went to lab today,"
            + " and I didn't even get a T-shirt.";

    // ~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Create a new test class
     */
    public HistoricEventTest() {
        // The constructor is usually empty in unit tests, since it runs
        // once for the whole class, not once for each test method.
        // Per-test initialization should be placed in setUp() instead.
    }

    // ~ Public methods ........................................................

    // ----------------------------------------------------------
    /**
     * Starting conditions for all tests in this class.
     */
    public void setUp() {
        event = new HistoricEvent(2010, TITLE, MESSAGE);
        event1 = new HistoricEvent(2010, "The other", "I do not know");
        event3 = event;
    }

    // ----------------------------------------------------------
    /**
     * Test the constructor and accessors.
     */
    public void testAccessors() {
        assertEquals(2010, event.getYear());
        assertEquals(TITLE, event.getTitle());
        assertEquals(MESSAGE, event.getDescription());
    }

    // ----------------------------------------------------------
    /**
     * Test toString() on the event created in setUp().
     */
    public void testToString() {
        assertEquals("[2010] " + TITLE + ": " + MESSAGE, event.toString());
    }

    // ----------------------------------------------------------
    /**
     * Test toString() on an event with a null title.
     */
    public void testToString2() {
        event = new HistoricEvent(2010, MESSAGE);
        assertEquals("[2010] " + MESSAGE, event.toString());
    }

    // ----------------------------------------------------------
    /**
     * Test toString() on an event with a null description.
     */
    public void testToString3() {
        event = new HistoricEvent(2010, TITLE, null);
        assertEquals("[2010] " + TITLE, event.toString());
    }

    /**
     * testing compareTo method
     */
    public void testCompareTo() {
        assertEquals(-17, event.compareTo(event1));
    }

    /**
     * testing compareTo2 string comparison
     */
    public void testCompareTo2() {
        event1 = new HistoricEvent(2010, "CS 214 LB and class", "blah");
        assertEquals(-3, event.compareTo(event1));

    }

    /**
     * second case: no difference
     */
    public void testCompareTo3() {
        assertEquals(0, event.compareTo(event3));
    }

    /**
     * third case: negative difference in years
     */
    public void testCompareTo4() {
        event1 = new HistoricEvent(2012, "blah", "blah");
        assertEquals(-2, event.compareTo(event1));
    }

    /**
     * fourth case: positive difference
     */
    public void testCompareTo5() {
        event1 = new HistoricEvent(2006, "blah", "blah");
        assertEquals(4, event.compareTo(event1));
    }
}
