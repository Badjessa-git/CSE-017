import java.util.HashMap;

//-------------------------------------------------------------------------
/**
 * An implementation of the Levenshtein distance algorithm.
 *
 * @author  Romeo Bahoumda
 * @version 3/2/2017
 */
public class Levenshtein
{
    //~ Fields ..........................................................

    private String s1;
    private String s2;
    private HashMap<String, Integer> map;
    /**
     * Constructor
     * @param s1 first string
     * @param s2 second string
     */
    //~ Constructors ....................................................

    public Levenshtein(String s1, String s2) {
        this.s1 = s1;
        this.s2 = s2;
        this.map = new HashMap<String, Integer>();
    }

    //~ Methods .........................................................
    /**
     * @param pos1 first pos
     * @param length1 l
     * @param pos2 g 
     * @param length2 h
     * @return edit distance
     */
    private int editDistance(int pos1, int length1, int pos2, int length2) {
        String key = pos1 + "," + length1 + "," + pos2 + "," + length2;
        int result = 0;
        if (map.containsKey(key)) {
            result = map.get(key);
            return result;
        }
        if (length1 == 0 && length2 == 0) {
            return 0;
        }
        else if (length1 == 0) {
            return length2;
        }
        else if (length2 == 0) {
            return length1;
        }
        else {
            int delete = editDistance(pos1 + 1, length1 - 1,
                    pos2, length2) + 1;
            int insert = editDistance(pos1, length1, pos2 + 1,
                    length2 - 1 ) + 1;
            int change = 0;
            if (s1.charAt(pos1) == s2.charAt(pos2)) {
                change = editDistance(pos1 + 1, length1 - 1, pos2 + 1,
                        length2 - 1);
            }
            else {
                change = editDistance(pos1 + 1, length1 - 1,
                    pos2 + 1, length2 - 1 ) + 1;
            }
            result = Math.min(delete, Math.min(insert, change));
            map.put(key, result);   
        }
        return result;
    }
    
    /**
     * @return the distance computed
     */
    public int distance() {
        return editDistance(0, s1.length(), 0, s2.length());
    }
}
