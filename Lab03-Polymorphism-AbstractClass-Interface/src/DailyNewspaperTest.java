import student.TestCase;

// -------------------------------------------------------------------------
/**
 * Write a one-sentence summary of your class here. Follow it with additional
 * details about its purpose, what abstraction it represents, and how to use it.
 *
 * @author Romeo Bahoumda
 * @version 2017.02.11
 */
public class DailyNewspaperTest
    extends TestCase
{
    // ----------------------------------------------------------

    // ~ Fields ................................................................

    private DailyNewspaper np1;
    private DailyNewspaper np2;

    // ~ Methods ...............................................................
    /**
     * Create a new DailyNewspaperTest object.
     */
    public DailyNewspaperTest()
    {
        // Empty
    }


    // ----------------------------------------------------------
    /**
     * Sets up the test fixture. Called before every test case method.
     */
    public void setUp()
    {
        np1 = new DailyNewspaper(1234, "Village Voice", 40, 5.0);
        np2 = new DailyNewspaper(1234, "Village Coice", 40, 5.0);

    }
    
    /**
     * testing the monthly Cost
     */
    public void testMonthlyCost() {
        assertEquals(6000.0, np1.monthlyCost(), 0.01);
    }
    
    /**
     * test getId
     */
    public void testGetIdNumber() {
        assertEquals(1234, np1.getIdNumber());
    }
    
    /**
     * testing gettitle
     */
    public void testGetTitle() {
        assertEquals("Village Voice", np1.getTitle());
    }
    /**
     * testing bundle with
     */
    public void testBundledWith() {
        assertEquals("Village Voice and Village "
            + "Coice subscriptions are bundled.",
                np1.bundledWith(np2));
    }
}
