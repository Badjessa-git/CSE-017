
/**
 * @author Romeo
 * @version Feb 3, 2017
 */
public class BankAccount {
    protected int accountNumber;
    protected double totalBalance;
    
    /**
     * @param amount to deposit
     */
    public void deposit(double amount) {
    	this.totalBalance += amount;
    }
    
    /**
     * @param amount to withdraw
     */
    public void withdraw(double amount) {
    	this.totalBalance -= amount;
    }
    
    /**
     * @return the total balance
     */
    public double getBalance() {
    	return this.totalBalance;
    }
}
