//To calculate Fibonacci Series up to n numbers
import java.util.*;
public class Fibonacci_7
{
    @SuppressWarnings("resource")
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter the reqired range: ");
        int n = ob.nextInt();
        if(n==0)
        {
            System.out.println("0");
        }
        else
        {
            int a=0;
            int b=1;
            int count=2;
            while(count<=n)
            {
                int temp=b;
                b=b+a;
                a=temp;
                count++;
                System.out.print(b+" ");
            }
        }
    }
}