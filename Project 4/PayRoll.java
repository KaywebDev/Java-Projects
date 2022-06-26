import java.util.Scanner;

public class PayRoll {
    public static void main(String[] args) {
        double hoursWorked = 0.00;
        double payRate = 0.00;
        double grossPay;
        double totalPay = 0.00;
        double averageGrossPay;
        int numberOfEmployee = 0;
        Scanner input = new Scanner(System.in);

        while ((hoursWorked >= 0) && (payRate >= 0)) {
            grossPay = 0.00;
            System.out.print("Enter number of hours employee worked (using negative value to quit) ");
            hoursWorked = input.nextDouble();
            System.out.print("Enter employee pay rate (using negative value to quit) ");
            payRate = input.nextDouble();
            if ((hoursWorked >= 0) && (payRate >= 0)) {
                if (hoursWorked <= 40) {
                    grossPay = hoursWorked * payRate;
                    totalPay += grossPay;
                } else if (hoursWorked < 50) {
                    grossPay = (40*payRate) + ((hoursWorked - 40) * (1.5 * payRate));
                    totalPay += grossPay;
                } else if (hoursWorked > 50) {
                    grossPay = (40 * payRate) + ((hoursWorked - 40) * (1.5 * payRate)) + ((hoursWorked - 50) * (2 * payRate));
                    totalPay += grossPay;
                }
                System.out.printf("%nGross pay for this employee is $%.2f%n", grossPay);
                numberOfEmployee += 1;
            }
        }
        if (numberOfEmployee >= 1) {
            averageGrossPay = totalPay / numberOfEmployee;
            System.out.printf("%nTotal pay for %d employees was: $%.2f%n", numberOfEmployee, totalPay);
            System.out.printf("Total average gross pay for %d employees: $%.2f", numberOfEmployee, averageGrossPay);
        } else {
            System.out.println("\nNo payroll data was processed");
        }
    }
}
