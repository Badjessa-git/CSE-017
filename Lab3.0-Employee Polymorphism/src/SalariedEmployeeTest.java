import student.TestCase;

//-------------------------------------------------------------------------
/**
 * Test cases for the SalariedEmployee class.
 *
 * @author Romeo Bahoumda
 * @version 2017.2.10
 */
public class SalariedEmployeeTest extends TestCase {
    // ~ Instance/static fields ...............................................
    private SalariedEmployee emp1;
    private SalariedEmployee emp2;
    // ~ Methods ...............................................................

    // ----------------------------------------------------------
    /**
     * Sets up the test fixture. Called before every test case method.
     */
    public void setUp() {
        emp1 = new SalariedEmployee("Moana", 4.5);
        emp2 = new SalariedEmployee("Romeo", 5.0);
    }

    /**
     * test getName
     */
    public void testgetName() {
        assertEquals("Moana", emp1.getName());
    }

    /**
     * test getPayRate
     */
    public void testgetPayRate() {
        assertEquals(4.5, emp1.getPayRate(), 0.01);
    }

    /**
     * test WeeklyPay
     */
    public void testWeeklyPay() {
        assertEquals(4.5, emp1.weeklyPay(), 0.01);
    }

    /**
     * test overloaded meetwith
     */
    public void testMeetWith() {
        assertEquals("Romeo is joining Moana in a conference", 
                 emp1.meetWith(emp2));
    }

}
