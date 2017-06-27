import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 * Calculates the TFIDF value of a term in a file
 * 
 * @author Romeo - 33%
 * @author Matt - 33%
 * @author jake - 33%
 * @version 2017.04.30
 * 
 */
public class TFIDF {
    private String term;
    private double tf;
    private double idf;
    private double tfidf;

    /**
     * Constructor sets the term and initial values O(1)
     * 
     * @param term
     *            sets term
     *
     */
    public TFIDF() {
        this.term = "";
        this.tf = 0.0;
        this.idf = 0.0;
        this.tfidf = 0.0;
    }

    /**
     * returns the term O(1)
     * 
     * @return term
     * 
     */
    public String getTerm() {
        return term;
    }

    /**
     * set the value
     * 
     * @param term
     *            to change
     */
    public void setTerm(String term) {
        this.term = term;
    }

    /**
     * returns the tf O(1)
     * 
     * @return tf
     * 
     */
    public double getTf() {
        return tf;
    }

    /**
     * returns the idf O(1)
     * 
     * @return idf
     * 
     */
    public double getIdf() {
        return idf;
    }

    /**
     * returns the tfidf O(1)
     * 
     * @return tfidf
     * 
     */
    public double getTfidf() {
        return tfidf;
    }

    /**
     * Computes the Term frequency O(n)
     * 
     * @return the Term Frequency
     */
    public void tf(ArrayList<String> terms, String term) {
        double i = Collections.frequency(terms, term);
        this.tf = (double) (i / terms.size());

    }

    /**
     * Computes the Inverse Document Frequency O(n)
     * 
     * @return the inverse document frequency
     */
    public void idf(String term, HashMap<String, ArrayList<String>> to) {
        // this.idf = Math.log10((double) to.size() / count(to, term));
        double n = 0;
        for (String key : to.keySet()) {
            for (String word : to.get(key)) {
                    if (term.equalsIgnoreCase(word)) {
                        n++;
                        break;
                    }
                }
            }
            this.idf = (double) (Math.log(to.size() / n));

        }



    /**
     * Computes the TFIDF O(1)
     * 
     * @return the value of TFIDF
     */
    public void tfidf(ArrayList<String> inTerms, String inTerm, HashMap<String, ArrayList<String>> to) {
        this.tf(inTerms, inTerm);
        this.idf(inTerm, to);
        this.tfidf = (double) (this.getTf() * this.getIdf());
    }

}
