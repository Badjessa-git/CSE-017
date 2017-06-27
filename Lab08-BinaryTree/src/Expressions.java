
/**
 * @author Romeo
 * @version 2017/4/18
 */
public class Expressions {
    /**
     * @param args
     *            so
     */
    public static void main(String[] args) {
        BinaryTree<String> cl = new BinaryTree<String>("-");
        BinaryTree<String> cr = new BinaryTree<String>("/");
        BinaryTree<String> cl2 = cl.clone();
        BinaryTree<String> cr2 = cr.clone();
        BinaryTree<String> cl3 = cl.clone();
        BinaryTree<String> cr3 = cr.clone();
        BinaryTree<String> cl4 = cl.clone();
        BinaryTree<String> cr4 = cr.clone();
        BinaryTree<String> tree = new BinaryTree<String>("*", cl, cr);
        cl2.setElement("+");
        cr2.setElement("e");
        cl3.setElement("c");
        cr3.setElement("d");
        cl4.setElement("a");
        cr4.setElement("b");
        cr.setLeft(cl2);
        cr.setRight(cr2);
        cl2.setLeft(cl3);
        cl2.setRight(cr3);
        cl.setLeft(cl4);
        cl.setRight(cr4);
        System.out.println(tree.toInOrderString());
        System.out.println(tree.toPostOrderString());
        System.out.println(tree.toPreOrderString());

    }
}
