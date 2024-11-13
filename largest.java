import java.util.*;
public class largest
{
     public static void main(String[] args)
     {
         
         int a,b,c;
         Scanner sc=new Scanner(System.in);
         System.out.println("-----Ambrish Kalia_2230143-----");
         System.out.println("Enter value of a");
         a=sc.nextInt();
         sc.nextLine();
         System.out.println("Enter value of b");
         b=sc.nextInt();
         sc.nextLine();
         System.out.println("Enter value of c");
         c=sc.nextInt();
         sc.nextLine();
            if(a>b && a>c)
         {
             System.out.println("a is the largest number ");
         }
            if(b>a && b>c)
         {
            System.out.println("b is the largest number ");
         }
            if(c>a && c>b)
         {
            System.out.println("c is the largest number ");
         } 
      }
}
