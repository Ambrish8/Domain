import java.util.Scanner;
public class thirty
{
public static void main(String[] args)
{
   Scanner ob= new Scanner(System.in);
   System.out.print("Enter the number of elements in the series");
   int n=ob.nextInt();
   int sum = 0;
   int a= 0;
   int b = 1;
   System.out.println("Fibonacci series: " + a + " " + b + " ");
   for(int i= 0;i<n-2;i++)
   {
     sum = a+b;
     a=b;
     b=sum;
     System.out.print(sum+ " ");
   }
}
}