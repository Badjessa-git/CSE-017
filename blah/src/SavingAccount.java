
/**
 * @author Romeo
 * @version Feb 3, 2017
 */
public class SavingAccount extends BankAccount {
    private double interestRate;
	
    /**
     * adding interest to balance
     */
    public void addInterest() {
    	double interest = interestRate * this.totalBalance;
    	this.totalBalance += interest;
    }
}
