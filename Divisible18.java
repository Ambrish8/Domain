import java.util.Scanner;

public class DivisibleBy18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input range from user
        System.out.print("Enter the starting number: ");
        int start = scanner.nextInt();

        System.out.print("Enter the ending number: ");
        int end = scanner.nextInt();

        System.out.println("Numbers divisible by 18 in the range " + start + " to " + end + " are:");

        for (int i = start; i <= end; i++) {
            if (i % 18 == 0) {
                System.out.println(i);
            }
        }
        
        scanner.close();
    }
}
