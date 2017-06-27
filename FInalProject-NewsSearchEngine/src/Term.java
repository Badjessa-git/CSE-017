import java.util.ArrayList;

/**
 * Stores the term as well as the array of files that has a tfidf greater than a
 * threshold
 * 
 * @author Romeo - 33%
 * @author Matt - 33%
 * @author jake - 33%
 * @version 2017.04.30
 * 
 */
public class Term implements Comparable<Term> {
    private String term;
    private ArrayList<String> files;

    /**
     * Sets term and arraylist O(1)
     * 
     * @param inTerm
     * @param inFiles
     */
    public Term(String inTerm) {
        this.setTerm(inTerm);
        this.setFiles(files);
      
    }

    /**
     * returns the term O(1)
     * 
     * @return the term
     */
    public String getTerm() {
        return term;
    }

    /**
     * sets the term O(1)
     * 
     * @param term
     *            the term to set
     */
    public void setTerm(String term) {
        this.term = term;
    }

    /**
     * returns the files containing the term O(1)
     * 
     * @return the files
     */
    public ArrayList<String> getFiles() {
        if (this.files == null) {
            return null;
        }
        return files;
    }

    /**
     * sets the arraylist containing the files O(1)
     * 
     * @param files
     *            the files to set
     */
    public void setFiles(ArrayList<String> files) {
        this.files = files;
    }

    /**
     * compares the Term objects only on the term string O(n)
     * 
     * @param o
     *            the term to compare to
     * @return the int that relates the terms
     */
   
    @Override
    public int compareTo(Term o) {
        return this.getTerm().compareTo(o.getTerm());
    }
    /**
     * 
     * @param o to compare
     * @return boolean
     * O(1)
     */
    public boolean equalsTo(Term o) {
        return this.getTerm().equals(o.getTerm());
    }
    
    /**
     * 
     * @param o term 
     * @return tostring
     * O(n)
     */
    public String toString(Term o) {
        String a = "";
        if (o instanceof Term) {
            a = o.getTerm() + "";
            ArrayList<String> b = new ArrayList<String>();
            b = o.getFiles();
            for (int i =0; i < b.size(); i++) {
                a = b.get(i) +", "+ a;
            }
            
        }
        return a;
    }

}
