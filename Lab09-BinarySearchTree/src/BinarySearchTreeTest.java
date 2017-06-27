import student.*;
/**
 * @author Romeo Bahoumda
 * @version 2017/04/19
 * @param <T>
 */
public class BinarySearchTreeTest<T> extends TestCase {
    private BinarySearchTree<String> test;
    
    @Override
    public void setUp() {
        test = new BinarySearchTree<String>();
    }
    
    /**
     * test
     */
    public void testInsert() {
        assertTrue(test.isEmpty());
        test.insert("root");
        assertFalse(test.isEmpty());
        Exception thrown = null;
        try {
            test.insert("root");
        }
        catch (Exception a) {
            thrown = a;
        }
        assertNotNull(thrown);
        assertTrue(thrown instanceof DuplicateItemException);
    }
    
    /**
     * test
     */
    public void testRemove() {
        Exception thrown = null;
        try {
            test.remove("something");
        }
        catch (Exception a) {
            thrown = a;
        }
        assertNotNull(thrown);
        assertTrue(thrown instanceof ItemNotFoundException);
        
        test.insert("ro");
        test.insert("2");
        test.insert("root");
        test.remove("2");
        test.remove("root");
        test.makeEmpty();
        
        test.insert("ro");
        test.remove("ro");
        test.makeEmpty();
        
        test.insert("ro");
        test.insert("20");
        test.remove("ro");
        test.makeEmpty();
        
        test.insert("ro");
        test.insert("root");
        test.remove("ro");
        test.makeEmpty();
        
        test.insert("ro");
        test.insert("20");
        test.insert("root");
        test.remove("ro");
        test.remove("root");
    }
    
    /**
     * test
     */
    public void testFindMax() {
        test.insert("ro");
        assertEquals("ro", test.findMax());
        test.insert("20");
        test.insert("3");
        assertEquals("ro", test.findMax());
        test.insert("root");
        assertEquals("root", test.findMax());
        test.makeEmpty();
        assertNull(test.findMax());      
    }
    
    /**
     * test
     */
    public void testFind() {
        test.insert("root");
        test.insert("20");
        test.insert("3");
        assertEquals("3", test.find("3"));
        assertEquals(null, test.find("something"));
    }
    
    /**
     * test
     */
    public void testFindMin() {
        test.insert("root");
        test.insert("20");
        test.insert("3");
        assertEquals("20", test.findMin());
        test.makeEmpty();
        assertNull(test.findMin());
    }
    
    /**
     * test
     */
    public void testMakeEmpty() {
        test.insert("root");
        test.makeEmpty();
        assertTrue(test.isEmpty());
    }
}
