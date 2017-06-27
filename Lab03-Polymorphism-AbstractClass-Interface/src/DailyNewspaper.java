
// -------------------------------------------------------------------------
/**
 * Write a one-sentence summary of your class here. Follow it with additional
 * details about its purpose, what abstraction it represents, and how to use it.
 *
 * @author Romeo Bahoumda
 * @version 2017.02.11
 */
public class DailyNewspaper extends Newspaper

{
    // ----------------------------------------------------------
    /**
     * Create a new DailyNewspaper object.
     *
     * @param idNumber of
     * @param title of 
     * @param numberCopies of
     * @param price of
     */
    public DailyNewspaper(
        int idNumber,
        String title,
        int numberCopies,
        double price)
    {
        super(idNumber, title, numberCopies, price);
    }

    @Override
    public double monthlyCost() {
        return 30 * (this.getPrice() * this.getNumberCopies());
    }

}
