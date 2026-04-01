class ContractEmployee extends Employee {
    private int noOfHrs;
    private double hourlyRate;

    public ContractEmployee(String name, String PANNo, String joiningDate, String designation,
                            int empId, int noOfHrs, double hourlyRate) {
        super(name, PANNo, joiningDate, designation, empId);
        this.noOfHrs = noOfHrs;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calcBenefits(Payroll p) {
        return 0; // No benefits for contract employees
    }

    @Override
    public double calcCTC(Payroll p) {
        return noOfHrs * hourlyRate;
    }
}