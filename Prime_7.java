import java.util.*;
public class Prime_7
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = ob.nextInt();

        if(isPrime(n))
        {
            System.out.println("Number is prime number: ");
        }
        else
        {
            System.out.println("Number is not prime number: ");
        }
        ob.close();
    }
    static boolean isPrime(int n)
    {
        if(n<=1)
        {
            return false;
        };
        for(int c=2;c*c<=n;c++)
        {
            if(n%c==0)
            {
                return false;
            }
        }
        return true;
    }
}