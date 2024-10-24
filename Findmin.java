public class Findmin
{
    public static void main(String[] args)
    {
        int[] arr={18,12,-7,3,14,28};
        System.out.println(min(arr));
    }
    static int min(int[] arr)
    {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        return min;
    }
}