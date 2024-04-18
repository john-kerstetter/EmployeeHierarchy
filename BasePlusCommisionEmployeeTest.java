public class BasePlusCommisionEmployeeTest {
    public static void main(String[] args) {
        Employee e = new Employee(
                "first",
                "last",
                "123");
        System.out.println(e.toString());
        System.out.println();

        CommissionEmployee ce = new CommissionEmployee(
                "first",
                "last",
                "456",
                20.50,
                0.75);
        System.out.println(ce.toString());
        System.out.println();

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
