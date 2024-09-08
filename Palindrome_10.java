import java.util.*;
public class Palindrome_10
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = ob.nextInt();

        if(isPalindrome(n))
        {
            System.out.println("Number is palindrome: ");
        }
        else
        {
            System.out.println("Number is not palindrome: ");
        }
        ob.close();
    }
    static boolean isPalindrome(int n)
    {
        int rem=0;
        int reverse=0;
        int original=n;
        while(n!=0)
        {
            rem=n%10;
            reverse=reverse*10+rem;
            n=n/10;
        }
        if(reverse==original)
        {
           return true; 
        }
        return false;
    }
}