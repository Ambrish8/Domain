class A 
{
    public void showThatBelongstoThisClass()
    {
        System.out.println("in A show ");
    }
}
class B extends A
{
    @Override
    public void showThatBelongstoThisClass()
    {
        System.out.println("in B show ");
    }
}
public class annotations1 
{
    public static void main(String args[])
    {
        A obj = new A();
        obj.showThatBelongstoThisClass();
    }
}