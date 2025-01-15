import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        // Input: Elements of the array
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Calculate the sum of the elements
        int sum = 0;
        for (int num : array) {
            sum += num;
        }

        // Output: Sum of the elements
        System.out.println("The sum of the elements in the array is: " + sum);

        scanner.close();
    }
}
