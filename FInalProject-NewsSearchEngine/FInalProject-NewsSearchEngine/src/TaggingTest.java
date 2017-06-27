import java.io.File;

/**
 * @author Romeo
 * @version 2017/01/5
 */
import java.util.ArrayList;
import java.util.HashMap;

import student.*;
public class TaggingTest extends TestCase{
	public Tagging test;
	
	@Override
	public void setUp() throws Exception {
		FilesParser fp = new FilesParser();
        final File folder = new File(
            "C:/Users/LaptopUser/Desktop/Collections");  
        fp.parse(folder);

        HashMap<String, ArrayList<String>> hm = fp.getContent();
        test = new Tagging();
	}
	
	/**
	 * test for tfidf method
	 */
	public void testTfidf() {
		HashMap<String, Double> t = new HashMap<String, Double>();
		for (String key: test.getTags().keySet()) {
			t = test.getTags().get(key);
			for (String key1 : t.keySet()) {
				assertTrue(t.get(key1) > 0);
			}
		}
	}
}
