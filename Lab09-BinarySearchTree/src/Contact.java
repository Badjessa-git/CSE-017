
/**
 * @author Romeo
 * @version 2017/4/21
 *
 */
public class Contact implements Comparable<Contact> {

    private String lastName;
    private String firstName;
    private String phone;

    /**
     * @param lastName
     *            of person
     * @param firstName
     *            of person
     * @param phone
     *            of person
     */
    public Contact(String lastName, String firstName, String phone) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.phone = phone;
    }

    @Override
    public int compareTo(Contact o) {
        if (this.getLastName().compareTo(o.getLastName()) == 0) {
            if (this.getFirstName().compareTo(o.getFirstName()) == 0) {
                return this.getPhone().compareTo(o.getPhone());
            }
            else {
                return this.getFirstName().compareTo(o.getFirstName());
            }
        }
        else {
            return this.getLastName().compareTo(o.getLastName());
        }
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }
}
