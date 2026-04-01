public class Main_6 {
    public static void main(String[] args) {

        Payroll p = new Payroll(600000, 20000, 15000, 50000, 20);

        FullTimeEmployee emp1 = new FullTimeEmployee(
                "Rahul", "ABCDE1234F", "01-01-2022", "SWE", 101,
                50000, "SWE"
        );

        ContractEmployee emp2 = new ContractEmployee(
                "Anita", "PQRSX5678L", "15-03-2023", "Consultant", 102,
                120, 500
        );

        Manager mgr = new Manager(
                "Vikram", "LMNOP9876Z", "10-05-2020", "Manager", 103,
                100000, "Manager",
                20000, 15000
        );

        System.out.println("\n--- Full Time Employee ---");
        emp1.displayDetails();
        System.out.println("CTC: " + emp1.calcCTC(p));

        System.out.println("\n--- Contract Employee ---");
        emp2.displayDetails();
        System.out.println("CTC: " + emp2.calcCTC(p));

        System.out.println("\n--- Manager ---");
        mgr.displayDetails();
        System.out.println("CTC: " + mgr.calcCTC(p));
    }
}