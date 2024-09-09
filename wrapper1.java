public class wrapper1
{
    public static void main(String args[])
    {
        int num=9;
        Integer num1 = num;    //Autoboxing

        int num2 = num1;   //Auto-unboxing

        String str ="24";
        int num3 = Integer.parseInt(str);   //helps in converting other types into int

        System.out.println(num3*3);

        System.out.println(num2);
        System.out.println(num1);
    }
}