import java.util.EmptyStackException;

import student.TestCase;

//-------------------------------------------------------------------------
/**
 * Tests for the {@link LinkedStack} class.
 *
 * @author Badjessa Bahoumda
 * @version 2017.4.4
 */
public class LinkedStackTest extends TestCase {
    // ~ Fields ................................................................

    private LinkedStack<String> stack;

    // ~ Public methods ........................................................

    // ----------------------------------------------------------
    /**
     * Creates a brand new, empty stack for each test method.
     */
    public void setUp() {
        stack = new LinkedStack<String>();
    }

    /**
     * test method {@link LinkedStack#push(Object)}
     */
    public void testPush() {
        assertTrue(stack.isEmpty());
        stack.push("Hello");
        assertFalse(stack.isEmpty());
        stack.push("b1");
        assertEquals("b1", stack.peek());
    }

    /**
     * test method {@link LinkedStack#pop()}
     */
    public void testpop() {
        assertTrue(stack.isEmpty());
        stack.push("Hello");
        stack.push("b1");
        stack.push("b2");
        assertFalse(stack.isEmpty());
        stack.pop();
        assertEquals("b1", stack.peek());
        stack.pop();
        assertEquals("Hello", stack.peek());
        stack.pop();
        assertTrue(stack.isEmpty());
        Exception thrown = null;
        try {
            stack.pop();
        } 
        catch (Exception e) {
            thrown = e;
        }
        assertTrue(thrown instanceof EmptyStackException);
        Exception thrown2 = null;
        try {
            stack.peek();
        } 
        catch (Exception e) {
            thrown2 = e;
        }
        assertTrue(thrown2 instanceof EmptyStackException);
    }

}
