public class TemporaryEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public TemporaryEmployee(String first, String last, int id, int hoursWorked, double hourlyRate) {
        super(first, last, id);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public double earnings() {
        if (hoursWorked <= 160) {
            return hoursWorked * hourlyRate;
        } else {
            return (160 * hourlyRate) + ((hoursWorked - 160) * hourlyRate * 1.5);
        }
    }

    public String toString() {
        return super.toString() + ", Type: Temporary, Hours Worked: " + hoursWorked + ", Hourly Rate: " + hourlyRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}
