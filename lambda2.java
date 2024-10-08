interface A 
{
    int add(int i, int j);
}
public class lambda2 
{
    public static void main(String args[])
    {
        A obj = (i,j) -> i+j;
        int result = obj.add(4,5);
        System.out.println(result);
    }
}