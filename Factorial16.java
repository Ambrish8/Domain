public class Factorial {
    public static void main(String[] args) {
        int number = 16; // The number for which we want the factorial
        long factorial = 1; // Use 'long' to handle large numbers

        for (int i = 1; i <= number; i++) {
            factorial *= i; // Multiply each number up to 16
        }

        System.out.println("The factorial of " + number + " is: " + factorial);
    }
}
