import java.util.HashSet;
import java.util.Scanner;

public class DistinctAlphabets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the sentence
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();

        // Create a HashSet to store distinct alphabets
        HashSet<Character> distinctAlphabets = new HashSet<>();

        // Iterate through the sentence
        for (char ch : sentence.toCharArray()) {
            // Check if the character is an alphabet
            if (Character.isLetter(ch)) {
                // Convert to lowercase to ignore case and add to the set
                distinctAlphabets.add(Character.toLowerCase(ch));
            }
        }

        // Output the number of distinct alphabets
        System.out.println("Number of distinct alphabets: " + distinctAlphabets.size());

        scanner.close();
    }
}
