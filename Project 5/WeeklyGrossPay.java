import java.util.Scanner;

public class WeeklyGrossPay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double grossPay;
        double hoursWorked;
        double payRate;
        int employeeType;
        String idNumber;

        System.out.print("\nEnter the employee type (1 for regular, 2 for temp, <ctrl> Z of <ctrl> D to exit): ");

        while (input.hasNext()) {
            employeeType = input.nextInt();

	    if (employeeType != 1 && employeeType != 2)
            	break;

            System.out.print("Enter number of hours worked this week: ");
            hoursWorked = input.nextDouble();
            System.out.print("Enter the pay rate for this employee: ");
            payRate = input.nextDouble();

            switch (employeeType) {
                case 1:
                    System.out.print("Enter the employee ID number: ");
                    idNumber = input.next();
                    if (!idNumber.startsWith("R")) {
                        System.out.printf("%nNot a valid ID number for regular employee, %s", idNumber);
                        break;
                    }
                    if (hoursWorked <= 40) {
                        grossPay = hoursWorked * payRate;
                    } else {
                        grossPay = (40 * payRate) + ((hoursWorked - 40) * (1.5 * payRate));
                    }
                    System.out.printf("%n%s%20s%n", "Employee ID number", "Gross pay");
                    System.out.printf("%s$%,20.2f%n", idNumber, grossPay);
                    break;
                case 2:
                    System.out.print("Enter the temp employee ID number: ");
                    idNumber = input.next();
                    if (!idNumber.startsWith("T")) {
                        System.out.printf("%nNot a valid ID number for temp employee, %s", idNumber);
                        break;
                    }
                    grossPay = hoursWorked * payRate;
                    System.out.printf("%n%s%20s%n", "Employee ID number", "Gross pay");
                    System.out.printf("%s%,20.2f%n", idNumber, grossPay);
                    break;
            }
            System.out.print("\nEnter the employee type (1 for regular, 2 for temp, <ctrl> Z of <ctrl> D to exit): ");
        }
    }
}
