/*
  Name:       John Kerstetter
  Class:      CS 145
  File:       Employee.java
  Assignment: Lab 3 - Employee Hierarchy
*/

public class Employee {
    protected String firstName;
    protected String lastName;
    protected String socialSecurityNumber;

    // construct an employee
    public Employee(
            String firstName,
            String lastName,
            String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    // gets first name
    public String getFirstName() {
        return this.firstName;
    }

    // gets last name
    public String getLastName() {
        return this.lastName;
    }

    // get social security number
    public String getSocialSecurityNumber() {
        return this.socialSecurityNumber;
    }

    // return a string representation
    @Override
    public String toString() {
        return String.format(
                "%s: %s %s\n%s: %s",
                "Name", this.firstName, this.lastName,
                "SSN", this.socialSecurityNumber);
    }
}
