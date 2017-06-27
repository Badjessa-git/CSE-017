
/**
 * @author Romeo
 * @version 2017.20.02
 */
public class EventFinderTest extends student.TestCase {
    private EventFinder b;
    private HistoricEvent[] arr;
    private int strt;
    private int end;
    private HistoricEvent target;
    private HistoricEvent target1;
    private HistoricEvent target2;
    private HistoricEvent target3;

    /**
     * setting up variable
     */
    public void setUp() {
        arr = HistoricEvents.TIMELINE;
        target = new HistoricEvent(60, "Heron of Alexandria",
                "Heron of Alexandria invents machines which follow a series " 
                    + "of instructions");
        target1 = new HistoricEvent(40, "blah blah", "blah" + "blahc");
        target2 = new HistoricEvent(2010, "blah blah", "blah" + "blach");
        target3 = new HistoricEvent(1490, "blah blah", "blah" + "blach");
        strt = 0;
        end = arr.length - 1;
        b = new EventFinder();
    }

    /**
     * testing find with value inside
     */
    public void testFind() {
        assertEquals(0, b.find(target, arr, strt, end));
    }

    /**
     * testing value too low
     */
    public void testLowFind() {
        assertEquals(0, b.find(target1, arr, strt, end));
    }

    /**
     * testing value in between
     */
    public void testInFind() {
        assertEquals(2, b.find(target3, arr, strt, end));
    }

    /**
     * testing high find
     */
    public void testHighFind() {
        assertEquals(127, b.find(target2, arr, strt, end));
    }

    /**
     * testing second value
     */
    public void testFind2() {
        assertEquals(0, b.find(target, arr));
    }
}
