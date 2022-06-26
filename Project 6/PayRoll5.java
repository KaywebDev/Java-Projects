import java.util.Scanner;

public class PayRoll5 {
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int employeeType;
        int employeeN;
        double hoursWorked;
        double payRate;

        System.out.println("salaried = 1, hourly = 2, Intern = 3, Contract = 4, Consultant = 5");
        System.out.print("Enter employee type number from above (use <ctrl> Z or <ctrl> D to exit) > ");

        while(input.hasNext()) {
            employeeType = input.nextInt();

            switch (employeeType) {
                case 1:
                    double yearlySalary;
                    System.out.print("Enter the employee number: ");
                    employeeN = input.nextInt();
                    System.out.print("Enter the yearly salary for this employee: ");
                    yearlySalary = input.nextDouble();
                    System.out.printf("Employee number: %d, gross pay for this week: $%.2f%n", employeeN, grossPay(employeeN, yearlySalary));
                    break;
                case 2:
                    System.out.print("Enter the employee number: ");
                    employeeN = input.nextInt();
                    System.out.print("Enter the pay rate: ");
                    payRate = input.nextDouble();
                    System.out.print("Enter number of hours worked: ");
                    hoursWorked = input.nextDouble();
                    System.out.printf("Employee number: %d, gross pay for this week: $%.2f%n", employeeN, grossPay(employeeN, hoursWorked, payRate));
                    break;
                case 3:
                    int institutionCode;
                    int departmentCode;
                    System.out.print("Enter intern's institution code: ");
                    institutionCode = input.nextInt();
                    System.out.print("Enter intern's department code: ");
                    departmentCode = input.nextInt();
                    System.out.print("Enter the pay rate: ");
                    payRate = input.nextDouble();
                    System.out.print("Enter number of hours worked: ");
                    hoursWorked = input.nextDouble();
                    System.out.printf("institution code: %d, department Code: %d, gross pay for this week: $%.2f%n", institutionCode, departmentCode, grossPay(institutionCode, departmentCode, hoursWorked, payRate));
                    break;
                case 4:
                    int companyNumber;
                    int projectNumber;
                    System.out.print("Enter contract worker's company number: ");
                    companyNumber = input.nextInt();
                    System.out.print("Enter contract worker's project number: ");
                    projectNumber = input.nextInt();
                    System.out.print("Enter contract worker's employee number: ");
                    employeeN = input.nextInt();
                    System.out.print("Enter the pay rate: ");
                    payRate = input.nextDouble();
                    System.out.print("Enter number of hours worked: ");
                    hoursWorked = input.nextDouble();
                    System.out.printf("Company number: %d, project number: %d, employee number: %d, gross pay for this week: $%.2f%n", companyNumber, projectNumber, employeeN, grossPay(companyNumber, projectNumber, employeeN, hoursWorked, payRate));
                    break;
                case 5:
                    String consultantLastName;
                    String consultantFirstName;
                    System.out.print("Enter Consultant's last name: ");
                    consultantLastName = input.next();
                    System.out.print("Enter Consultant's first name: ");
                    consultantFirstName = input.next();
                    System.out.print("Enter Consultant's Id number: ");
                    employeeN = input.nextInt();
                    System.out.print("Enter the pay rate: ");
                    payRate = input.nextDouble();
                    System.out.print("Enter number of hours worked: ");
                    hoursWorked = input.nextDouble();
                    System.out.printf("Consultant's last name: %s, Consultant's first name: %s, Consultant's Id number: %d, gross pay for this week: $%.2f%n", consultantLastName, consultantFirstName, employeeN, grossPay(consultantLastName, consultantFirstName, employeeN, hoursWorked, payRate));
                    break;
                default:
                    System.out.printf("Did not understand input > '%d'%n", employeeType);
            }
            System.out.println("salaried = 1, hourly = 2, Intern = 3, Contract = 4, Consultant = 5");
            System.out.print("Enter employee type number from above (use <ctrl> Z or <ctrl> D to exit) > ");
        }
        System.out.println("GoodBye!");
    }
    public static double grossPay(int employeeN, double annualSalary) {
        return annualSalary/52.0;
    }
    public static double grossPay(int employeeN, double hoursWorked, double payRate) {
        if (hoursWorked > 50) {
            while (hoursWorked > 50) {
                System.out.print("Number of hours worked by employee of this type can't exceed 50!\n");
                System.out.print("Enter hours worked by employee again: ");
                hoursWorked = input.nextDouble();
            }
        }

        if (hoursWorked <= 40) {
            return hoursWorked * payRate;
        } else {
            return  (40 * payRate) + ((hoursWorked - 40) * (1.5 * payRate));
        }
    }
    public static double grossPay(int institutionCode, int departmentCode, double hoursWorked, double payRate) {
        if (hoursWorked > 20) {
            while (hoursWorked > 20) {
                System.out.print("Number of hours worked by employee of this type can't exceed 20!\n");
                System.out.print("Enter hours worked by employee again: ");
                hoursWorked = input.nextDouble();
            }
        }

        if (hoursWorked > 15) {
            return  (15 * payRate) + ((hoursWorked - 15) * (1.25 * payRate));
        } else {
            return hoursWorked * payRate;
        }
    }
    public static double grossPay(int companyNumber, int projectNumber, int employeeNumber, double hoursWorked, double payRate) {
        if (hoursWorked > 40) {
            while (hoursWorked > 40) {
                System.out.print("Number of hours worked by employee of this type can't exceed 40!\n");
                System.out.print("Enter hours worked by employee again: ");
                hoursWorked = input.nextDouble();
            }
        }

        return hoursWorked * payRate;
    }
    public static double grossPay(String consultantLastName, String consultantFirstName, int consultantIDNumber, double hoursWorked, double payRate) {
        if (hoursWorked > 50) {
            while (hoursWorked > 50) {
                System.out.print("Number of hours worked by employee of this type can't exceed 50!\n");
                System.out.print("Enter hours worked by employee again: ");
                hoursWorked = input.nextDouble();
            }
        }
        return hoursWorked * payRate;
    }
}
