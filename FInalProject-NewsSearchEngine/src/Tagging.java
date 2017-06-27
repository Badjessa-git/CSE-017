import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Tagging class takes the result from the file parser and tags each file with
 * the terms associated with it
 * 
 * @author Romeo - 33%
 * @author Matt - 33%
 * @author jake - 33%
 * @version 2017/01/5
 * 
 * 
 */
public class Tagging {
    private HashMap<String, ArrayList<String>> hm;
    private HashMap<String, ArrayList<String>> hm1;
    private FilesParser parser;
    private HTMLparser parser1;
    private Feed feed;
    private TFIDF blah;

    /**
     * Constructor parses the file and sends the terms to get TFIDF calculated
     * 
     * @param url
     *            file url
     * 
     * 
     */
    public Tagging(File url) {
        hm = new HashMap<String, ArrayList<String>>();
        blah = new TFIDF();
        parser = new FilesParser();
        try {
            parser.parse(url);
        }
        catch (Exception e) {
            // do nothing
        }
        hm1 = new HashMap<String, ArrayList<String>>();
        hm1 = parser.getContent();

        this.TFIDF(hm1);
    }

    public Tagging(RSSFeedParser url) throws Exception {
        hm = new HashMap<String, ArrayList<String>>();
        blah = new TFIDF();
        parser1 = new HTMLparser();
        feed = url.readFeed();
        for (FeedMessage message : feed.getMessages()) {
            parser1.parse(message.getLink());
        }
        hm1 = new HashMap<String, ArrayList<String>>();
        hm1 = parser1.getContent();

        this.TFIDF(hm1);
    }

    /**
     * Parses and the files and assign it to the fileHm Get each term and call
     * the TFIDF from the TFIDF class and push the article, the name of the
     * file, and the TFIDF value to tags. Gets the TFIDF and stores it in a
     * HashMap if TFIDF is greater than zero O(n^2)
     * 
     * @param term
     *            list of terms
     * 
     * 
     */
    public void TFIDF(HashMap<String, ArrayList<String>> term) {
        // puts each tfidf into hm
        for (String key : term.keySet()) {
            ArrayList<String> lu = term.get(key);
            ArrayList<String> b = new ArrayList<String>();
            String word = "";
            for (String keyword : lu) {
                word = keyword;
                // create TFIDF and put into hm
                blah.setTerm(keyword);// make a a TFIDF object with the term

                blah.tfidf(lu, keyword, term);
                // compute the TFIDF value

                // temporary HashMap to store the name and TFIDF values
                if (blah.getTfidf() > 0.005) {
                    while (!b.contains(key)) {
                        b.add(key);
                    }
                    hm.put(word, b);
                }

            }

        }
    }

    /**
     * returns the hashmap O(1)
     * 
     * @return hm
     */
    public HashMap<String, ArrayList<String>> getTags() {
        return hm;
    }

}