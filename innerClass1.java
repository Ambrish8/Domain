class A 
{
    public void show()
    {
        System.out.println("in show ");
    }
    class B 
    {
        public void config()
        {
            System.out.println("in configuration ");
        }
    }
}
public class innerClass1 
{
    public static void main(String args[])
    {
        A obj = new A();
        obj.show();
        A.B obj1 = obj.new B();
        obj1.config();
    }
}