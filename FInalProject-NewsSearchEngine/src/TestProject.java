import java.util.ArrayList;
import java.util.HashMap;

// -------------------------------------------------------------------------
/**
 * Write a one-sentence summary of your class here. Follow it with additional
 * details about its purpose, what abstraction it represents, and how to use it.
 *
 * @author ericfouh
 * @version Mar 12, 2017
 */
public class TestProject
{

    // ----------------------------------------------------------
    /**
     * Place a description of your method here.
     *
     * @param args
     * @throws Exception
     */
    public static void main(String[] args)
        throws Exception
    {
        // HTMLparser hp = new HTMLparser();
        HTMLparser hp1 = new HTMLparser();

        // Feed 1 HuffPost
        RSSFeedParser parser =
            new RSSFeedParser("http://feeds.foxnews.com/foxnews/latest");
        // http://feeds.foxnews.com/foxnews/latest
        Feed feed = parser.readFeed();
        // System.out.println("+++>>"+feed);

        for (FeedMessage message : feed.getMessages())
        {
            // System.out.println("+++>>"+message.getLink());
            hp1.parse(message.getLink());

        }

        Tagging dt = new Tagging(parser);

        HashMap<String, ArrayList<String>> hm = hp1.getContent();
            new HashMap<String, ArrayList<String>>();
        dt.TFIDF(hm);
        Indexing idx = new Indexing(dt.getTags());
        idx.createIndex();
        //BinarySearchTree<IndexNode> index = dt.getIndex();
        System.out.println(idx.toInOrderIndex());
        String query = "latest";
        ArrayList<String> results = idx.search(query);
        if (results == null)
            System.out.println("No Articles Related to " + query);
        else
        {
            for (int i = 0; i < results.size(); i++)
            {
                System.out.println(results.get(i));
            }
        }

    }

}
