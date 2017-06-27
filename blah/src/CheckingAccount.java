
/**
 * @author Romeo
 * @version Feb 3, 2017
 */
public class CheckingAccount extends BankAccount {
    private double fee;
    
    /**
     * deduct the fee
     */
    public void deductFee() {
    	this.totalBalance -= fee;
    }
}
