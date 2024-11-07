import java.util.Scanner;

public class PrintCharacters {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Loop through each character in the string and print it
        for (int i = 0; i < input.length(); i++) {
            System.out.println("Character at index " + i + ": " + input.charAt(i));
        }

        // Close the scanner
        scanner.close();
    }
}
