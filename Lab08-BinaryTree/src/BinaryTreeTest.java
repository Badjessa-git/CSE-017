import student.*;

/**
 * @author Romeo
 * @version 2017/15/4
 * @param <T>
 *            Test Case for {@link BinaryTree}
 */
public class BinaryTreeTest<T> extends TestCase {
    private BinaryTree<Integer> test;

    @Override
    public void setUp() {
        test = new BinaryTree<Integer>(0);

    }

    /**
     * test for {@link BinaryTree#clone()}
     */
    public void testClone() {
        BinaryTree<Integer> cl = new BinaryTree<Integer>(1);
        BinaryTree<Integer> cr = new BinaryTree<Integer>(2);
        BinaryTree<Integer> test2 = new BinaryTree<Integer>(0, cl, cr);
        BinaryTree<Integer> b = test2.clone();
        assertEquals(b.height(), test2.height());
        assertEquals(b.size(), test2.size());
        assertEquals(b.getLeft().size(), test2.getLeft().size());
        assertEquals(b.getRight().size(), test2.getRight().size());

    }

    /**
     * test for {@link BinaryTree#size()}
     */
    public void testSize() {
        assertEquals(1, test.size());
        BinaryTree<Integer> cl = new BinaryTree<Integer>(1);
        BinaryTree<Integer> cr = new BinaryTree<Integer>(2);
        test.setLeft(cl);
        test.setRight(cr);
        assertEquals(3, test.size());
        cl.setLeft(new BinaryTree<Integer>(3));
        assertEquals(4, test.size());

    }

    /**
     * test for {@link BinaryTree#height()}
     */
    public void testHeight() {
        assertEquals(1, test.height());
        BinaryTree<Integer> cl = new BinaryTree<Integer>(1);
        BinaryTree<Integer> cr = new BinaryTree<Integer>(2);
        test.setLeft(cl);
        test.setRight(cr);
        assertEquals(2, test.height());
    }

    /**
     * test for {@link BinaryTree#toPostOrderString()}
     */
    public void testToPostOrderTraversal() {
        BinaryTree<Integer> cl = new BinaryTree<Integer>(1);
        BinaryTree<Integer> cr = new BinaryTree<Integer>(2);
        test.setLeft(cl);
        test.setRight(cr);
        cl.setLeft(new BinaryTree<Integer>(3));
        cl.setRight(new BinaryTree<Integer>(4));
        assertEquals("(((3) (4) 1) (2) 0)", test.toPostOrderString());
    }

    /**
     * test for {@link BinaryTree#toInOrderString()}
     */
    public void testToInOrderTraversal() {
        BinaryTree<Integer> cl = new BinaryTree<Integer>(1);
        BinaryTree<Integer> cr = new BinaryTree<Integer>(2);
        test.setLeft(cl);
        test.setRight(cr);
        cl.setLeft(new BinaryTree<Integer>(3));
        cl.setRight(new BinaryTree<Integer>(4));
        assertEquals("(((3) 1 (4)) 0 (2))", test.toInOrderString());
    }

    /**
     * test for {@link BinaryTree#toPreOrderString()}
     */
    public void testToPreOrderTraversal() {
        BinaryTree<Integer> cl = new BinaryTree<Integer>(1);
        BinaryTree<Integer> cr = new BinaryTree<Integer>(2);
        test.setLeft(cl);
        test.setRight(cr);
        cl.setLeft(new BinaryTree<Integer>(3));
        cl.setRight(new BinaryTree<Integer>(4));
        assertEquals("(0 (1 (3) (4)) (2))", test.toPreOrderString());
    }
}
