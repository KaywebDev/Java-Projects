public class Pay {
    private final String employeeID;
    private final double numberOfHoursWorked;
    private final double payRate;

    public Pay(String employeeID, double numberOfHoursWorked, double payRate) {
        this.employeeID = employeeID;

        if (numberOfHoursWorked < 0 || numberOfHoursWorked > 50) {
            throw new IllegalArgumentException("Hours worked is out of range");
        } else if (payRate < 0 || payRate > 85.00) {
            throw new IllegalArgumentException("Pay rate is out of range");
        } else {
            this.numberOfHoursWorked = numberOfHoursWorked;
            this.payRate = payRate;
        }
    }

    public double payCalc(double numberOfHoursWorked, double payRate) {
        double grossPay;
        if (numberOfHoursWorked <= 40) {
            grossPay = numberOfHoursWorked * payRate;
        } else {
            grossPay = (40 * payRate) + ((numberOfHoursWorked - 40) * (1.5 * payRate));
        }
        return grossPay;
    }

    public String toString() {
        return String.format("%nEmployee ID: %s,%nNumber of hours worked: %.2f,%nPay Rate: %.2f,%nGross Pay: $%.2f%n", employeeID, numberOfHoursWorked, payRate, payCalc(numberOfHoursWorked, payRate));
    }
}
