
// -------------------------------------------------------------------------
/**
 * Write a one-sentence summary of your class here. Follow it with additional
 * details about its purpose, what abstraction it represents, and how to use it.
 *
 * @author Romeo Bahoumda
 * @version 2017.02.10
 */
public abstract class Newspaper implements BundledSubscription
{
    private int idNumber;
    private String title;
    private int numberCopies;
    private double price;

    /**
     * @param idNumber of paper
     * @param title of paper
     * @param numberCopies of paper
     * @param price of paper
     */
    public Newspaper(int idNumber, String title, 
        int numberCopies, double price) {
        this.idNumber = idNumber;
        this.title = title;
        this.numberCopies = numberCopies;
        this.price = price;
    }



    // ----------------------------------------------------------
    /**
     * @return the id_number of the Newspaper
     */
    public int getIdNumber()
    {
        return idNumber;
    }


    // ----------------------------------------------------------
    /**
     * @return the title of the Newspaper
     */
    public String getTitle()
    {
        return title;
    }


    // ----------------------------------------------------------
    /**
     * @return the number_copies of the Newspaper
     */
    public int getNumberCopies()
    {
        return numberCopies;
    }


    // ----------------------------------------------------------
    /**
     * @return the price
     */
    public double getPrice()
    {
        return price;
    }
    /**
     * @return monthly cost
     */
    public abstract double monthlyCost();
    
    /**
     * @param other newspaper
     * @return sentence
     */
    public String bundledWith(BundledSubscription other) {
        return this.getTitle() + " and "
            + other.getTitle() + " subscriptions are bundled.";
    }
}
