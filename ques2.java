import java.util.Scanner;

public class ques2 {
   public static void main(String[] args) {
       System.out.println("AMBRISH KALIA 2230143");
       Scanner scanner = new Scanner(System.in);

       System.out.print("Enter the radius of the circle: ");
       double radius = scanner.nextDouble();

       // Calculate the area
       double area = Math.PI * radius * radius;

       // Calculate the circumference
       double circumference = 2 * Math.PI * radius;

       // Print the results
       System.out.println("The area of the circle is: " + area);
       System.out.println("The circumference of the circle is: " + circumference);
   }
}