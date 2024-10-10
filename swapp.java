import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        
        a = a + b; // Step 1: a now contains the sum of both numbers
        b = a - b; // Step 2: b now contains the original value of a
        a = a - b; // Step 3: a now contains the original value of b

        
        System.out.println("After swapping: ");
        System.out.println("First number: " + a);
        System.out.println("Second number: " + b);
    }
}
