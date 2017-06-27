import student.TestCase;

//-------------------------------------------------------------------------
/**
 * Tests for the {@link Node} class.
 *
 * @author Badjessa Bahoumda
 * @version 2017.4.4
 */
public class NodeTest extends TestCase {
    // ~ Fields ................................................................
    private Node<String> node1;
    private Node<String> node2;
    private Node<String> node3;
    private Node<String> node4;
    // ~ Public methods ........................................................

    // ----------------------------------------------------------
    /**
     * Create some new nodes for each test method.
     */
    public void setUp() {
        node1 = new Node<String>("node1");
        node2 = new Node<String>("node2");
        node3 = new Node<String>("node3");
        node4 = new Node<String>("node4");
    }

    /**
     * test method for {@link Node#join(Node)}
     */
    public void testJoin() {
        assertEquals(node1, node1.join(node2));
        assertEquals(node2, node2.join(node3));
        assertEquals(node1, node2.previous());
        assertEquals(node2, node1.next());
        assertEquals(node2, node2.join(null));
        assertEquals(node4, node4.join(node4));
        Exception thrown = null;
        try {
            node1.join(node3);
        }
        catch (Exception e) {
            thrown = e;
        }
        assertTrue(thrown instanceof IllegalStateException);
        assertEquals("Either nodes have something"
                + " preceding or following them", thrown.getMessage());
    }

    /**
     * test method for {@link Node#split()}
     */
    public void testSplit() {
        node1.join(node2);
        assertEquals(node2, node1.split());
        assertNull(node1.next());
        assertNull(node1.split());
    }
}
