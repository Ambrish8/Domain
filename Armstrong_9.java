//To find Armstrong Number between two given number.
import java.util.*;
public class Armstrong_9
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = ob.nextInt();

        if(isArmstrong(n)==true)
        {
            System.out.println("Number is Armstrong ");
        }
        else
        {
            System.out.println("Number is not Armstrong ");
        }
        ob.close();
    }
    static boolean isArmstrong(int n)
    {
        int original = n;
        int S=0;
        while(n!=0)
        {
            int rem=n%10;
            S = (int) (S + (Math.pow(rem,3)));
            n=n/10;
        }
        if(S==original)
        {
            return true;
        }
        return false;
    }
}