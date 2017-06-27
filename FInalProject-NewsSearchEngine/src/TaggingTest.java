import java.io.File;

/**
 * @author Romeo - 33%
 * @author Matt - 33%
 * @author jake - 33%
 * @version 2017.04.30
 */
import java.util.ArrayList;
import java.util.HashMap;

import student.*;

public class TaggingTest extends TestCase {
    private Tagging test;
    private HashMap<String, ArrayList<String>> test1;
    private HashMap<String, ArrayList<String>> bh;
    private ArrayList<String> bb;

    @Override
    public void setUp() throws Exception {
        FilesParser fp = new FilesParser();
        final File folder = new File("C:/Users/LaptopUser/Desktop/Collections");
        fp.parse(folder);

        bh = fp.getContent();
        test = new Tagging(folder);
        test1 = new HashMap<String, ArrayList<String>>();
        bb = new ArrayList<String>();
    }

    /**
     * test for tfidf method O(n^2)
     */
    public void testTfidf() {
        test.TFIDF(bh);
        test1 = test.getTags();
        assertNotNull(test1);
        for (String term : test1.keySet()) {
            if (term.equals("lehigh")) {
                bb = test1.get(term);
                for (String name : bb) {
                    System.out.println(name);
            }
            }
        }
    }

}
