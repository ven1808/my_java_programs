
class Payroll {
    double insurance;
    double healthInsurance;
    double pf;
    double baseSalary;
    int pto; // Paid leaves

    public Payroll(double baseSalary, double insurance, double healthInsurance, double pf, int pto) {
        this.baseSalary = baseSalary;
        this.insurance = insurance;
        this.healthInsurance = healthInsurance;
        this.pf = pf;
        this.pto = pto;
    }
}