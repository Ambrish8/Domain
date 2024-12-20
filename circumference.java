import java.util.Scanner;

public class CircumferenceOfCircle {
    public static void main(String[] args) {
        // Create a scanner object for input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the radius of the circle
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        
        // Calculate the circumference
        double circumference = 2 * Math.PI * radius;
        
        // Print the circumference
        System.out.printf("The circumference of the circle is: %.2f%n", circumference);
        
        // Close the scanner
        scanner.close();
    }
}
