import java.util.Scanner;
class Q5
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("AMBRISH KALIA 2230143");
        System.out.println("Enter the number of elements for series:");
        int n = sc.nextInt();
        int sum = 0;
        int a = 0;
        int b = 1;
        System.out.print("Fibonacci series: "+a+" "+b+" ");
        for (int i=0; i<n-2; i++)
        {
            sum = a+b;
            a = b;
            b = sum;
            System.out.print(sum+" ");
        }   
    }
}