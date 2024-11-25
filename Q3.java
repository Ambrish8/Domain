import java.util.Scanner;
import java.lang.Math;
class Q3
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("AMBRISH KALIA 2230143");
        System.out.println("Enter the coordinates: ");
        double x = sc.nextInt();
        double y = sc.nextInt();
        double r = Math.pow(5,2);
        double x1 = Math.pow(x,2);
        double y1 = Math.pow(y,2);
        if (x1+y1 < r) 
        {
            System.out.println("The point lies within the circle");
        }
        else if (x1+y1 > r) 
        {
            System.out.println("The point lies outside the circle");
        }
        else if (x1+y1 == r) 
        {
            System.out.println("The point lies on the circle");
        }
           
    }
}