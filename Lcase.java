import java.util.Scanner;

public class LowercaseConverter {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a sentence
        System.out.println("Enter a sentence:");

        // Read the input sentence
        String sentence = scanner.nextLine();

        // Convert the sentence to lowercase
        String lowercaseSentence = sentence.toLowerCase();

        // Print the lowercase sentence
        System.out.println("Sentence in lowercase:");
        System.out.println(lowercaseSentence);

        // Close the scanner
        scanner.close();
    }
}
