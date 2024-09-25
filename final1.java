//final :- variable, method, class
final class Calc
{
    public void show()
    {
        System.out.println("in Calc show");
    }
    public void add(int n1, int n2)
    {
        System.out.println(n1+n2);
    }
}
/* class AdvCalc extends Calc
{
    public void show()
    {
        System.out.println("in AdvCalc show");
    }
} */
public class final1  //same is over method, if it is declared final, no other method can override it.
{
    public static void main(String args[])
    {
        final int num = 8;
        //num = 9;
        System.out.println(num);
        Calc ob = new Calc();
        ob.show();
        ob.add(3,1);
    }
}