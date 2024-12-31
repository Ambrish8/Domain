public class Rotation_count
{
    public static void main(String args[])
    {
        //int[] nums={4,5,6,7,0,1,2};
        //int[] nums={1,2,3,4,5,6};
        int[] nums={2,5,6,0,0,1,2};
        System.out.println(countRotations(nums));
    }
    @SuppressWarnings("unused")
    private static int countRotations(int[] nums)
    {
        int pivot=findpivotduplicates(nums);
        return pivot+1;
    }
    //for duplicates
    static int findpivotduplicates(int[] nums)
    {
        int start=0;
        int end=nums.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(mid<end && nums[mid]>nums[mid+1])
            {
                return mid;
            }
            if(mid>start && nums[mid]<nums[mid-1])
            {
                return mid-1;
            }
            if(nums[start]==nums[mid] && nums[mid]==nums[end])
            {
                if(start<end && nums[start]>nums[start+1])
                {
                    return start;
                }
                start++;
                if(end>start && nums[end]<nums[end-1])
                {
                    return end-1;
                }
                end--;
            }
            else if(nums[start]<nums[mid] || nums[start]==nums[mid] && nums[end]<nums[mid])
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        return -1;
    }
    //for non duplicates
    static int findpivot(int[] nums)
    {
        int start=0;
        int end=nums.length-1;
        while(start<=end)
        {
            //4 cases 
            int mid=start+(end-start)/2;
            if(mid<end && nums[mid]>nums[mid+1])
            {
                return mid;
            }
            if(mid>start && nums[mid]<nums[mid-1])
            {
                return mid-1;
            }
            if(nums[mid]<=nums[start])
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        return -1;
    }
}
