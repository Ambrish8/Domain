public class OrderAgnosticBS
{
    public static void main(String args[])
    {
        //int[] arr={-28,-23,-18,-12,0,3,5,7,34,66,78,99};
        int[] arr={98,87,63,34,6,4,3,2,0};
        int target=324;
        int ans=orderAgnosticBS(arr,target);
        System.out.println(ans);
    }
    static int orderAgnosticBS(int[] arr, int target)
    {
        int start=0;
        int end=arr.length-1;
        //find whether the array is sorted in ascending or descending
        boolean isAsc=arr[start]<arr[end];

        while(start<=end)
        {
            int mid=start+(end-start)/2;

            if(arr[mid]==target)
            {
                return mid;
            }

            if(isAsc)
            {
                if(target<arr[mid])
                {
                    end=mid-1;
                }
                else
                {
                    start=mid+1;
                }
            }
            else
            {
                if(target>arr[mid])
                {
                    end=mid-1;
                }
                else
                {
                    start=mid+1;
                }
            }
        }
        return -1;
    }
}