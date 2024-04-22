/*
  Name:       John Kerstetter
  Class:      CS 145
  File:       BasePluseCommissionEmployeeTest.java
  Assignment: Lab 3 - Employee Hierarchy
*/

public class BasePlusCommissionEmployeeTest {
        public static void main(String[] args) {

                // test employee class
                Employee e = new Employee(
                                "first",
                                "last",
                                "123");
                System.out.println(e.toString());
                System.out.println();

                // test commission employee class
                CommissionEmployee ce = new CommissionEmployee(
                                "first",
                                "last",
                                "456",
                                20.50,
                                0.75);
                System.out.println(ce.toString());
                System.out.println();

                // test base plus commission employee class
                BasePlusCommissionEmployee bcm = new BasePlusCommissionEmployee(
                                "first",
                                "last",
                                "789",
                                10.0,
                                0.5,
                                10.0);
                System.out.println(bcm.toString());
                System.out.println();

        }
}
