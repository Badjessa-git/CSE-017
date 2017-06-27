package cs2114;
import student.TestCase;
public class SingleLinkedListTest<E> extends TestCase{
    public SingleLinkedList<String> test1;
    
    public void setUP() {
        test1 = new SingleLinkedList<String>();
       
    }
    
    public void testDivideInHald() {
        test1.add("A", "B", "C"); 
    }
}
