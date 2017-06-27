import student.TestCase;

//-------------------------------------------------------------------------
/**
 * Test cases for the HourlyEmployee class.
 *
 * @author Romeo Bahoumda
 * @version 2017.02.10
 */
public class HourlyEmployeeTest extends TestCase {
    // ~ Instance/static fields ...............................................
    private HourlyEmployee emp1;
    private HourlyEmployee emp2;

    /**
     * Sets up the test fixture. Called before every test case method.
     */
    public void setUp() {
        emp1 = new HourlyEmployee("Dory", 7);
        emp2 = new HourlyEmployee("Nemo", 3.5);
    }

    /**
     * test weekly pay
     */
    public void testWeeklyPay() {
        assertEquals(280.0, emp1.weeklyPay(), 0.01);
    }

    /**
     * test meetWith
     */
    public void testMeetWith() {
        assertEquals("Dory is meeting with Nemo", emp1.meetWith(emp2));
    }

}
