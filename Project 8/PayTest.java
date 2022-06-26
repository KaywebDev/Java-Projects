import java.util.Scanner;

public class PayTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pay employee;
        String employeeID;
        double numberOfHoursWorked;
        double payRate;

        System.out.print("Enter employee ID. (use <ctrl> Z or <ctrl> D to exit) > ");


        while (input.hasNext()) {
            employeeID = input.next();
            System.out.print("Enter hours worked > ");
            numberOfHoursWorked = input.nextDouble();
            System.out.print("Enter pay rate > ");
            payRate = input.nextDouble();

            try {
                employee = new Pay(employeeID, numberOfHoursWorked, payRate);
            } catch (Exception e) {
                System.out.print("Invalid input > " + e.getMessage());
                System.out.print("\nEnter employee ID again -> ");
                continue;
            }

            System.out.println("\nEmployee info: " + employee);

            System.out.print("Enter employee ID. (use <ctrl> Z or <ctrl> D to exit) > ");
        }
    }
}
