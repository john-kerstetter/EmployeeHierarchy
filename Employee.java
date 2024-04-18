

public class Employee {
    protected String firstName;
    protected String lastName;
    protected String socialSecurityNumber;

    public Employee(
            String firstName,
            String lastName,
            String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getSocialSecurityNumber() {
        return this.socialSecurityNumber;
    }

    public String toString() {
        return String.format(
                "%s: %s %s\n%s: %s",
                "Name", this.firstName, this.lastName,
                "SSN", this.socialSecurityNumber);
    }
}
