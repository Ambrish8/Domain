enum Status 
{
    Running, Failed, Pending, Success;
}
public class enum1 
{
    public static void main(String args[])
    {
        Status[] ss = Status.values();
        for(Status s : ss)
        {
            System.out.println(s + " " + s.ordinal());
        }
        /* System.out.println();
        Status b = Status.Failed;
        System.out.println(b); */
    }
}