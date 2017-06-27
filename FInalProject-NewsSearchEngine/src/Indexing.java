import java.util.ArrayList;

import java.util.HashMap;

/**
 * takes the tagged files and creates a binary search tree of the terms and
 * sorts by alphabetical order of terms
 * 
 * @author Romeo - 33%
 * @author Matt - 33%
 * @author jake - 33%
 * @version 2017.04.30
 * 
 */
public class Indexing {
    private HashMap<String, ArrayList<String>> input;
    private BinarySearchTree<Term> tree;
    private Term t;

    /**
     * Constructor takes an input, creates a tree and calls createIndex() O(1)
     * 
     * @param inInput
     *            sets input
     */
    public Indexing(HashMap<String, ArrayList<String>> inInput) {
        input = inInput;
        tree = new BinarySearchTree<Term>();
    }

    /**
     * populates the binary search tree O(nlogn)
     */
    public void createIndex() {
        for (String term : input.keySet()) {
            t = new Term(term);
            t.setFiles(input.get(term));
            tree.insert(t);
        }
    }

    /**
     * prints and returns the in order traversal O(n)
     * 
     * @return terms in order traversal
     * 
     */
    public String toInOrderIndex() {
        return toInOrderIndex(getTree().getRoot());
    }

    private String toInOrderIndex(BinaryNode<Term> root) {
        StringBuilder builder = new StringBuilder();

        builder.append("(");
        if (root.getLeft() != null) {
            builder.append(toInOrderIndex(root.getLeft()));
            builder.append(" ");
        }
        builder.append(tree.find(root.getElement()).getTerm());
        if (root.getRight() != null) {
            builder.append(" ");
            builder.append(toInOrderIndex(root.getRight()));
        }
        builder.append(")");
        return builder.toString();
    }

    /**
     * returns the list of files that contains the keyword O(logn)
     * 
     * @param keyword
     *            the term searched for
     * @return the arrayList of files containing the term
     * 
     */
    public ArrayList<String> search(String keyword) {
       ArrayList<String> bal = new ArrayList<String>();
       try {
           bal = tree.find(new Term(keyword)).getFiles();
       }
       catch(Exception e) {
           return null;
       }
       return bal;
    }

    /**
     * returns the Binary Search Tree mainly for testing O(1)
     * 
     * @return tree
     * 
     */
    public BinarySearchTree<Term> getTree() {
        return tree;
    }
}