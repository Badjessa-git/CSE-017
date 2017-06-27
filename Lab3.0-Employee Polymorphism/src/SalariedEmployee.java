// -------------------------------------------------------------------------
/**
 * Represents an employee who is paid a yearly salary.
 *
 * @author Romeo Bahoumda
 * @version 2017.02.10
 */
public class SalariedEmployee extends Employee {
    /**
     * @param name
     *            of employee
     * @param payRate
     *            of employee
     */
    public SalariedEmployee(String name, double payRate) {
        super(name, payRate);
    }

    @Override
    public double weeklyPay() {
        return this.getPayRate();
    }

    /**
     * @param otherParticipant meeting with
     * @return meeting with another employee
     */
    public String meetWith(SalariedEmployee otherParticipant) {
        return otherParticipant.getName() + " is joining " + this.getName() 
            + " in a conference";
    }
}