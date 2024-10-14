class A 
{
    public A()
    {
        System.out.println("object created ");
    }
    public void show()
    {
        System.out.println("in the show");
    }
}
public class anonymousObject
{
    public static void main(String args[])
    {
        new A().show();  //Anonymous object can be used only once.
    }
}