
// -------------------------------------------------------------------------
/**
 * Write a one-sentence summary of your class here. Follow it with additional
 * details about its purpose, what abstraction it represents, and how to use it.
 *
 * @author Romeo Bahoumda
 * @version 2017.02.11
 */
public class WeeklyNewspaper extends Newspaper
{
    // ----------------------------------------------------------
    /**
     * Create a new WeeklyNewspaper object.
     *
     * @param idNumber of 
     * @param title of 
     * @param numberCopies of
     * @param price of 
     */
    public WeeklyNewspaper(
        int idNumber,
        String title,
        int numberCopies,
        double price)
    {
        super(idNumber, title, numberCopies, price);
    }

    @Override
    public double monthlyCost() {
        return 4 * (this.getPrice() * this.getNumberCopies());
    }

    /**
     * @param otherNewspaper name
     * @return a sentence
     */
    public String bundledWith(WeeklyNewspaper otherNewspaper) {
        return otherNewspaper.getTitle() + " subscription is bundled with "
            + this.getTitle() + ".";
    }
}
