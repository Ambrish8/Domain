public class Factorial {
    public static void main(String[] args) {
        int number = 7; // Number to calculate factorial
        long factorial = 1; // To store the factorial result
        
        // Loop to calculate factorial
        for (int i = 1; i <= number; i++) {
            factorial *= i; // Multiply each number
        }
        
        // Print the result
        System.out.println("The factorial of " + number + " is: " + factorial);
    }
}
