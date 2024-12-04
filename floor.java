public class floor
{
    public static void main(String args[])
    {
        int[] arr={-28,-23,-18,-12,0,3,5,7,34,66,78,99};
        int target=33;
        int ans=Floor(arr,target);
        System.out.println(ans);
    }
    static int Floor(int[] arr, int target)
    {
        int start=0;
        int end=arr.length-1;
        if(target>arr[end])
        {
            return -1;
        }
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(target<arr[mid])
            {
                end=mid-1;
            }
            else if(target>arr[mid])
            {
                start=mid+1;
            }
            else
            {
                return mid;
            }
        }
        return end;
    }
}