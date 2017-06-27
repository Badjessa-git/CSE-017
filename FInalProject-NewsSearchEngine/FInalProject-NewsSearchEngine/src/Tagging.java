import java.util.*;

/**
 * @author Romeo
 * @version 2017/01/5
 *
 */
public class Tagging {
	
	private TFIDF al;
	private HashMap<String, HashMap<String, Double>> tags;
	
	/**
	 * Constructor create a new files parser
	 * Creates a new TFIDF object
	 */
	public Tagging() 
	{
		this.tags = new HashMap<String, HashMap<String, Double>>();  
		this.al = new TFIDF();
		
	}
	
	/**
	 * Parses and the files and assign it to the fileHm.
	 * Get each term and call the TFIDF from the TFIDF class and push the article
	 * the name of the file, and the TFIDF value to tags. 
	 * Gets the TFIDF and stores it in a HashMap if TFIDF is greater than zero
	 * @param hm
	 */
	public void TFIDF (HashMap<String, ArrayList<String>> hm) {
		 throw new UnsupportedOperationException(
		            "You have not implemented the insert method.");	
	}
	
	/**
	 * @return the tags
	 */
	public HashMap<String, HashMap<String, Double>> getTags() {
		return tags;
	}
			
}
