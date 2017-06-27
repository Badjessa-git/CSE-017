import java.util.ArrayList;
import java.util.EmptyStackException;

//-------------------------------------------------------------------------
/**
 * An implementation of the stack data type that adapts an ArrayList to store
 * its contents.
 *
 * This is a PARTIAL IMPLEMENTATION that needs completion.
 *
 * @param <T>
 *            the type of elements stored in the stack
 *
 * @author Tony Allevato (authored class skeleton)
 * @author Romeo Bahoumda
 * @version 2017/03/27
 */
public class ArrayListStack<T> implements SimpleStack<T> {
    // ~ Instance/static variables ............................................
    /**
     * stackArray
     */
    protected ArrayList<T> stackArray;
    /**
     * default size
     */
    protected static final int DEFAULT_SIZE = 100;
    /**
     * top
     */
    protected int top;
    /**
     * size
     */
    protected int size;

    // ~ Constructors .........................................................

    // ----------------------------------------------------------
    /**
     * No Parameter Constructor, construct it with the default size
     */
    public ArrayListStack() {
        this.top = 0;
        stackArray = new ArrayList<T>(DEFAULT_SIZE);
        this.size = 0;

    }

    // ~ Methods ..............................................................

    // ----------------------------------------------------------
    /**
     * implement push method
     * @param item to be pushed
     */
    public void push(T item) {
        stackArray.add(item);
        top++;
        size++;

    }

    // ----------------------------------------------------------
    /**
     * implements pop
     */
    public void pop() throws EmptyStackException {
        if (this.isEmpty()) {
            throw new EmptyStackException();
        } 
        else {
            stackArray.remove(--top);

        }
    }

    // ----------------------------------------------------------
    /**
     * implement top
     * @return T the item
     */
    public T top() throws EmptyStackException {
        if (this.isEmpty()) {
            throw new EmptyStackException();
        } 
        else {
            return stackArray.get(top - 1);
        }
    }

    // ----------------------------------------------------------
    /**
     * implement size
     * @return the size
     */
    public int size() {
        return stackArray.size();
    }

    // ----------------------------------------------------------
    /**
     * implement size
     * @return true or false if empty
     */
    public boolean isEmpty() {
        return stackArray.isEmpty();
    }
}
