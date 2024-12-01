import java.util.Scanner;

public class ques3 {
    public static void main(String[] args) {
        System.out.print("AMBRISH KALIA 2230143 ");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = scanner.nextDouble();

        // Calculate the area
        double area = length * breadth;

        // Calculate the perimeter
        double perimeter = 2 * (length + breadth);

        // Print the results
        System.out.println("The area of the rectangle is: " + area);
        System.out.println("The perimeter of the rectangle is: " + perimeter);
    }
}