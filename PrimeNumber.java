import java.util.*;
public class PrimeNumber 
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = ob.nextInt();
        boolean ans = isPrime(n);
        System.out.println(ans);
    }
    static boolean isPrime(int n)  //non static method cannot be referenced to a static method
    {
        if(n<=1)
        {
            return false;
        }
        int c = 2;
        while(c*c<=n)
        {
            if(n%c==0)
            {
                return false;
            }
            c++;
        }
        if(c*c>n)
        {
            return true;
        }
        return false; 
    }
}