import java.util.Scanner;

public class p_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1;
        int number2;

        System.out.print("Enter the first integer: ");
        number1 = input.nextInt();

        System.out.print("\nEnter the second integer: ");
        number2 = input.nextInt();

        System.out.printf("\nThe sum of the two integers is %d%n", (number1+number2));
        System.out.printf("\nThe product of the two integers is %d%n", (number1*number2));

        if (number1 == number2)
            System.out.println("\nBoth numbers are equal");
        else if (number1 > number2){
            System.out.printf("\nThe larger of the two integers is %d%n", number1);
            System.out.printf("\nThe smaller of the two integers is %d%n", number2);
        } else {
            System.out.printf("\nThe larger of the two integers is %d%n", number2);
            System.out.printf("\nThe smaller of the two integers is %d%n", number1);
        }
    }
}
