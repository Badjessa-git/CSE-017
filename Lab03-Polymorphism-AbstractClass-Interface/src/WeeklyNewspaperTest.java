import student.TestCase;

// -------------------------------------------------------------------------
/**
 * Write a one-sentence summary of your class here. Follow it with additional
 * details about its purpose, what abstraction it represents, and how to use it.
 *
 * @author Romeo Bahoumda
 * @version 2017.02.12
 */
public class WeeklyNewspaperTest
    extends TestCase
{
    // ----------------------------------------------------------

    // ~ Fields ................................................................
    private WeeklyNewspaper nsp1;
    private WeeklyNewspaper nsp2;
    // initialize in your setUp method.

    // ~ Methods ...............................................................
    /**
     * Create a new WeeklyNewspaperTest object.
     */
    public WeeklyNewspaperTest()
    {
        // Empty
    }


    // ----------------------------------------------------------
    /**
     * Sets up the test fixture. Called before every test case method.
     */
    public void setUp()
    {
        nsp1 = new WeeklyNewspaper(1234, "Village Voice", 40, 5.0);
        nsp2 = new WeeklyNewspaper(1234, "Village Goice", 40, 5.0);
    }
    
    /**
     * testing monthly cost
     */
    public void testMonthlyCost() {
        assertEquals(800, nsp1.monthlyCost(), 0.01);
    }
    
    /**
     * testing bundlewith
     */
    public void testBundledWith() {
        assertEquals("Village Goice subscription" +
            " is bundled with Village Voice.", nsp1.bundledWith(nsp2));
    }

}
