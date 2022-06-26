import java.util.Scanner;

public class BPACETest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int employeeType;
        String firstName;
        String lastName;
        String socialSecurityNumber;
        double grossSales;
        double commissionRate;

        System.out.print("Enter 1 for commission, 2 for base plus commission employee or <ctrl> z or d to exit");
        System.out.print("\n->> ");

        while (input.hasNext()) {
            employeeType = input.nextInt();

            System.out.print("Enter employee's first name -> ");
            firstName = input.next();
            System.out.print("Enter employee's last name -> ");
            lastName = input.next();
            System.out.print("Enter employee's SSN -> ");
            socialSecurityNumber = input.next();

            switch (employeeType) {
                case 1:
                    CommissionEmployee cEmployee = new CommissionEmployee(firstName, lastName, socialSecurityNumber, 0.0, 0.1);
                    while (true) {
                        try {
                            System.out.print("Enter employee's gross sales -> ");
                            grossSales = input.nextDouble();
                            cEmployee.setGrossSales(grossSales);
                            break;
                        } catch (IllegalArgumentException e) {
                            System.out.println("Invalid input, " + e.getMessage());
                        }
                    }
                    while (true) {
                        try {
                            System.out.print("Enter employee's commission rate -> ");
                            commissionRate = input.nextDouble();
                            cEmployee.setCommissionRate(commissionRate);
                            break;
                        } catch (IllegalArgumentException e) {
                            System.out.println("Invalid input, " + e.getMessage());
                        }
                    }
                    System.out.print("\n");
                    System.out.println(cEmployee);
                    break;
                case 2:
                    double baseSalary;
                    BasePlusCommissionEmployee bEmployee = new BasePlusCommissionEmployee(firstName, lastName, socialSecurityNumber, 0.0, 0.1, 0.0);
                    while (true) {
                        try {
                            System.out.print("Enter employee's gross sales -> ");
                            grossSales = input.nextDouble();
                            bEmployee.setGrossSales(grossSales);
                            break;
                        } catch (IllegalArgumentException e) {
                            System.out.println("Invalid input, " + e.getMessage());
                        }
                    }
                    while (true) {
                        try {
                            System.out.print("Enter employee's commission rate -> ");
                            commissionRate = input.nextDouble();
                            bEmployee.setCommissionRate(commissionRate);
                            break;
                        } catch (IllegalArgumentException e) {
                            System.out.println("Invalid input, " + e.getMessage());
                        }
                    }
                    while (true) {
                        try {
                            System.out.print("Enter employee's base salary -> ");
                            baseSalary = input.nextDouble();
                            bEmployee.setBaseSalary(baseSalary);
                            break;
                        } catch (IllegalArgumentException e) {
                            System.out.println("Invalid input, " + e.getMessage());
                        }
                    }
                    System.out.print("\n");
                    System.out.println(bEmployee);
            }
            System.out.print("\nEnter 1 for commission, 2 for base plus commission employee or <ctrl> z or d to exit");
            System.out.print("\n->> ");
        }
    }
}
