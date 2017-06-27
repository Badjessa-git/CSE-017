import student.*;

/**
 * @author Romeo
 * @version 2017/21/4
 */
public class ContactTest extends TestCase {
    private Contact test;
    private BinarySearchTree<Contact> tree;

    @Override
    public void setUp() {
        test = new Contact("Romeo", "Bahoumda", "123");
        tree = new BinarySearchTree<Contact>();
    }

    /**
     * test method
     */
    public void testCompareTo() {
        Contact test2 = new Contact("Romeo", "Bahoumda", "123");
        assertEquals(0, test.compareTo(test2));

        // different first name
        Contact test3 = new Contact("Rome", "Bahoumda", "123");
        Contact test31 = new Contact("Romepipoipo", "Bahoumda", "123");
        assertTrue(test.compareTo(test3) > 0);
        assertTrue(test.compareTo(test31) < 0);

        // different last name
        Contact test4 = new Contact("Romeo", "Bahoum", "123");
        Contact test41 = new Contact("Romeo", "Bahoumdadfhaf", "123");
        assertTrue(test.compareTo(test4) > 0);
        assertTrue(test.compareTo(test41) < 0);

        // different numbers
        Contact test5 = new Contact("Romeo", "Bahoumda", "12345");
        Contact test51 = new Contact("Rome", "Bahoumda", "12");
        assertTrue(test.compareTo(test5) < 0);
        assertTrue(test.compareTo(test51) > 0);
    }
    
    /**
     * test
     */
    public void testContactTrees() {
        Contact test2 = new Contact("Romeo", "Bahoumda", "123");
        Contact test3 = new Contact("Rome", "Bahoumda", "123");
        Contact test4 = new Contact("Romepipoipo", "Bahoumda", "123");
        Contact test5 = new Contact("Romeo", "Bahoumda", "12345");
        Contact test6 = new Contact("Rome", "Bahoumda", "12");
        Contact test7 = new Contact("Romeo", "Bahoumda", "123456");
        Contact test8 = new Contact("Rome", "Bahoumda", "124");
        tree.insert(test);
        Exception thrown = null;
        try {
            tree.insert(test2);
        }
        catch (Exception a) {
            thrown = a;
        }
        assertNotNull(thrown);
        assertTrue(thrown instanceof DuplicateItemException);
        tree.insert(test3);
        tree.insert(test4);
        tree.insert(test5);
        tree.insert(test6);
        tree.insert(test7);
        tree.insert(test8);
        tree.remove(test5);
        tree.remove(test);
    }
    
}
