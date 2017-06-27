  import java.util.ArrayList;
import java.util.HashMap;
import student.TestCase;

/**
 * @author Romeo - 33%
 * @author Matt - 33%
 * @author jake - 33%
 * @version 2017.04.30
 */
public class IndexingTest extends TestCase {
    private Indexing index;
    private HashMap<String, ArrayList<String>> hm;
    private ArrayList<String> tfidf;
    private ArrayList<String> tfidf2;


    /**
     * runs before the tests
     * 
     */
    public void setUp() {
       hm = new HashMap<String, ArrayList<String>>();
       tfidf = new ArrayList<String>();
       tfidf.add("romeo");
       tfidf.add("damien");
       hm.put("family", tfidf);
       
       tfidf2 = new ArrayList<String>();
       tfidf2.add("school");
       tfidf2.add("cse");
       hm.put("edu", tfidf2);
       
       index = new Indexing(hm);

       
    }

    /**
     * tests createIndex() worst case: O(n^2) average case: O(n*log(n))
     */
    public void testCreateIndex() {
       assertTrue(this.index.getTree().isEmpty());
       this.index.createIndex();
       assertNotNull(this.index.getTree());
    }

    /**
     * tests toInOrderIndex O(n)
     */
    public void testToInOrderIndex() {
        this.index.createIndex();
        assertEquals("(edu (family))", this.index.toInOrderIndex());
    }

    /**
     * tests search() average: O(log(n)) worst: O(n)
     */
    public void testSearch() {
        this.index.createIndex();
        ArrayList<String> pa = new ArrayList<String>();
        pa.add("romeo");
        pa.add("damien");
        assertEquals(pa, index.search("family"));
        for (int i = 0; i < pa.size(); i++) {
            assertEquals(pa.get(i), index.search("family").get(i));
            System.out.println(this.index.search("family").get(i));
        }
    }
}
