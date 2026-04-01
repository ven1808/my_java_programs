class FullTimeEmployee extends Employee {
    protected double perfBonus;
    protected String role;

    public FullTimeEmployee(String name, String PANNo, String joiningDate, String designation,
                            int empId, double perfBonus, String role) {
        super(name, PANNo, joiningDate, designation, empId);
        this.perfBonus = perfBonus;
        this.role = role;
    }

    
    public double calcBenefits(Payroll p) {
        return p.insurance + p.healthInsurance + p.pf;
    }

    
    public double calcCTC(Payroll p) {
        return p.baseSalary + perfBonus + calcBenefits(p);
    }
}