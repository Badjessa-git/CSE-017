import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author jake
 * @version 2017.04.26
 */
public class Indexing {
    BinaryNode root;
    HashMap<String, HashMap<String, Double>> input;

    // insert binary search tree lab
    // creates binary search tree when searching for term sorting by tfidf
    // if term not in file exclude from tree
    /**
     * @param inInput
     *            sets input
     */
    public Indexing(HashMap<String, HashMap<String, Double>> inInput) {
        root = null;
        input = inInput;
        createIndex();
    }

    /**
     * creates the binary search tree
     */
    public void createIndex() {
        for (String term : input.keySet()) {
            insert(term, input.get(term), root);
        }
    }

    /**
     * @return terms in order traversal
     */
    public String toInOrderIndex() {
        System.out.println("not yet supported");
        return "not yet supported";
    }

    /**
     * @param keyword
     *            the term searched for
     * @return the arrayList of files containing the term
     */
    public ArrayList<String> search(String keyword) {
        return find(keyword, root).getArrayFiles();
    }

    /**
     * @return root
     */
    public BinaryNode getRoot() {
        return root;
    }

    /**
     * Internal method to insert a value into a subtree.
     * 
     * @param term
     *            the item to insert.
     * @param files
     *            files containing the term
     * @param node
     *            the node that roots the subtree.
     */
    private BinaryNode insert(String term, HashMap<String, Double> files,
            BinaryNode node) {
        if (root == null) {
            root = new BinaryNode(term, files);
            return root;
        }
        BinaryNode result = node;
        boolean end = false;
        while (!end) {
            if (term.compareTo(result.getTerm()) < 0) {
                if (result.getLeft() == null) {
                    result.setLeft(new BinaryNode(term, files));
                    end = true;
                }
                else {
                    result = result.getLeft();
                }
            }
            else if (term.compareTo(result.getTerm()) > 0) {
                if (result.getRight() == null) {
                    result.setRight(new BinaryNode(term, files));
                    end = true;
                }
                else {
                    result = result.getRight();
                }
            }
        }
        return result;
    }

    // ----------------------------------------------------------
    /**
     * Internal method to find an item in a subtree.
     * 
     * @param term
     *            is item to search for.
     * @param node
     *            the node that roots the tree.
     * @return node containing the matched item.
     */
    private BinaryNode find(String term, BinaryNode node) {
        if (node == null) {
            return null; // Not found
        }
        else if (term.compareTo(node.getTerm()) < 0) {
            // Search in the left subtree
            return find(term, node.getLeft());
        }
        else if (term.compareTo(node.getTerm()) > 0) {
            // Search in the right subtree
            return find(term, node.getRight());
        }
        else {
            return node; // Match
        }
    }
}

/**
 * BinaryNode class
 * 
 * @author jake
 * @version 2017.04.30
 */
class BinaryNode {
    // ~ Instance/static variables
    // .............................................

    private String term;
    private HashMap<String, Double> files;
    private BinaryNode left;
    private BinaryNode right;

    // ~ Constructor
    // ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a node with no children.
     * 
     * @param theElement
     *            the element to store in this node.
     */
    BinaryNode(String theTerm, HashMap<String, Double> theFiles) {
        term = theTerm;
        files = theFiles;
        left = null;
        right = null;
    }

    // ~ Public methods
    // ........................................................

    // ----------------------------------------------------------
    /**
     * Get the current data value stored in this node.
     * 
     * @return the term
     */
    public String getTerm() {
        return term;
    }

    // ----------------------------------------------------------
    /**
     * Get the current data value stored in this node.
     * 
     * @return the ArrayList of files
     */
    public ArrayList<String> getArrayFiles() {
        return new ArrayList<String>(files.keySet());
    }

    // ----------------------------------------------------------
    /**
     * Gets the Files data.
     * 
     * @param file
     *            the file to get TFIDF for
     * @return the TFIDF of a term in a file
     */
    public Double getTFIDF(String file) {
        return files.get(file);
    }

    // ----------------------------------------------------------
    /**
     * Get the left child of this node.
     * 
     * @return a reference to the left child.
     */
    public BinaryNode getLeft() {
        return left;
    }

    // ----------------------------------------------------------
    /**
     * Set this node's left child.
     * 
     * @param value
     *            the node to point to as the left child.
     */
    public void setLeft(BinaryNode value) {
        left = value;
    }

    // ----------------------------------------------------------
    /**
     * Get the right child of this node.
     * 
     * @return a reference to the right child.
     */
    public BinaryNode getRight() {
        return right;
    }

    // ----------------------------------------------------------
    /**
     * Set this node's right child.
     * 
     * @param value
     *            the node to point to as the right child.
     */
    public void setRight(BinaryNode value) {
        right = value;
    }
}
