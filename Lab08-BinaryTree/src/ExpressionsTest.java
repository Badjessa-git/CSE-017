import student.*;

/**
 * @author Romeo
 * @version 2017/4/18
 */
public class ExpressionsTest extends TestCase {
    private Expressions test;

    @Override
    public void setUp() {
        test = new Expressions();
    }

    /**
     * testing method
     */
    @SuppressWarnings("static-access")
    public void testMain() {
        test.main(null);
        assertTrue(systemOut().getHistory()
                .contains("(((a) (b) -) (((c) (d) +) (e) /) *)"));
        assertTrue(systemOut().getHistory()
                .contains("(* (- (a) (b)) (/ (+ (c) (d)) (e)))"));
        assertTrue(systemOut().getHistory()
                .contains("(((a) - (b)) * (((c) + (d)) / (e)))"));
    }
}
