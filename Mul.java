import java.util.Scanner;

public class MultiplyTwoNumbers {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);
        
        // Ask the user for the first number
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        
        // Ask the user for the second number
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();
        
        // Multiply the two numbers
        int result = num1 * num2;
        
        // Print the result
        System.out.println("The multiplication of " + num1 + " and " + num2 + " is: " + result);
    }
}
