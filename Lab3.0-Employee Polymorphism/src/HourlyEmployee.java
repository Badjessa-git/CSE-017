// -------------------------------------------------------------------------
/**
 * Represents an employee who is paid an hourly wage.
 *
 * @author Romeo Bahoumda
 * @version 2017.02.10
 */
public class HourlyEmployee extends Employee {

    /**
     * @param name
     *            of Employee
     * @param payRate
     *            of Employee
     */
    public HourlyEmployee(String name, double payRate) {
        super(name, payRate);
    }

    @Override
    public double weeklyPay() {
        return 40 * this.getPayRate();
    }


}