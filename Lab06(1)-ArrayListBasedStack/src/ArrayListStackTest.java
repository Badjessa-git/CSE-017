import student.TestCase;

//-------------------------------------------------------------------------
/**
 * Tests for the {@link ArrayListStack} class.
 *
 * @author Romeo Bahoumda
 * @version 2017/03/27
 */
public class ArrayListStackTest extends TestCase {
    // ~ Instance/static variables .............................................

    private ArrayListStack<String> stack;

    // ~ Public methods ........................................................

    // ----------------------------------------------------------
    /**
     * Creates a brand new, empty stack for each test method.
     */
    public void setUp() {
        stack = new ArrayListStack<String>();
    }

    /**
     * Test method for {@link ArrayListStack#push(Object)}
     */
    public void testPush() {
        stack.push("Hello");
        assertFalse(stack.isEmpty());
        assertEquals(1, stack.size());
    }

    /**
     * test method for {@link ArrayListStack#pop()}
     * 
     * @throws EmptyStackException
     */
    public void testPop() {
        Exception thrown = null;
        try {
            // Some action that is intended to produce an exception
            stack.size = 0;
            stack.pop();

        } 
        catch (Exception exception) {
            thrown = exception;
        }
        assertNotNull(thrown);
        assertTrue(thrown instanceof java.util.EmptyStackException);
        stack.push("Blah");
        stack.push("Hello");
        assertEquals(2, stack.size());
        stack.pop();
        assertEquals(1, stack.size());
    }

    /**
     * test method for {@link ArrayListStack#top()}
     * 
     * @throws EmptyStackException
     */
    public void testTop() {
        Exception thrown = null;
        try {
            stack.size = 0;
            stack.top();
        } 
        catch (Exception exception) {
            thrown = exception;
        }
        assertNotNull(thrown);
        assertTrue(thrown instanceof java.util.EmptyStackException);
        stack.push("Hello");
        stack.push("Romeo");
        assertEquals("Romeo", stack.top());
    }

    /**
     * test method for {@link ArrayListStack#isEmpty()}
     */
    public void testIsEmpty() {
        assertEquals(0, stack.size());
        assertTrue(stack.isEmpty());
        stack.push("Object");
        assertFalse(stack.isEmpty());

    }

    /**
     * test method for {@link ArrayListStack#size()}
     */
    public void testSize() {
        assertEquals(0, stack.size());
        stack.push("Hello");
        assertEquals(1, stack.size());
    }

}
