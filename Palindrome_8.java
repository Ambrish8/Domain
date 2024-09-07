//To find out whether the given String is Palindrome or not.
import java.util.*;
public class Palindrome_8
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = ob.next(); 

        str=str.toLowerCase();

        if(isPalindrome(str)==true)
        {
            System.out.println("String is palindrome ");
        }
        else
        {
            System.out.println("String is not palindrome ");
        }
        ob.close();
    }
    static boolean isPalindrome(String str)
    {
        int left=0;
        int right=str.length()-1;
        while(left<right)
        {
            if(str.charAt(left)!=str.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}