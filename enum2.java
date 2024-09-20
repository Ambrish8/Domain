enum Status 
{
    Running, Pending, Failed, Success;
}
public class enum2 
{
    public static void main(String args[])
    {
        Status s = Status.Running;
        switch(s)
        {
            case Running: 
            System.out.println("All good");
            break;

            case Pending:
            System.out.println("Please wait");
            break;

            case Failed: 
            System.out.println("Try Again");
            break;

            default:
            System.out.println("Done");
        }
    }
}