import java.util.Scanner;
class Q4
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("AMBRISH KALIA 2230143");
        System.out.println("Enter the number");
        int x = sc.nextInt();
        int n = x;
        int n1,n2,cube, sum = 0;
        while(n!=0)
        {
            n1 = n%10;
            n2 = n/10;
            cube = n1*n1*n1;
            n = n2;
            sum = sum + cube;
        } 
        if (sum == x)
        {
            System.out.println("The given number is an Armstrong number");
        }
        else
        {
            System.out.println("The given number is not an Armstrong number");
        }
    }
}