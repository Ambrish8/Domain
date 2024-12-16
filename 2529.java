class Solution {
    public int maximumCount(int[] nums) {
       int ans1=binarySearchPos(nums);
       int ans2=binarySearchNeg(nums);
       return Math.max(ans1,ans2); 
    }
    static int binarySearchPos(int[] nums)
    {
        int countpos=0;
        int start=0;
        int end=nums.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(nums[mid]<=0)
            {
                start=mid+1;
            }
            else
            {
                countpos=nums.length-mid;
                end=mid-1;
            }
        }
        return countpos;
    }
    static int binarySearchNeg(int[] nums)
    {
        int countneg=0;
        int start=0;
        int end=nums.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(nums[mid]<0)
            {
                countneg=mid+1;
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        return countneg;
    }
}
