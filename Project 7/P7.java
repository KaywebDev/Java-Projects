import java.util.Arrays;
import java.security.SecureRandom;

public class P7 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int counter = 0;
        SecureRandom randomInt = new SecureRandom();
        while (counter < 10) {
            int newInt = randomInt.nextInt(100)+1;
            if (Arrays.stream(array).noneMatch(x -> x == newInt)) {
                array[counter] = newInt;
                counter++;
            }
        }
        System.out.print("All 10 numbers unsorted: ");
        displayArray(array);
        System.out.print("\nAll 10 numbers sorted in ascending order: ");
        displayArray(array, true);
    }
    public static void displayArray(int[] array) {
        for (int value: array) {
            System.out.printf("%d ", value);
        }
    }
    public static void displayArray(int[] array, Boolean inOrder) {
        if (inOrder) {
            Arrays.sort(array);
            for (int value: array) {
                System.out.printf("%d ", value);
            }
        }
    }
}
