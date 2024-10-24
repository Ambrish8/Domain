public class Findmax
{
    public static void main(String args[])
    {
        int[][] arr={
            {23,4,1},
            {18,12,13,9},
            {78,99,34,56},
            {18,12}
        };
        System.out.println(max(arr));
    }
    static int max(int[][] arr)
    {
        int maxelement=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                if(arr[i][j]>maxelement)
                {
                    maxelement=arr[i][j];
                }
            }
        }
        return maxelement;
    }
}