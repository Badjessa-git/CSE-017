// -------------------------------------------------------------------------
/**
 * Represents an employee in a company or business.
 *
 * @author Romeo Bahoumda
 * @version 2017.02.10
 */
public abstract class Employee implements MeetingParticipant {
    private String name; // The employee's name.
    private double payRate; // The employee's pay rate.

    /**
     * Create new Employee Object
     * 
     * @param name
     *            of employee
     * @param payRate
     *            of employee
     */
    
    public Employee(String name, double payRate) {
        this.name = name;
        this.payRate = payRate;
    }

    /**
     * Gets the employee's name.
     * @return the employee's name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the pay rate.
     * 
     * @return the pay rate
     */
    public double getPayRate() {
        return payRate;
    }

    /**
     * @return weekly pay of employer
     */
    public abstract double weeklyPay();
    
    /**
     * @param otherParticipant person having the meeting
     * @return employees meeting
     */
    public String meetWith(MeetingParticipant otherParticipant) {
        return this.name + " is meeting with " + otherParticipant.getName();
    }

}
