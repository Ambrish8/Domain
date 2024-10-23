import java.util.Scanner;

public class RightAngledTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of rows for the triangle
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        // Outer loop for number of rows
        for (int i = 1; i <= rows; i++) {
            // Inner loop to print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Move to the next line after printing each row
            System.out.println();
        }

        scanner.close();
    }
}
