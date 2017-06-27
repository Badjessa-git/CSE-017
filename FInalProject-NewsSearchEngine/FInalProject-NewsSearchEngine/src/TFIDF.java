import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author Romeo
 * @version 2017/1/5
 *
 */
public class TFIDF {
	private String term;
	private double tf;
	private double idf;
	private double tfidf;
	
	
	public TFIDF() {
		this.term = "";
		this.tf = 0.0;
		this.idf = 0.0;
		this.tfidf = 0.0;
	}
	
	public String getTerm() {
		return term;
	}
	public double getTf() {
		return tf;
	}

	public double getIdf() {
		return idf;
	}

	public double getTfidf() {
		return tfidf;
	}
	
	/**
	 * Computes the Term frequency
	 * @return the Term Frequency
	 */
	public void tf(ArrayList<String> terms, String term) {
		 throw new UnsupportedOperationException(
		            "You have not implemented the insert method.");
	}
	
	/**
	 * Computes the Inverse Document Frequency
	 * @return the inverse document frequency
	 */
	public void idf(ArrayList<String> terms, String term) {
		 throw new UnsupportedOperationException(
		            "You have not implemented the insert method.");
	}
	
	/**
	 * Computes the TFIDF
	 * @return the value of TFIDF
	 */
	public void tfidf(ArrayList<String> terms, String term) {
		 throw new UnsupportedOperationException(
		            "You have not implemented the insert method.");
	}
	
	public int Count(ArrayList<String> List, String term) {
		 throw new UnsupportedOperationException(
		            "You have not implemented the insert method.");	
	}
}
