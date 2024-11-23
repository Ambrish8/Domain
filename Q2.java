import java.util.Scanner;
class Q2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("AMBRISH KALIA 2230143 ");
        System.out.println("Enter the 3 numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int largest = (a>b)?((a>c)?a:c):((b<c)?b:c);
        System.out.println("The largest of the 3 numbers is: "+largest);   
    }
}