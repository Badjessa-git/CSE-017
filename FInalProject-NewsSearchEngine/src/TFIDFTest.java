import student.TestCase;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author Romeo - 33%
 * @author Matt - 33%
 * @author jake - 33%
 * @version 2017.05.01
 */
public class TFIDFTest extends TestCase {

    private TFIDF test;
    private String term;
    private HashMap<String, ArrayList<String>> test1;
    private FilesParser testp;

    /**
     * empty constructor
     */
    public TFIDFTest() {
        // empty constructor
    }

    /**
     * set up method
     * @throws Exception 
     */
    public void setUp() throws Exception {
    	testp = new FilesParser();
        final File folder = new File(
            "/Users/LaptopUser/Desktop/Collections");
        testp.parse(folder);
        test1 = testp.getContent();
        test = new TFIDF();
    }
    
    /**
     * tests count method
     * @throws Exception 
     */
   /* public void testCount() throws Exception {
    	test = new TFIDF();
    	test.setTerm("lehigh");
    	assertEquals(16, test.count(test1, test.getTerm()));
    	
    	test = new TFIDF();
    	test.setTerm("stuff");
    	assertEquals(3, test.count(test1, test.getTerm()));
    	
    }*/

    /**
     * test tf method O(n)
     */

    public void testTF() {
        test = new TFIDF();
        test.setTerm("lehigh");
        test.tf(test1.get("File2.txt"), test.getTerm());
        assertEquals(1, test.getTf(), 0.001);
        
        test.tf(test1.get("File1.txt"), test.getTerm());
        assertEquals(0.3, test.getTf(), 0.001);
    }

	/**
     * test idf method O(n)
     */

    public void testIDF() {
        test = new TFIDF();
        test.setTerm("stuff");
        test.idf(test.getTerm(), test1);
        assertEquals(1.609, test.getIdf(), 0.1);    }

    /**
     * test tfidf method O(1)
     */

    public void testTFIDF() {
       test = new TFIDF();
       test.setTerm("stuff");
       ArrayList<String> a = new ArrayList<String>();
       a = test1.get("File2.txt");
       test.tfidf(a, test.getTerm(), test1);
       assertEquals(0.0, test.getTfidf(), 0.1);
       
       TFIDF test2 = new TFIDF();
       test2.setTerm("lehigh");
       ArrayList<String> b = new ArrayList<String>();
       b = test1.get("File3.txt");
       test.tfidf(a, test2.getTerm(), test1);
       assertEquals(0.0, test.getTfidf(), 0.1);
    }
}
