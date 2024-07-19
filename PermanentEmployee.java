public class PermanentEmployee extends Employee {
    private double monthlySalary;

    public PermanentEmployee(String first, String last, int id, double monthlySalary) {
        super(first, last, id);
        this.monthlySalary = monthlySalary;
    }

    public double earnings() {
        return monthlySalary;
    }

    public String toString() {
        return super.toString() + ", Type: Permanent, Monthly Salary: " + monthlySalary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }
}
