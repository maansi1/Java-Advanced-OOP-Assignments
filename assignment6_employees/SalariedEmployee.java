package assignment6_employees;

public class SalariedEmployee implements Payable {

    private final double annualSalary;

    public SalariedEmployee(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    @Override
    public double calculatePay() {
        return annualSalary / 12.0;
    }
}
