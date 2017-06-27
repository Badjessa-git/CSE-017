import student.TestCase;

// -------------------------------------------------------------------------
/**
 * Test cases for the Levenshtein distance algorithm.
 *
 * @author Romeo Bahoumda
 * @version 03/02/2017
 */
public class LevenshteinTests
    extends TestCase
{
    private Levenshtein lv1;
    private Levenshtein lv2;
    private Levenshtein lv3;
    private Levenshtein lv4;
    private Levenshtein lv5;
    // ~ Public methods ..................................................
    /**
     * @override
     */
    public void setUp() {
        lv1 = new Levenshtein("clap", "cram");
        lv2 = new Levenshtein("mitt", "");
        lv3 = new Levenshtein("", "cart");
        lv4 = new Levenshtein("", "");
        lv5 = new Levenshtein("clap", "clap");
    }
    
    /**
     * testing distance
     */
    public void testDistance() {
        assertEquals(2, lv1.distance());
    }
    /**
     * testing base 
     */
    public void testDistance2() {
        assertEquals(4, lv2.distance());
    }
    /**
     * testing base 
     */
    public void testDistance3() {
        assertEquals(4, lv3.distance());
    }
    /**
     * testing base 
     */
    public void testDistance4() {
        assertEquals(0, lv4.distance());
    }
    /**
     * testing base
     */
    public void testDistance5() {
        assertEquals(0, lv5.distance());
    }
    /**
     * testing long distance
     */
    public void testDistance6() {
        lv4 = new Levenshtein("The sentence is very long", 
                "The sentence is too long");
        assertEquals(4, lv4.distance());
    }
    
}