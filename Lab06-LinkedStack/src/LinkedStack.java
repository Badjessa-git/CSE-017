import java.util.EmptyStackException;
//-------------------------------------------------------------------------
/**
 * An implementation of the stack data type that uses a linked chain of
 * {@code Node<E>} objects to store its contents.
 *
 * This is a PARTIAL IMPLEMENTATION that needs completion.
 *
 * @param <E>
 * 
 *            the type of elements stored in the stack
 *
 * @author Tony Allevato (authored class skeleton)
 * @author Romeo
 * @version 2017.4.4
 */
public class LinkedStack<E> implements StackInterface<E> {
    // ~ Fields ...............................................................
    private int size;
    private Node<E> front;

    // ~ Constructors .........................................................

    // ----------------------------------------------------------
    /**
     * Constructor for LinkedStack
     */
    public LinkedStack() {
        front = new Node<E>(null);
        this.size = 0;
    }

    // ~ Methods ..............................................................

    // ----------------------------------------------------------
    @Override
    public void push(E item) {
        Node<E> bruh = new Node<E>(item);
        bruh.join(front);
        size++;
        front = bruh;

    }

    // ----------------------------------------------------------
    @Override
    public void pop() {
        if (this.isEmpty()) {
            throw new EmptyStackException();
        }
        Node<E> next = front.next();
        front.split();
        this.front = next;
        size--;
    }

    // ----------------------------------------------------------
    @Override
    public E peek() {
        if (this.isEmpty()) {
            throw new EmptyStackException();
        }
        return front.data();
    }

    // ----------------------------------------------------------
    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}
