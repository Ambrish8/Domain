import java.util.*;
public class factorial_9
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = ob.nextInt();
        Factorial(n);
        ob.close();
    }
    static void Factorial(int n)
    {
        int f=1;
        for(int i=1;i<=n;i++)
        {
            f=f*i;
        }
        System.out.println("The factorial of the number is: "+f);
    }
}