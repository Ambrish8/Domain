import java.util.*;
public class Occurence
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter the number to find ");
        int n = ob.nextInt();
        int a = 463438473;
        int count = 0;
        while(a>0)
        {
            int rem = a%10;
            if(rem==n)
            {
                count++;
            }
            a=a/10;
        }
        System.out.println("The number of times digit appered is: "+count);
    }
}